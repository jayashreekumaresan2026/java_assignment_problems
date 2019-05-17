package com.company.javaPracticeProblem;

import java.util.Scanner;

public class linear_searching {
    static void linear_search(int[] array,int search_number) {
        int i,len,j;
        len=array.length;
        for(i=0;i<len;i++)
            {
                if (array[i]==search_number)
                {
                    System.out.println(array[i]+" is present in the array");
                }
            }
    }

    public static void main(String[] args) {
        int i;
        System.out.print("Enter the number");
        Scanner user_input = new Scanner(System.in);
        int number = user_input.nextInt();
        System.out.print("Enter the searching number");
        int search_number =user_input.nextInt();
        int array[] = new int[number];
        for (i = 0; i < number; i++) {
            array[i] = user_input.nextInt();
        }
    linear_search(array,search_number);
    }
}
