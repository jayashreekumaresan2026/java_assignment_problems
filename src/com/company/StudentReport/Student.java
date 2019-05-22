package com.company.StudentReport;

import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Student {
    int rollNumber;
    String name;
    int subject1;
    int subject2;
    int subject3;
    String total;
    String Result;
    Department department;

    void userInput() {
        Scanner keyboard = new Scanner(System.in);
        String studentDetails = keyboard.nextLine();
        String[] words = studentDetails.split(" ");
        ArrayList<String> wordArrayList = new ArrayList<>(Arrays.asList(words));
        rollNumber = Integer.parseInt(wordArrayList.get(0));
         name = wordArrayList.get(1);
        subject1 = Integer.parseInt(wordArrayList.get(2));
        subject2 = Integer.parseInt(wordArrayList.get(3));
        subject3 = Integer.parseInt(wordArrayList.get(4));
        String departmentName = wordArrayList.get(5);
        String HODName = wordArrayList.get(6);
        int blocks = Integer.parseInt(wordArrayList.get(7));
        getDetails(rollNumber, name, subject1, subject2, subject3);
        department = new Department(departmentName,HODName,blocks);
        department.departmentName=departmentName;
        department.HODName=HODName;
    }

    void getDetails(int rollNumber,String name,int subject1,int subject2,int subject3) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;

    }
    void totalCalculation() {

        int totalresult = subject1 + subject2 + subject3;
        total = Integer.toString(totalresult);

    }

    String checkTotal() {
        if (subject1 <= 25 || subject2 <= 25 || subject3 <= 25) {
            Result = "FAIL";
            return Result;
        } else {

            Result = "PASS";
            return  Result;

        }

    }
    void report(String result){
        String totals;
        totals = "0";
        if (result.equals("FAIL"))
            total = totals.replace("0", "-");
        else
        {
            totalCalculation();
        }
    }


    void showDetails() {
        System.out.println("\n\t" + rollNumber + "   \t" + name + "  \t" + subject1 + "  \t" + subject2 + "  \t" + subject3);

    }

    void showDetailsWithTotal() {
        System.out.println("\n\t" + rollNumber + "   \t" + name + "  \t" + subject1 + "  \t" + subject2 + "  \t" + subject3 + "   \t" + total);

    }

    void reportStatus() {
        System.out.println("\n\t" + rollNumber + "   \t" + name + "  \t" + subject1 + "  \t" + subject2 + "  \t" + subject3 + "   \t" + total + "   \t" + Result);

    }
}
