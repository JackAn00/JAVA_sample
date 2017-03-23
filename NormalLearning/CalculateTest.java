package com.jackTest;

import java.util.Scanner;

/**
 * Created by Jack on 2017/3/15.
 */
public class CalculateTest {

    public static void main(String [] args){

        Calculate ca=new Calculate();
        Scanner sc=new Scanner(System.in);
        System.out.println(Calculate.PI);   //接口类型中的成员变量都是final类型的
        ca.printMessage();
        System.out.print("Pls input the first number :");
        int a=sc.nextInt();
        System.out.print("Pls input the second number :");
        int b=sc.nextInt();
        System.out.println(a+"+"+b+"="+ca.add(a,b));
        System.out.println(a+"-"+b+"="+ca.subtract(a,b));
        System.out.println(a+"*"+b+"="+ca.multiply(a,b));
        System.out.println(a+"/"+b+"="+ca.divide(a,b));

    }
}
