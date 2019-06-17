package com.company.HackerRankProblems;


import java.util.*;

class calculateMedian {
    double findMedian(int[] arrayValues) {
        Arrays.sort(arrayValues);
        int arrayLength=arrayValues.length;
        if (arrayLength%2==0);
        return (double) arrayValues[arrayLength / 2];
    }
}

public class FindMedian {
    public static void main(String[] args) {
        calculateMedian calculateMedian = new calculateMedian();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number :");
        int input = scanner.nextInt();
        System.out.println("Enter the value of the array");
        int[] array=new int[input];
        for (int i = 0; i < input; i++) {
            array[i]=scanner.nextInt();
        }
        double result = calculateMedian.findMedian(array);
        System.out.println("Medain :" + result);
    }
}
