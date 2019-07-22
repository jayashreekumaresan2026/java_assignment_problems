package com.company.execisum;

public class AmStrong {
    boolean findAmStrong(int input) {
        int remainder, result = 0;
        int temp = input;
        int length = String.valueOf(temp).length();
        while (input > 0) {
            remainder = input % 10;
            result += Math.pow(remainder ,length);
            input = input / 10;
        }
        if (result == temp) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        AmStrong amStrong = new AmStrong();
        boolean result = amStrong.findAmStrong(153);
        System.out.println(result);
    }
}


