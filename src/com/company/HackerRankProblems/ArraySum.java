//https://www.hackerrank.com/challenges/simple-array-sum/problem
package com.company.HackerRankProblems;
import java.util.Scanner;


public class ArraySum {

    static int sumArray(int[] numbers){
       int sum=0;
       for(int i=0;i<numbers.length;i++)
       {
           sum=sum+numbers[i];
       }
       return sum;
    }

    public static void main(String[] args) {
        Scanner keyboard =new Scanner(System.in);

        System.out.println("Enter the number of inputs");
        int inputs=keyboard.nextInt();
        int[] number=new int[inputs];
        for(int i=0;i<inputs;i++)
        {
            number[i]=keyboard.nextInt();

        }
       int result=sumArray(number);
        System.out.println("Sum of array"+result);
    }
}
