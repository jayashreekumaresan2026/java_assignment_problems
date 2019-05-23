package com.company.StudentReport;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.lang.String;


public class Application {

    static List<Student> findStudents(Student[] students, String dept,String HOD) {
        List<Student> s = new ArrayList<>();
        for (int i = 0; i < students.length; i++) {
            if (students[i].department.getDepartmentName().equals(dept) && students[i].department.getHODName().equals(HOD)) {
                s.add(students[i]);
            }

        }
        return s;
    }
    static Student userInput() {
        Scanner keyboard = new Scanner(System.in);
        String studentDetails = keyboard.nextLine();
        String[] words = studentDetails.split(" ");
        ArrayList<String> wordArrayList = new ArrayList<>(Arrays.asList(words));
        int rollNumber = Integer.parseInt(wordArrayList.get(0));
        String name = wordArrayList.get(1);
        int subject1 = Integer.parseInt(wordArrayList.get(2));
        int subject2 = Integer.parseInt(wordArrayList.get(3));
        int subject3 = Integer.parseInt(wordArrayList.get(4));
        String departmentName = wordArrayList.get(5);
        String HODName = wordArrayList.get(6);
        int blocks = Integer.parseInt(wordArrayList.get(7));
        Department department = new Department(departmentName,HODName,blocks);
        Student studentDetail=new Student(rollNumber,name,subject1,subject2,subject3,department);
        return studentDetail;
    }

    public static void main(String[] args) {
        int total=0;
        String result=" ";
        String totals=" ";
        Scanner keyboards = new Scanner(System.in);
        System.out.print("enter the number of student :");
        int studentDetails = keyboards.nextInt();
        Student[] students = new Student[studentDetails];

        for (int i = 0; i < students.length; i++) {
            System.out.print("enter the detail of the student :");
            Student studentDetail = Application.userInput();
            students[i] = studentDetail;
            total= students[i].totalCalculation();
            result = students[i].result();
            if (result.equals("PASS")) {
                total= students[i].totalCalculation();
                totals = Integer.toString(total);
            } else
            {
                totals="-";
            }


        }

        System.out.println("           Student Records with Marks");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(" RollNumber   Name   sub1    sub2    sub3 ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        for (int i = 0; i < students.length; i++) {
            students[i].showDetails();
        }

        System.out.println();
        System.out.println("           Student Records With Total ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(" RollNumber   Name   sub1    sub2    sub3    Total");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        for (int i = 0; i < students.length; i++) {
            students[i].showDetailsWithTotal(total);
        }

        System.out.println();
        System.out.println("           Student Records With Report ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(" RollNumber   Name   sub1    sub2    sub3    Total  Result");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        for (int i = 0; i < students.length; i++) {
            students[i] .reportStatus(totals,result);
        }


        List<Student> departCSE = Application.findStudents(students, "cse", "chandra");
        if(departCSE.size()>0) {
            System.out.println();

            System.out.println();
            System.out.println("           Student Records With Report");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println(" RolNumber   Name   sub1    sub2    sub3    Total  Result  ");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("Department :CSE");
            System.out.println("HOD:Chandra");
            for (int i = 0; i < departCSE.size(); i++) {
                departCSE.get(i).reportStatus(totals,result);

            }
        }

        List<Student> departEEE = Application.findStudents(students, "eee", "siva");
        if (departEEE.size() > 0) {
            System.out.println();
            System.out.println("           Student Records With Report");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println(" RolNumber   Name   sub1    sub2    sub3    Total  Result  ");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("Department :EEE");
            System.out.println("H0D:Siva");
            for (int i = 0; i < departEEE.size(); i++) {
                departEEE.get(i).reportStatus(totals,result);

            }
        }
    }
}
