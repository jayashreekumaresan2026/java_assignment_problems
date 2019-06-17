package com.company.HackerRankProblems;
class Arithmetic {
    int add(int number1, int number2) {
        return number1 + number2;
    }
}

class Adder extends Arithmetic {
}

public class Addition {
    public static void main(String[] args) {
        Adder a = new Adder();
        System.out.println("My superclass is: " + a.getClass().getSuperclass().getName());
        System.out.print(a.add(10, 32) + " " + a.add(10, 3) + " " + a.add(10, 10) + "\n");
    }
}

