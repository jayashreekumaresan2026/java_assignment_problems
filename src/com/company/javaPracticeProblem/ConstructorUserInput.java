package com.company.javaPracticeProblem;

import java.util.Scanner;

class StudentDetails {
    String name;
    int age;
    String gender;

    StudentDetails() {
        name = "jaya";
        age = 20;
        gender = "female";

    }

    StudentDetails(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;

    }

    void showDetails(){
        System.out.println("Name of the student :"+name);
        System.out.println("Age of the student :"+age);
        System.out.println("Gender of the student :"+gender);


    }

}


public class ConstructorUserInput {
    public static void main(String[] args) {

        Scanner keyboard=new Scanner(System.in);
        System.out.print("enter the name ");
        String name=keyboard.nextLine();
        System.out.print("enter the age ");
        int age=Integer.parseInt(keyboard.nextLine());
        System.out.print("enter the gender ");
        String gender=keyboard.nextLine();

        StudentDetails student =new StudentDetails(name,age,gender);
        student.showDetails();



    }


}
