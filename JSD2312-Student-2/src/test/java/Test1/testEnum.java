package Test1;

/**
 * 测试枚举的特性
 */
public enum testEnum {
    //SPRING = new testEnum();
    SPRING("暖和"),SUMMER("酷热"),AUTUMN("凉爽"),WINTER("寒冷");
    public String character;
    testEnum(String character)
    {
        this.character = character;
    }

    @Override
    public String toString() {
        return "testEnum{" +
                "character='" + character + '\'' +
                '}';
    }

    public String getCharacter() {
        return character;
    }

    public void setCharacter(String character) {
        this.character = character;
    }
}

class t{
    public static void main(String[] args) {
        System.out.println(testEnum.SPRING);
    }
}
