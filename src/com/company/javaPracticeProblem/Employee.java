package com.company.javaPracticeProblem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


class Employee
{
    int Id;
    String Name;
    int Age;
    long Salary;

    void GetData()
    {

        Scanner sc = new Scanner(System.in);

        System.out.print("\n\tEnter Employee Id : ");
        Id = Integer.parseInt(sc.nextLine());

        System.out.print("\n\tEnter Employee Name : ");
        Name = sc.nextLine();

        System.out.print("\n\tEnter Employee Age : ");
        Age = Integer.parseInt(sc.nextLine());

        System.out.print("\n\tEnter Employee Salary : ");
        Salary = Integer.parseInt(sc.nextLine());

    }

    void PutData()
    {
        System.out.print("\n\t" + Id + "\t" +Name + "\t" +Age + "\t" +Salary);
    }

    public static void main(String args[])
    {

        Employee[] Emp = new Employee[1];
        int i;

        for(i=0;i<1;i++)
            Emp[i] =  new Employee();

        for(i=0;i<1;i++)
        {
            System.out.print("\nEnter details of "+ (i+1) +" Employee\n");
            Emp[i].GetData();
        }

        System.out.print("\nDetails of Employees\n");
        for(i=0;i<1;i++)
            Emp[i].PutData();

    }
    private List<String> list = new ArrayList<String>(){{
        add("e1");
        add("e2");
        System.out.println(list);
    }};
}

