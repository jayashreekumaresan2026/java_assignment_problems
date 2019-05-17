package com.company.javaPracticeProblem;
import java.util.Scanner;

class star_pattern {
    void pattern(int input){
        int i,j;
        for(i=0;i<input;i++) {
            for (j = 0; j <=i; j++) {
                System.out.print("*  ");

            }System.out.println();

        }
    }
}

class main_pattern{
        public static void main(String[] args){
            star_pattern obja=new star_pattern();
            System.out.println("enter the number ");
            Scanner obj=new Scanner(System.in);
            int input=obj.nextInt();
            obja.pattern(input);

        }

    }

