package com.company.HackerRankProblems;

import java.util.Scanner;

class FindSum {
    long calculateSum(long[] arrayElements) {
        long sum = 0;
        for (int i = 0; i < arrayElements.length; i++) {
            sum += arrayElements[i];
        }
        return sum;
    }
}

public class VeryBigSum {
    public static void main(String[] args) {
        FindSum findSum = new FindSum();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements :");
        int input = scanner.nextInt();
        long[] array = new long[input];
        System.out.println("enter the numbers : ");
        for (int i = 0; i < input; i++) {
            array[i] = scanner.nextInt();
        }
        long result = findSum.calculateSum(array);
        System.out.println("result :" + result);
    }
}
