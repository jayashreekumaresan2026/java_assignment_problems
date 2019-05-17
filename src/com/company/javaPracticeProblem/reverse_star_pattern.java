package com.company.javaPracticeProblem;

import java.util.Scanner;

class reverse_star_pattern {
    void pattern_program(int input) {
        int i, j;
        for (i = 0; i <= input; i++) {
            for (j = 0; j < input - i; j++) {
                System.out.print("*  ");
            }
            System.out.println();

        }
    }
}

class star_pattern_program {
    public static void main(String[] args) {
        reverse_star_pattern obja = new reverse_star_pattern();
        System.out.println("enter the number ");
        Scanner obj = new Scanner(System.in);
        int input = obj.nextInt();
        obja.pattern_program(input);

    }

}

