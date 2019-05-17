package com.company.javaPracticeProblem;

class Base {
   private void fun() {
        System.out.println("Base fun");
    }
}

class Derived extends Base {
    private void fun() {
        System.out.println("Derived fun");
    }
    public static void main(String[] args) {
        Derived obj = new Derived();
        obj.fun();
    }
}
