package com.company.javaPracticeProblem;


class Students {
    String name, place;
    int rollnumber, age;

    public Students() {
        System.out.println("Default constructor");
    }

    public Students(String name, String place, int rollnumber, int age) {
        this.name = name;
        this.place = place;
        this.rollnumber = rollnumber;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", place='" + place + '\'' +
                ", rollnumber=" + rollnumber +
                ", age=" + age +
                '}';
    }

    void show_student_details() {
        System.out.println("Name of the student :" + name);
        System.out.println("Place of the student :" + place);
        System.out.println("Rollnumber of the student :" + rollnumber);
        System.out.println("Age of the student :" + age);

    }
}

public class Array_of_objects {
    public static void main(String[] args) {
        int value = 0;
//        Students student1 = new Students("jayashree", "chennai", 123, 24);
        Students student2 = new Students("oviya", "chennai", 113, 7);

        Students student3 = new Students("pavi", "chennai", 122, 20);
        Students[] student = new Students[3];
        //This assignment is used to intilize the variable as null and 0 values
        student[0]=new Students();
        // assiging the student detail to the first array of object
//        student[0] = student1;
        //over_ride the previous assignment
        student[0].name = "sandhiya";
        //calling a single object to show the student details
        student[0].show_student_details();
        student[1] = student2;
        student[2] = student3;
//        while (value < student.length) {
//            student[value].show_student_details();
//            value = value + 1;
//        }
        for (Students s : student)
            System.out.println(s);
    }
}