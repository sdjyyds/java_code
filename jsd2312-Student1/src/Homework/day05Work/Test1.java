package Homework.day05Work;

import java.util.Arrays;

public class Test1 {
    /**
     * 2. 数组小代码练习：声明、初始化、访问、遍历、复制
     * 3. MaxOfArray求数组元素最大值并放在最后一个元素的下一个位置
     * 4. 对数组进行升序排列，并输出排序后的结果
     */
    void testArray()
    {
        //声明数组
        int []a;
        //初始化——分配空间
        a = new int[10];
        a[0] = 0;
        for(int i = 1; i < 10; i++) a[i] = i;
        System.out.println(Arrays.toString(a));
        int b[] = new int[2];
        //System.arraycopy(a,0,b,0,10);
        b = Arrays.copyOf(a,10);
        System.out.println(Arrays.toString(b));

    }
    void putMaxToLast(int[] a)
    {
        int idx = getMaxOfArray(a);
        System.out.println(Arrays.toString(a));
        swap(a,idx,a.length-1);
        System.out.println(Arrays.toString(a));
    }
    int getMaxOfArray(int[] a)
    {
        int idx = 0;
        for(int i = 0; i < a.length; i++)
            if(a[i] > a[idx]) idx = i;
        return idx;
    }
    void swap(int []a,int idx1,int idx2)
    {
        int temp = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = temp;
    }
    void sort(int[] a,int l,int r)
    {
        if(l >= r) return;

        int i = l-1, j = r + 1,x = a[(l+r)/2];
        while(i < j)
        {
            do i++;while(a[i] < x);
            do j--;while (a[j] > x);
            if(i < j)
            {
                swap(a,i,j);
            }
        }
        sort(a,l,j);
        sort(a,j+1,r);
    }

    /**
     *
     * 1. 利用for循环计算：求数字1到100之内，所有偶数的和，并输出
     * 2. 利用for循环计算：求8的阶乘，并输出
     * 3. 利用for循环计算：打印字符*组成的直角三角形，输出结果如下所示：
     */
    int getOu(int a,int b)
    {
        int res = 0;
        for(int i = a; i <= b; i++)
            if(i % 2 == 0)  res += i;
        return res;
    }
    int getJie(int x)
    {
        int res = 1;
        for(int i = 2; i <= x; i++)
            res *= i;
        return res;
    }
    void getSan()
    {
        for(int i = 1; i <= 6; i++)
        {
            int j = 2 * i -1;
            for(int k = 1;k <= j; k++) System.out.print("*");
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int a[] ={3213,3213,545,0,-143,434,0,324};
        Test1 t = new Test1();
        //System.out.println(Arrays.toString(a));
        t.putMaxToLast(a);
        //System.out.println(Arrays.toString(a));
//        t.testArray();
//        t.sort(a,0,a.length-1);
//        System.out.println(Arrays.toString(a));
        //System.out.println(t.getOu(1,100));
        //System.out.println(t.getJie(8));
        //t.getSan();
    }
}
