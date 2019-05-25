package com.company.StudentReport;

import java.util.List;

class ReportDisplay {
    void reportdisplay(Student[] students, List<Student> departCSE, List<Student> departEEE, int choice) {
        switch (choice) {
            case 1:
                displayMarks(students);
                break;

            case 2:
                displayWithTotal(students);
                break;
            case 3:
                displayWithResult(students);
                break;
            default:
                displayMarks(students);
                displayWithTotal(students);
                displayWithResult(students);
                displayWithdepartment(departEEE, departCSE);
        }
    }
    void displayWithdepartment(List<Student> departEEE, List<Student> departCSE) {

        if (departEEE.size() > 0) {
            System.out.println();
            System.out.println("           Student Records With Report");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println(" RolNumber   Name   sub1    sub2    sub3    Total  Result  ");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("Department :EEE");
            System.out.println("H0D:Siva");
            for (int i = 0; i < departEEE.size(); i++) {
                reportStatus(departEEE.get(i));
            }
        }
        if (departCSE.size() > 0) {
            System.out.println();

            System.out.println();
            System.out.println("           Student Records With Report");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println(" RolNumber   Name   sub1    sub2    sub3    Total  Result  ");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("Department :CSE");
            System.out.println("HOD:Chandra");
            for (int i = 0; i < departCSE.size(); i++) {

                reportStatus(departCSE.get(i));
            }
        }
    }

    void reportStatus(Student student) {
        if (student.result().equals("PASS")) {
            System.out.println("\n\t" + student.rollNumber + "   \t" + student.name + "  \t" + student.subject1 + "  \t" + student.subject2 + "  \t" + student.subject3 + "   \t" + student.totalCalculation() + "   \t" + student.result());
        } else {
            String totals="-";
            System.out.println("\n\t" + student.rollNumber + "   \t" + student.name + "  \t" + student.subject1 + "  \t" + student.subject2 + "  \t" + student.subject3 + "   \t" + totals + "   \t" + student.result());
        }
    }

    void displayWithResult(Student[] students) {

        System.out.println();
        System.out.println("           Student Records With Report ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(" RollNumber   Name   sub1    sub2    sub3    Total  Result");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        for (int i = 0; i < students.length; i++) {
            if (students[i].result().equals("PASS")) {
                System.out.println("\n\t" + students[i].rollNumber + "   \t" + students[i].name + "  \t" + students[i].subject1
                        + "  \t" + students[i].subject2 + "  \t" + students[i].subject3 + "   \t" + students[i].totalCalculation()
                        + "   \t" + students[i].result());
            } else {
                String totals = "-";
                System.out.println("\n\t" + students[i].rollNumber + "   \t" + students[i].name + "  \t" + students[i].subject1
                        + "  \t" + students[i].subject2 + "  \t" + students[i].subject3 + "   \t" +
                        totals + "   \t" + students[i].result());
            }
        }
    }

    void displayWithTotal(Student[] students) {
        System.out.println();
        System.out.println("           Student Records With Total ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(" RollNumber   Name   sub1    sub2    sub3    Total");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        for (int i = 0; i < students.length; i++) {
            System.out.println("\n\t" + students[i].rollNumber + "   \t" + students[i].name + "  \t" + students[i].subject1
                    + "  \t" + students[i].subject2 + "  \t" + students[i].subject3 + "   \t" + students[i].totalCalculation());
        }

    }

    void displayMarks(Student[] students) {
        System.out.println("           Student Records with Marks");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(" RollNumber   Name   sub1    sub2    sub3 ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        for (int i = 0; i < students.length; i++) {
            System.out.println("\n\t" + students[i].rollNumber + "   \t" + students[i].name + "  \t" +
                    students[i].subject1 + "  \t" + students[i].subject2 + "  \t" + students[i].subject3);
        }
    }


}


