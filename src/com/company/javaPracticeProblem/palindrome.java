package com.company.javaPracticeProblem;

import java.util.Scanner;

public class palindrome {
    static int find_palindrome(int number) {
        int  sum = 0, remainder;
        while (number > 0) {
            remainder = number % 10;
            sum = ((sum * 10) + remainder);
            number = number / 10;
        }return sum;
    }

    public static void main(String[] args) {
        int number, temp, sum_result;
        System.out.println("Enter the number to check");
        Scanner input = new Scanner(System.in);
        number = input.nextInt();
        temp = number;
        sum_result= find_palindrome(number);
        if (sum_result== temp) {
            System.out.println("Number is palindrome");
        }
        else {
            System.out.println("Number is not a palindrome");
        }
    }
}
