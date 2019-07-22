package com.company.execisum;

import java.util.ArrayList;
import java.util.List;

public class Rain {
    String convert(int number) {
        List<Integer> list = new ArrayList<>();
        int temp = number;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                list.add(i);
            }
        }
        String result = " ";
        if (list.contains(3) && !list.contains(5) && !list.contains(7)) {
            result = "Pling";
        } else if (list.contains(5) && !list.contains(3) && !list.contains(7)) {
            result = "Plang";
        } else if (list.contains(7) && !list.contains(3) && !list.contains(5)) {
            result = "Plong";
        } else if (list.contains(3) && list.contains(5) && !list.contains(7)) {
            result = "PlingPlang";
        } else if (list.contains(5) && list.contains(7) && !list.contains(3)) {
            result = "PlangPlong";
        } else if (list.contains(3) && list.contains(7) && !list.contains(5)) {
            result = "PlingPlong";
        } else if (list.contains(3) && list.contains(7) && list.contains(5)) {
            result = "PlingPlangPlong";
        } else {
            result = Integer.toString(temp);
        }
        return result;
    }

    public static void main(String[] args) {
        Rain rain = new Rain();
        String result = rain.convert(105);
        System.out.println(result);
    }

}
