package thread;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

/**
 * 模拟王者荣耀加载游戏界面
 */
public class Demo12 {
    public static final int COUNT = 10;
    static int idx;

    public static void main(String[] args) {
        //1.手动输入信息。
        Scanner scan = new Scanner(System.in);
        //2.开始初始化信息
        //2.1手动输入character.initOnKey(scan);
        //2.3数据库导入
        Character[] characters = new Character[COUNT];
        Character.initByMysql(characters);
        //构建一个线程
        for (Character c : characters) {
            Thread thread = new Thread(new DownLoadThread(c));
            thread.start();
        }
    }
}

class DownLoadThread implements Runnable {
    Character character;

    public DownLoadThread(Character character) {
        this.character = character;
    }

    @Override
    public void run() {
        gameLoad();
    }

    public void gameLoad() {
        try {
            System.out.println(this.character.getPlayerName() + "：" + this.character.getCharacterName() + "开始加载……");
            Thread.sleep(this.character.getLoadTime());
            synchronized (Demo12.class) {
                Demo12.idx++;
                if (Demo12.idx < Demo12.COUNT) Demo12.class.wait();
                else Demo12.class.notifyAll();
                System.out.println(this.character.getPlayerName() + "：" + this.character.getCharacterName() + "进入游戏……");
            }
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}

class Character {
    private String characterName, playerName;
    private int loadTime, playerId;

    public Character(int playerId) {
        this.playerId = playerId;
    }

    public Character(int playerId, String playerName, String characterName, int loadTime) {
        this.characterName = characterName;
        this.playerName = playerName;
        this.loadTime = loadTime;
        this.playerId = playerId;
    }

    public void initOnKey(Scanner scan) {
        System.out.println("请输入玩家" + playerId + "的名字：");
        this.playerName = scan.next();
        System.out.println("请输入该玩家选择的英雄：");
        this.characterName = scan.next();
        System.out.println("请输入该玩家加载的时常：");
        this.loadTime = scan.nextInt();

    }

    public static void initByMysql(Character[] characters) {
        try {
            //Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/heros?useSSL=false&serverTimezone=UTC";
            String userName = "root";
            String password = "abc123";
            Connection connection = JdbcTest.getConnection(url, userName, password);
            String sql = "select * from heroes";
            PreparedStatement ps = connection.prepareStatement(sql);
            //ps.setNString(1,"heroes");
            ResultSet rs = ps.executeQuery();
            int idx = 0;
            while (rs.next()) {
                Character character;
                character = new Character(rs.getInt(1),
                        rs.getNString(2), rs.getNString(3), rs.getInt(4));
                characters[idx++] = character;
            }
            JdbcTest.closeConnection(connection);
            JdbcTest.closeStatement(ps);
            JdbcTest.closeResultSet(rs);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public int getPlayerId() {
        return playerId;
    }

    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }

    public String getCharacterName() {
        return characterName;
    }

    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getLoadTime() {
        return loadTime;
    }

    public void setLoadTime(int loadTime) {
        this.loadTime = loadTime;
    }
}