package 默认构造函数;

import java.util.ArrayList;
import java.util.List;

public class Son
{
    public int age;
    public String name;

    public static void main(String[] args)
    {
        //包装类与String一样，也可不可改变的，每次赋值相当于新new了一个对象
        Integer i = 500;
        Integer q = i;
        System.out.println(System.identityHashCode(i));
        System.out.println(System.identityHashCode(q));
        q = 500;
        System.out.println(System.identityHashCode(q));

//        Son son01 = new Son();
//        Son son02 = son01;



    }
    public static void add(Integer a,Integer b){
        System.out.println(System.identityHashCode(a));
        a = 300;
    }
}
