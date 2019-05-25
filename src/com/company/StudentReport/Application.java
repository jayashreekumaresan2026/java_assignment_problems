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
            if (students[i].department.departmentName.equals(dept) && students[i].department.HODName.equals(HOD)) {
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
        Scanner keyboards = new Scanner(System.in);
        System.out.print("enter the number of student :");
        int studentDetails = keyboards.nextInt();
        Student[] students = new Student[studentDetails];
        ReportDisplay reports=new ReportDisplay();
        for (int i = 0; i < students.length; i++) {
            System.out.print("enter the detail of the student :");
            Student studentDetail = Application.userInput();
            students[i] = studentDetail;
        }
        System.out.println("choice your option");
        System.out.println("1 .Display students mark ");
        System.out.println("2 .Display student mark with total");
        System.out.println("3 .Display student mark with total and result");
        System.out.println("4 .Display student report");
        System.out.print("enter the your choice :");
        int studentDetails1 = keyboards.nextInt();
        List<Student> departCSE = findStudents(students, "cse", "chandra");
        List<Student> departEEE = findStudents(students, "eee", "siva");
        reports.reportdisplay(students,departCSE,departEEE,studentDetails1);

    }
}