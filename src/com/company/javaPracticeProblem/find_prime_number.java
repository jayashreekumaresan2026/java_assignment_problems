package com.company.javaPracticeProblem;

import java.util.Scanner;

public class find_prime_number {
    public static void main(String[] args) {
        int i, number, count = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number");
        number = input.nextInt();
        for (i = 0; i <= number; i++) {
            if (i % 2 == 0) {
                count += 1;
            }
            if (count == 2) {
                System.out.println("prime number" + " "+i);

            } else {
                System.out.println("Not a prime number" +" "+ i);
            }

        }

    }
}

