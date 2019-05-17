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
    String total;
    String department;
    String Result;
    String totals;

    void getDetails() {
        Scanner keyboard = new Scanner(System.in);
        String studentDetails = keyboard.nextLine();
        String[] words = studentDetails.split(" ");
        ArrayList<String> wordArrayList = new ArrayList<>(Arrays.asList(words));
        rollNumber = Integer.parseInt(wordArrayList.get(0));
        name = wordArrayList.get(1);
        subject1 = Integer.parseInt(wordArrayList.get(2));
        subject2 = Integer.parseInt(wordArrayList.get(3));
        subject3 = Integer.parseInt(wordArrayList.get(4));
        department = wordArrayList.get(5);
        totalCalculation();
        checkReport();
        findDepartment();

    }

    void totalCalculation() {

       int totalresult = subject1 + subject2 + subject3;
        total=Integer.toString(totalresult);

    }

    void checkReport() {
        if (subject1 <= 25 || subject2 <= 25 || subject3 <= 25) {
            totals="0";
            total=totals.replace("0","-");
            Result = "FAIL";
        } else {
           totalCalculation();
            Result = "PASS";

        }

    }

    void findDepartment()

    {
        if (department.equals("cse"))
        {
           department="cse";
        }
        else {
            department="eee";
        }

    }

    void showDetails() {
        System.out.println("\n\t" + rollNumber + "   \t" + name + "  \t" + subject1 + "  \t" + subject2 + "  \t" + subject3);

    }

    void showDetailsWithTotal() {
        System.out.println("\n\t" + rollNumber + "   \t" + name + "  \t" + subject1 + "  \t" + subject2 + "  \t" + subject3 + "   \t" + total);

    }

    void reportStatus() {
        System.out.println("\n\t" + rollNumber + "   \t" + name + "  \t" + subject1 + "  \t" + subject2 + "  \t" + subject3 + "   \t" + total+ "   \t" + Result);

    }
    void showDepartment() {
        System.out.println("\n\t" + rollNumber + "   \t" + name + "  \t" + subject1 + "  \t" + subject2 + "  \t" + subject3 + "   \t" + total + "   \t" + Result+" \t"+department);

    }


    public static void main(String[] args) {
        Student[] stud = new Student[2];
        int i;
        for (i = 0; i < 2; i++) {
            stud[i] = new Student();
        }
        for (i = 0; i < 2; i++) {
            System.out.print("enter the detail of the student ");
            stud[i].getDetails();

        }
        System.out.println("           Student Records with Marks");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(" RollNumber   Name   sub1    sub2    sub3 ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        for (i = 0; i < 2; i++) {
            stud[i].showDetails();
        }

        System.out.println();
        System.out.println("           Student Records With Total ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(" RollNumber   Name   sub1    sub2    sub3    Total");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        for (i = 0; i < 2; i++) {
            stud[i].showDetailsWithTotal();
        }

        System.out.println();
        System.out.println("           Student Records With Report ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(" RollNumber   Name   sub1    sub2    sub3    Total  Result");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        for (i = 0; i < 2; i++) {
            stud[i].reportStatus();
        }

        System.out.println();
        System.out.println("           Student Records With Report and Department");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(" RolNumber   Name   sub1    sub2    sub3    Total  Result  Department");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        for (i = 0; i < 2; i++) {
            stud[i].showDepartment();
        }

    }
}