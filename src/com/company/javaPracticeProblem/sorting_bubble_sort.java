package com.company.javaPracticeProblem;
import java.util.Arrays;
import java.util.Scanner;


public class sorting_bubble_sort {

     static void sorting_function(int[] array_elements) {
        int i, j, temp;
        int l = array_elements.length;
        for (i = 0; i <l; i++) {
            for (j = i; j <l-i; j++) {
                if (array_elements[i] >array_elements[j]) {
                    temp = array_elements[i];
                    array_elements[i] = array_elements[j];
                    array_elements[j] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int number, i;
        System.out.print("enter the number :");
        Scanner input = new Scanner(System.in);
        number = input.nextInt();
        int array_of_elements[] = new int[number];
        for (i = 0; i < number; i++) {
            array_of_elements[i] = input.nextInt();

        }
        sorting_function(array_of_elements);
        System.out.println("After sorting");
        System.out.println(Arrays.asList(array_of_elements));

    }

}