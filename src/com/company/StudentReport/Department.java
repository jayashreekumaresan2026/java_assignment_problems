package com.company.StudentReport;

public class Department {


    private String departmentName;
    private String HODName;
    int blocks;

    Department(String departmentName, String HODName, int blocks) {
        this.departmentName = departmentName;
        this.HODName = HODName;
        this.blocks = blocks;
    }
    public String getDepartmentName() {
        return departmentName;
    }

    public String getHODName() {
        return HODName;
    }

}
