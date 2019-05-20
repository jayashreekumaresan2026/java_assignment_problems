package com.company.javaPracticeProblem;

public class InstanceStaticVariable {
    int a=10;
    int b=20;
    void m1(){
        InstanceStaticVariable ob2=new InstanceStaticVariable();
        System.out.println(ob2.a);

    }
   static void m2(){
        InstanceStaticVariable ob =new InstanceStaticVariable();
       System.out.println(ob.a);
       System.out.println(ob.b);
    }
    public static void main(String[] args) {
        InstanceStaticVariable ob3=new InstanceStaticVariable();
        ob3.m1();
        m2();


    }
}
