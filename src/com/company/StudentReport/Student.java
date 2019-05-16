package com.company.StudentReport;

import java.util.ArrayList;
import java.util.Arrays;
import java.lang.String;
import java.util.Scanner;

public class Student {
    int rollNumber;
    String name;
    int subject1;
    int subject2;
    int subject3;

    void getDetails() {
        Scanner keyboard = new Scanner(System.in);
        String studentDetails = keyboard.nextLine();
        String[] words = studentDetails.split(" ");
        ArrayList<String> wordArrayList = new ArrayList<>(Arrays.asList(words));
        rollNumber =Integer.parseInt(wordArrayList.get(0));
        name =wordArrayList.get(1);
        subject1 =Integer.parseInt(wordArrayList.get(2));
        subject2=Integer.parseInt(wordArrayList.get(3));
        subject3 =Integer.parseInt(wordArrayList.get(4));

    }

    void showDetails() {
             System.out.println("\n\t" + rollNumber + "   \t" + name + "  \t" + subject1 + "  \t" + subject2 + "  \t" + subject3);

    }


    public static void main(String[] args) {
        Student[] stud = new Student[3];
        int i;
        for (i = 0; i < 3; i++) {
            stud[i] = new Student();
        }
        for (i = 0; i < 3; i++) {
            System.out.print("enter the detail of the student ");
            stud[i].getDetails();

        }
        System.out.println("           Student Record ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(" Rollnumber   Name   sub1    sub2    sub3 ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        for (i = 0; i < 3; i++) {
            stud[i].showDetails();

        }
    }
}