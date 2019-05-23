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

    void showDetails() {
        System.out.println("\n\t" + rollNumber + "   \t" + name + "  \t" + subject1 + "  \t" + subject2 + "  \t" + subject3);
    }

    void showDetailsWithTotal(int total) {
        System.out.println("\n\t" + rollNumber + "   \t" + name + "  \t" + subject1 + "  \t" + subject2 + "  \t" + subject3 + "   \t" + total);
    }

    void reportStatus(String total, String result) {
        System.out.println("\n\t" + rollNumber + "   \t" + name + "  \t" + subject1 + "  \t" + subject2 + "  \t" + subject3 + "   \t" + total + "   \t" + result);
    }
}