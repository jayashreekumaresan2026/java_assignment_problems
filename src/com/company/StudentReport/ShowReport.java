package com.company.StudentReport;

public class ShowReport {

    void showDetails(Student students) {
        System.out.println("\n\t" + students.rollNumber + "   \t" + students.name + "  \t" + students.subject1 + "  \t" + students.subject2 + "  \t" + students.subject3);
    }

    void showDetailsWithTotal(int total, Student students) {
        System.out.println("\n\t" + students.rollNumber + "   \t" + students.name + "  \t" + students.subject1 + "  \t" + students.subject2 + "  \t" + students.subject3 + "   \t" + total);
    }

    void reportStatus(String total, String result, Student students) {
        System.out.println("\n\t" + students.rollNumber + "   \t" + students.name + "  \t" + students.subject1 + "  \t" + students.subject2 + "  \t" + students.subject3 + "   \t" + total + "   \t" + result);
    }
}
