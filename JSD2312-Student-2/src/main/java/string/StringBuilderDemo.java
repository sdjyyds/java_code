package string;

/**
 * StringBuilder内部维护了一个可变数组
 * StringBuilder()创建一个长度为16的char数组
 * StringBuilder(String str)分配16个空间+str的空间的char数组
 * 方法：
 * append(String str)将str追加到StringBuilder的后面
 * replace(int start,int end,String str)将start到end(不包括)替换为str
 * delete(int start,int end) 删除start到end(不包括)中的内容
 * insert(int idx,String str) 在下标idx处插入str
 * reverse()反转
 */
public class StringBuilderDemo {
    public static void main(String[] args) {
        String str = "好好学习";
        StringBuffer strb = new StringBuffer("好好学习");
        /**
         *
            append后面添加
         */
        strb.append(",天天向上");
        str = strb.toString();
        System.out.println(str);
        /*
            replace替换l到r中为str
         */
        strb.replace(5,strb.length(),"就是为了改变世界");
        str = strb.toString();
        System.out.println(str);
        /*
            delete
         */
        strb.delete(1,2);
        str = strb.toString();
        System.out.println(str);
        /*
            insert
         */
        strb.insert(1,"好");
        str = strb.toString();
        System.out.println(str);
        /*
            reverse
         */
        strb.reverse();
        str = strb.toString();
        System.out.println(str);
    }
}
