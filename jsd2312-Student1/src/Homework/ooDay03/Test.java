package Homework.ooDay03;

public class Test {
    /*
2. RefArrayDemo类：---------------------2遍
设计Dog数组dogs，Chick数组chicks，Fish数组fish，各自填充数据，遍历数组，访问元素的
属性及调用方法
3. 达内员工管理系统设计：---------------------1遍
     */
    public static void main(String[] args) {
        Dog[] dogs = new Dog[2];
        dogs[0] = new Dog("大黄","黄色",10);
        dogs[1] = new Dog("小黑","黑色",5);
        for(var i = 0; i < dogs.length; i++)
        {
            System.out.println(dogs[i].name+dogs[i].age+dogs[i].color);
            dogs[i].swim();
            dogs[i].lookHome();
        }
        Chick[] chicks = new Chick[2];
        chicks[0] = new Chick("小绿","白色",2);
        chicks[1] = new Chick("小红","红色",1);
        for(var i = 0; i < chicks.length; i++)
        {
            System.out.println(chicks[i].name+chicks[i].age+chicks[i].color);
            chicks[i].layEgges();
            chicks[i].eat();
        }
        Animal dog1 = new Dog("白额","黑色",5);
        dog1.eat();
        Animal chick = new Chick("小鸡","黄色",2);
        chick.eat();
        Swim dog2 = new Dog("小绿","绿色",6);
        dog2.swim();
    }
}

abstract class Animal{
    String name,color;
    int age;
    Animal(String name,String color,int age)
    {
        this.name = name;
        this.color = color;
        this.age = age;
    }
    void drink()
    {
        System.out.println("我是动物，我喝水！");
    }
    abstract  void eat();
}
interface Swim{
  void swim();
}

class Dog extends Animal implements Swim{
    Dog(String name,String color,int age)
    {
        super(name, color, age);
    }
    void eat()
    {
        System.out.println("我是狗，我喜欢吃骨头！");
    }
    public void swim()
    {
        System.out.println("我是狗，我会狗刨！");
    }
    void lookHome()
    {
        System.out.println("我帮你看家，你给我骨头吃");
    }
}




class Chick extends  Animal{
    Chick(String name,String color,int age)
    {
        super(name, color, age);
    }
    void eat()
    {
        System.out.println("我是Chick,我喜欢吃牛肉！");
    }
    void layEgges()
    {
        System.out.println("我会下蛋！");
    }
}
class Fish extends Animal implements Swim{
    Fish(String name,String color,int age)
    {
        super(name, color, age);
    }
    void eat()
    {
        System.out.println("我是鱼，我喜欢吃水！");
    }
    public void swim()
    {
        System.out.println("我是鱼，我天生就会游泳！");
    }
}

class father{
    String name;
    son createSon()
    {
        return new son();
    }
    class son{
        son()
        {
            System.out.println(name);
            System.out.println(father.this.name);
        }
    }

    public static void main(String[] args) {
        father f = new father();
        son son1 = f.createSon();
        son son2 = (new father()).new son();
    }
}

/*
达内员工管理系统设计：---------------------1遍
需求:


 */
abstract class Worker{
    String name;
    int age;
    double salary;
    Worker(String name,double salary,int age)
    {
        this.name = name;
        this.salary = salary;
        this.age = age;
    }
    abstract void goToWork();
    abstract void leaveForWork();
    abstract void finishWork();
}
interface SovlePbmTrainWorker{
    public abstract void sovlePbm();
    public abstract void TrainWoker();
}
interface EditBooks{
    void editBooks();
}

class TeachTutor extends Worker implements SovlePbmTrainWorker,EditBooks
{

    TeachTutor(String name, double salary, int age) {
        super(name, salary, age);
    }
    @Override
    void goToWork() {
        System.out.println("我的职位是教研总监，我要去教学研究咯！");
    }

    @Override
    void leaveForWork() {
        System.out.println("我下班咯！");
    }

    @Override
    void finishWork() {
        System.out.println("教研工作完成了，真开心！");
    }

    @Override
    public void sovlePbm() {
        System.out.println("这个问题你该这样解决……");
    }

    @Override
    public void TrainWoker() {
        System.out.println("首先你的用心听讲……");
    }

    @Override
    public void editBooks() {
        System.out.println("编辑书籍，教研人不能不会呀。");
    }
}

class Teacher extends Worker implements SovlePbmTrainWorker,EditBooks
{

    Teacher(String name, double salary, int age) {
        super(name, salary, age);
    }

    @Override
    void goToWork() {
        System.out.println("上班去教学咯，");
    }

    @Override
    void leaveForWork() {
        System.out.println("下班了，哈哈");
    }

    @Override
    void finishWork() {
        System.out.println("今天的教师任务总算完成了。");
    }

    @Override
    public void sovlePbm() {
        System.out.println("童鞋呀，你这个问题应该这样解决……");
    }

    @Override
    public void TrainWoker() {
        System.out.println("这个地方大家都懂了吗？");
    }

    @Override
    public void editBooks() {
        System.out.println("为了得到教育资源，我拼命编辑好书中……");
    }
}

class ProjectConsultant extends Worker implements EditBooks
{

    ProjectConsultant(String name, double salary, int age) {
        super(name, salary, age);
    }

    @Override
    void goToWork() {
        System.out.println("我是项目经理，今天又是元气满满的一天。");
    }

    @Override
    void leaveForWork() {
        System.out.println("芜湖，起飞，下班啦。");
    }

    @Override
    void finishWork() {
        System.out.println("这些任务我都完成了，我不愧是顶级项目经理。");
    }

    @Override
    public void editBooks() {
        System.out.println("为了涨工资，干，我来编辑些书，这我的身价不就涨了吗。");
    }
}

class HeadTeacher extends Worker
{

    HeadTeacher(String name, double salary, int age) {
        super(name, salary, age);
    }

    @Override
    void goToWork() {
        System.out.println("我是班主任，我去工作啦。");
    }

    @Override
    void leaveForWork() {
        System.out.println("我这难熬的一天要结束咯。");
    }

    @Override
    void finishWork() {
        System.out.println("哎，终于完成我的工作了。");
    }
}

class TestWorker{
    public static void main(String[] args) {
        Worker[] workers = new Worker[4];
        workers[0] = new TeachTutor("中西会",200000,30);
        workers[1] = new HeadTeacher("富裕",7000,30);
        workers[2] = new ProjectConsultant("刘帅",400000,25);
        workers[3] = new Teacher("刘三水",6000,25);
        for(int i = 0; i < workers.length; ++i)
        {
            workers[i].goToWork();
            workers[i].finishWork();
            workers[i].leaveForWork();
            if(workers[i] instanceof EditBooks)
                ((EditBooks) ((EditBooks) workers[i])).editBooks();
            else if(workers[i] instanceof SovlePbmTrainWorker)
                ((SovlePbmTrainWorker)((SovlePbmTrainWorker) workers[i])).sovlePbm();
        }
    }
}

class TestStatic
{
    static int num ;
    static final int COUNT = 10;

    public static void main(String[] args) {
        //先将TestStatic.class加载到方法区中，num--类变量加载到方法区中
        //然后再取到num的值
        System.out.println(TestStatic.num);
        System.out.println(TestStatic.COUNT);//编译时直接替换为常量
    }
}