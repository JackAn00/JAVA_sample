package com.jackTest;

/**
 * Created by Jack on 2017/3/15.
 */
public class Calculate implements Num {

    @Override
    public int add(int a, int b) {
        return a+b;
    }

    @Override
    public int subtract(int a, int b) {
        return a-b;
    }

    @Override
    public int multiply(int a, int b) {
        return a*b;
    }

    @Override
    public int divide(int a, int b) {
        return a/b;
    }

    @Override
    public void printMessage() {
         System.out.println("This is a calculate method test !");
    }
}
