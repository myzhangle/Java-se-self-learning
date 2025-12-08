package 自制可传递的基本数据类型;

import java.nio.IntBuffer;
import java.util.concurrent.FutureTask;

public class Test
{
    public static void main(String[] args) throws InterruptedException
    {
        IntPlus a = new IntPlus(100);
        Thread thread = new Thread(new Runnable()
        {
            @Override
            public void run()
            {
                for (int i = 0; i < 500; i++) {
                    a.setValue(a.getValue() + 1);
                }
            }
        });
        Thread thread02 = new Thread(new Runnable()
        {
            @Override
            public void run()
            {
                for (int i = 0; i < 500; i++) {
                    a.setValue(a.getValue() +1);
                }
            }
        });
        thread.start();
        thread02.start();
        //测试线程安全
        Thread.sleep(1000);
        System.out.println(a.getValue());

    }
    public static void add(IntPlus a,IntPlus b){
        a.setValue(a.getValue() + b.getValue());
    }
}
