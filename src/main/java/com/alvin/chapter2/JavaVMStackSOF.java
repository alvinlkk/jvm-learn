package com.alvin.chapter2;

/**
 * VM Args: -Xss128k
 * Created by alvinlkk on 2017/8/1.
 */
public class JavaVMStackSOF {

    private int stackLength = 1;

    public void stackLeak() {
        stackLength ++;
        stackLeak();
    }

    public static void main(String[] args) {
        JavaVMStackSOF oom = new JavaVMStackSOF();
        try {
            oom.stackLeak();
        }catch (Throwable e) {
            System.out.println("stack length : " + oom.stackLength );
            throw  e;
        }
    }
}
