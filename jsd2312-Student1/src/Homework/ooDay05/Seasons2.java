package Homework.ooDay05;

public enum Seasons2 {
    //public static final Seasons2 SPRING = new Seasons2("春天","暖和")
    SPRING("春天","暖和"),
    SUMMER("夏天","热"),
    AUTUMN("秋天","凉快"),
    Winter("冬天","冷");
    private String seasonName,seasonCharacter;
    Seasons2(String seasonName, String seasonCharacter)//默认为private
    {
        this.seasonName = seasonName;
        this.seasonCharacter = seasonCharacter;
    }

    public String getSeasonName()
    {
        return this.seasonName;
    }

    public void setSeasonName(String seasonName) {
        this.seasonName = seasonName;
    }

    public String getSeasonCharacter()
    {
        return this.seasonCharacter;
    }

    public void setSeasonCharacter(String seasonCharacter){
        this.seasonCharacter  = seasonCharacter;
    }

    public static void main(String[] args) {
        Seasons2[] s = Seasons2.values();
        for(var i : s)
            System.out.println(i+""+i.getSeasonName()+i.getSeasonCharacter());
    }
}

interface  Circle{
    int num = 10;//默认为：public static final
    void show();//默认为：public abstract
    static void test(){} //默认为：public
    default  void test2(){}//默认为：public
    private void test3(){}
}