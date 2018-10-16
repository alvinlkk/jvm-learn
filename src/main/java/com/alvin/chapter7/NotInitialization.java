package com.alvin.chapter7;

/**
 * Created by Think on 2017/8/18.
 */
public class NotInitialization {
    public static void main(String[] args) {
        //System.out.println(SubClass.value);

        //SuperClass[] sca = new SuperClass[10];

        System.out.println(ConstClass.HELLOWORLD);
    }
}

class SuperClass {
    static  {
        System.out.println("SuperClass init !");
    }

    public static int value = 123;
}

class SubClass extends SuperClass {
    static {
        System.out.println("SubClass init !");
    }
}

class ConstClass {
    static {
        System.out.println("ConstClass init !");
    }

    public static final String HELLOWORLD = "hello world";
}
