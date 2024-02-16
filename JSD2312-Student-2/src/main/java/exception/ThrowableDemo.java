package exception;

/**
 * throw关键字
 */
public class ThrowableDemo {
    static void doCompute1(int a,int b)
    {
        if(b == 0) throw new ArithmeticException("除数不能为0");
        int result = a/b;
        System.out.println(result);
    }

    static void doCompute2(int a,int b)
    {
        try {
            int result = a / b;
            System.out.println(result);
        }catch (ArithmeticException e)
        {
            //日志
            System.out.println("除数不能为0");
            throw e;
        }
        System.out.println("finish");
    }
    public static void main(String[] args) {
        //doCompute1(1,0);
        doCompute2(1,0);
    }
}
