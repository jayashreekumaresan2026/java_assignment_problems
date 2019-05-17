package com.company.javaPracticeProblem;

public class Constructor {
    public static void main(String[] args)
    {
      Student s1=new Student(1111,"jayashree");
      System.out.println(s1.toString());
    }

}

class Student {
    int rollnumber;
    String sname;

    public Student(int rollnumber, String sname) {
        this.rollnumber = rollnumber;
        this.sname = sname;
    }

    @Override
    public String toString() {
        return rollnumber+":"+sname;
    }
}
