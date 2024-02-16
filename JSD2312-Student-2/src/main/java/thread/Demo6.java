package thread;

/**
 * synchronized
 *
 */
class Bank {
    private int money;

    Bank() {
    }

    public Bank(int money) {
        this.money = money;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public synchronized void takeMoney(int money) {
        if (this.money >= money) {
            this.money -= money;
            System.out.println("取钱成功！余额剩余：" + this.money);
        } else System.out.println("取钱失败！");
    }
}

public class Demo6 {
    private static Bank bank = new Bank(20000);

    public static void main(String[] args) {
        //1.张三取钱
        new Thread(() -> {
                bank.takeMoney(20000);
        }).start();
        //2.老六取钱
        new Thread(() -> {
                bank.takeMoney(20000);
        }).start();
    }
}
