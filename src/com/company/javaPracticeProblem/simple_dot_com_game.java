package com.company.javaPracticeProblem;

import java.util.Scanner;

//public class simple_dot_com_game {
//
//
//    String checkYourself(String guess) {
//
//    }
//}

class Game_class {
    public static void main(String[] args) {
        int i;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of array elemens");
        int number = input.nextInt();
        int object[] = new int[number];
        for (i = 0; i < number; i++) {
            if ((i == 1) || (i == 2) || (i == 3)) {
                object[i] = 1;
            } else {
                object[i] = 0;
            }
        }
            int count=0;
            int x=0;

            while(x<number) {
                System.out.println("Enter the number to be guessed (or) print 0 to exit the game");
                int element = input.nextInt();
                if (object[i] == element) {
                        count=count+1;
                        System.out.println("hit");
                        continue;
                    }
                if (number==element ){
                        count=count+1;
                        System.out.println("kill");
                    }
                else
                    {
                        System.out.println("yot took"+count+"guess");
                    }
                }

            }

        }

