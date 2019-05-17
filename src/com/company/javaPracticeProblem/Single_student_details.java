package com.company.javaPracticeProblem;

 class Student_detail{
    String name, place;
    int rollnumber, age;

    public Student_detail() {
        System.out.println("Default constructor");
    }

    public Student_detail(String name, String place, int rollnumber, int age) {
        this.name = name;
        this.place = place;
        this.rollnumber = rollnumber;
        this.age = age;
    }

   public void show_student_details() {
        System.out.println("Name of the student :" + name);
        System.out.println("Place of the student :" + place);
        System.out.println("Rollnumber of the student :" + rollnumber);
        System.out.println("Age of the student :" + age);

    }
}

public class Single_student_details {
    public static void main(String[] args) {

        Students student1 = new Students("jayashree", "chennai", 123, 24);
        Students student2 = new Students("oviya", "chennai", 113, 7);

        Students student3 = new Students("pavi", "chennai", 122, 20);
        student1.show_student_details();
        System.out.println();
        student2.show_student_details();
        System.out.println();
        student3.show_student_details();
    }
}

