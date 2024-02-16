package Type;

/**
 * 泛型：
 * 宽泛的类型，用于根据需求来选择想要的数据类型，可以为方法参数，返回类型，变量类型。
 * 由于无法确定定义的类型，将需要存储的类型，实时的给定不同类型，Object过于宽泛，造型过于麻烦。
 *
 */
public class TransferObject <T>{
    private String Name;
    private int Age;
    private T message;
    public TransferObject(){}

    public TransferObject(String name, int age, T message) {
        Name = name;
        Age = age;
        this.message = message;
    }

    public void setName(String name) {

        Name = name;
    }

    public void setAge(int age) {
        Age = age;
    }

    public void setMessage(T message) {
        this.message = message;
    }

    public String getName() {
        return Name;
    }

    public int getAge() {
        return Age;
    }

    public T getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "TransferObject{" +
                "Name='" + Name + '\'' +
                ", Age=" + Age +
                ", message=" + message +
                '}';
    }
}
class Test
{
    public static void main(String[] args) {
        TransferObject t1 = new TransferObject();
        //造型时需要进行instanceof判断
        t1.setAge(40);
        t1.setMessage("fdsf");
        System.out.println(t1);
        int a = 0;
        if(t1.getMessage() instanceof  Integer)
            a = (Integer)t1.getMessage();
        //泛型不指定时默认为Object
        TransferObject<String> t2 = new TransferObject<>();
        t2.setAge(20);
        t2.setMessage("中西会");
        t2.setName("颜颖");
        System.out.println(t2);

        TransferObject<Integer> t3 = new TransferObject<>();
        t3.setMessage(10);

    }
}
