package Type;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;

/**
 * 用来测试泛型的范围
 */
public class TransferObject2 <T extends Collection>{
    private String Name;
    private int Age;
    private T message;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public T getMessage() {
        return message;
    }

    public void setMessage(T message) {
        this.message = message;
    }
}
class Demo2
{
    public static void main(String[] args) {
        TransferObject2 transferObject2 = new TransferObject2();
        //transferObject2.setMessage("fsdfds");不通过，得继承自集合
        TransferObject2<Collection> t1 = new TransferObject2<>();
        TransferObject2<ArrayList> t2 = new TransferObject2<>();
        TransferObject<LinkedList> t3 = new TransferObject<>();
        TransferObject<HashSet> t4 = new TransferObject<>();

    }
}
