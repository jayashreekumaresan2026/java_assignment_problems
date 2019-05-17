package com.company.javaPracticeProblem;

import java.util.ArrayList;
import java.util.Scanner;

//import java.util.*;
//
//
class SimpleArrayList {
    //    public static void main(String args[]) {
//        List l = new ArrayList();
//        System.out.println("Enter the input");
//        Scanner input = new Scanner(System.in);
//
//        String a = input.nextLine();
//        l.add(a);
//        for (int i = 0; i < l.size(); i++) {
//            System.out.println(l.get(i));
//      System.out.println(l);
////
//     }
//
//    }
//}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int j;
        ArrayList l = new ArrayList();
        System.out.println("enter the number");
        int input = sc.nextInt();
        for (int i = 0; i < input; i++) {
            j = sc.nextInt();
            l.add(j + "abc");
        }
        l.add(10);
        System.out.println(l);
    }
}