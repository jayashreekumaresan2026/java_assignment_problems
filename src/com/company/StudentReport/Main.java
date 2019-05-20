package com.company.StudentReport;

import java.util.ArrayList;
import java.util.List;

public class Main {
      static List<Student> findStudents(Student[] students, String dept) {
        List<Student> s = new ArrayList<>();
        for (int i = 0; i < students.length; i++) {
            if (students[i].department.equals(dept)) {
                s.add(students[i]);
            }

        }
        return s;
    }

    public static void main(String[] args) {
        Student[] students = new Student[3];
        String result;

        for (int i = 0; i < 3; i++) {
            students[i] = new Student();
        }
        for (int i = 0; i < 3; i++) {
            System.out.print("enter the detail of the student ");
            students[i].getDetails();
            students[i].totalCalculation();
            result = students[i].checkTotal();
            students[i].report(result);
        }
        System.out.println("           Student Records with Marks");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(" RollNumber   Name   sub1    sub2    sub3 ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        for (int i = 0; i < 3; i++) {
            students[i].showDetails();
        }

        System.out.println();
        System.out.println("           Student Records With Total ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(" RollNumber   Name   sub1    sub2    sub3    Total");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        for (int i = 0; i < 3; i++) {
            students[i].showDetailsWithTotal();
        }

        System.out.println();
        System.out.println("           Student Records With Report ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(" RollNumber   Name   sub1    sub2    sub3    Total  Result");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        for (int i = 0; i < 3; i++) {
            students[i].reportStatus();
        }

        System.out.println();
        System.out.println("           Student Records With Report");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(" RolNumber   Name   sub1    sub2    sub3    Total  Result  ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("CSE");
        List<Student> departCSE= Main.findStudents(students, "cse");
        for(int i = 0; i < departCSE.size(); i++) {
            departCSE.get(i).reportStatus();

        }

        System.out.println();
        System.out.println("           Student Records With Report");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(" RolNumber   Name   sub1    sub2    sub3    Total  Result  ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("EEE");
        List<Student> departEEE= Main.findStudents(students, "eee");

        for(int i = 0; i < departEEE.size(); i++) {

            departEEE.get(i).reportStatus();

        }
    }
}
