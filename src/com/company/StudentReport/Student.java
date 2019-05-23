package com.company.StudentReport;

import java.lang.String;


public class Student {
    int rollNumber;
    String name;
    int subject1;
    int subject2;
    int subject3;
    int total;
    Department department;


    Student(int rollNumber, String name, int subject1, int subject2, int subject3, Department department) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;
        this.department = department;
    }

    int totalCalculation() {
        int total = subject1 + subject2 + subject3;
        this.total = total;
        return total;
    }

    String result() {
        if (subject1 <= 25 || subject2 <= 25 || subject3 <= 25) {
            return "FAIL";

        } else {
            return "PASS";

        }

    }


}