package com.company.StudentReport;

import java.lang.String;

public class Student {
    int rollNumber;
    String name;
    int subject1;
    int subject2;
    int subject3;
    String total;
    String Result;
    Department department ;

    Student(int rollNumber,String name,int subject1,int subject2,int subject3,Department department){
        this.rollNumber=rollNumber;
        this.name=name;
        this.subject1=subject1;
        this.subject2=subject2;
        this.subject3=subject3;
        this.department=department;
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
        totals = "-";
        if (result.equals("FAIL"))
            total = totals;
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
