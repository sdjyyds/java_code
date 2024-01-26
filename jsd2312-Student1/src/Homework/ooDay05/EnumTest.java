package Homework.ooDay05;

public class EnumTest {
    public static void main(String[] args) {
        Seasons[] seasons = Seasons.values();
        for(var i : seasons)
            System.out.println(i);
        System.out.println("---------------------------");
        Seasons s = Seasons.AUTUMN;
        switch (s)
        {
            case SPRING:
                System.out.println("春天到了");
                break;
            case SUMMER:
                System.out.println("夏天到了");
                break;
            case AUTUMN:
                System.out.println("秋天到了");
                break;
            case WINTER:
                System.out.println("冬天到了");
                break;

        }
    }
}
