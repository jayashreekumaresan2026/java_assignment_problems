package com.company.Calculator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner keyboard=new Scanner(System.in);
        System.out.print("Enter the first number");
        int firstInput=keyboard.nextInt();
        System.out.print("Enter the second number");
        int secondInput=keyboard.nextInt();
        Calculator object1=new Calculator(firstInput,secondInput);
        double addition=object1.addFunction();
        System.out.println("Addition :" + addition);
        double subtraction=object1.subFunction();
        System.out.println("Subtraction :" + subtraction);
        double multiplication=object1.multiFunction();
        System.out.println("Multiplication :" + multiplication);
        double division=object1.diviFunction();
        System.out.println("Division :" + division);




    }
}