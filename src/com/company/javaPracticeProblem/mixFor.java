package com.company.javaPracticeProblem;
public class mixFor {
    public static void main(String[] args) {
        int x = 0;
        int y = 30;
        for (int i = 0; i < 3; i++) {
            for (int j = 4; j > 1; j++) {
                x = x + 0;
                y = y - 2;
                if (x == 6) {
                    break;
                }
                x = x + 3;
            }
            y = y - 2;
        }
        System.out.println(x + " " + y);
    }
}
