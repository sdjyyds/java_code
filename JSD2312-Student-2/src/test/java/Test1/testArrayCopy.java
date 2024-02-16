package Test1;

import java.util.Arrays;

/**
 * 回顾数组复制
 */
public class testArrayCopy {
    public static void main(String[] args) {
        int[] a = {1,3432,432,231,321132};
        int[] b = new int[10];//默认初始化为0
        //System.arraycopy(a,2,b,0,11);
        //for(int i = 0; i < b.length; i++) System.out.printf("%d ",b[i]);
        b = Arrays.copyOf(a,6);//自动扩容
        System.out.println(Arrays.toString(b));
    }
}
