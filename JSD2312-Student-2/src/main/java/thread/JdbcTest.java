package thread;

import java.sql.*;

/**
 * 数据库调用步数
 * 1.加载数据库驱动
 * 2.根据url,端口号,用户名和密码，通过DriverManager.getConnection(String url,String userName,String password)获得connection对象
 * 以此对象来建立连接。
 * 3.根据连接构建交互的对象--PrepareStatement or PreparedStatement，写入sql语句来进行相关操作
 * 4.若为查询数据，则应该通过ResultSet 对象来获得结果集。
 * 5.结束操作，关闭连接和查询对象。
 * 使用该类完成对驱动的加载，以及得到Driver对象，以及关闭各个连接
 */
public abstract class JdbcTest {

    private JdbcTest(){}
    //加载指定的驱动
    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    public static Connection getConnection(String url,String userName,String password)
    {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(url,userName,password);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return connection;
    }
    public static void closeConnection(Connection conn)
    {
        try {
            conn.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void closeStatement(Statement state)
    {
        try {
            state.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void closeResultSet(ResultSet rs)
    {
        try {
            rs.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
