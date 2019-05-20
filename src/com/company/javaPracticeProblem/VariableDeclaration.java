package com.company.javaPracticeProblem;

public class VariableDeclaration {
    int a=10;
    int b=20;
    static void variableMethod1()

    {
        VariableDeclaration s=new VariableDeclaration();
        System.out.println(s.a);
        System.out.println(s.b);
    }
    static void variableMethod2(){
        VariableDeclaration s=new VariableDeclaration();
        System.out.println(s.a);
        System.out.println(s.b);
    }
    public static void main(String[] args){
        variableMethod1();
        variableMethod2();


    }
}
