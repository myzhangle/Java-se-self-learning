package 自制可传递的基本数据类型;

/**
 * 可传递的基本数据类型Int
 */
public class IntPlus
{
    private int value;

    public IntPlus(int value)
    {
        this.value = value;
    }

    public int getValue()
    {
        return value;
    }

    //修改的时候保证线程安全
    public synchronized void setValue(int value)
    {
        this.value = value;
    }
}
