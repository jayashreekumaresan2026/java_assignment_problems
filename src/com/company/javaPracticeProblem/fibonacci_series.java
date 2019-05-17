package com.company.javaPracticeProblem;

import java.util.Scanner;

public class fibonacci_series {

    public static void main(String[] args) {
        int a = 0, b = 1, c, i;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = input.nextInt();
        System.out.println("You entered " + number);
        System.out.println(a);
        System.out.println(b);
        for (i = 2; i <= number; i++) {
            c = a + b;
            System.out.println(c);
            a = b;
            b = c;

        }
    }
}