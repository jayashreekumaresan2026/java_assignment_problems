package com.company.execisum;

public class ResistorColor {
    String[] resistorColours = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};


    int colorCode(String color) {
        int index = -1;
        for (int i = 0; i < resistorColours.length; i++) {
            if (resistorColours[i].equals(color)) {
                index = i;
            }
        }
        return index;
    }

    String[] colors() {
        return resistorColours;
    }

    public static void main(String[] args) {
        ResistorColor resistorColor = new ResistorColor();
        int code = resistorColor.colorCode("orange");
        String[] colors = resistorColor.colors();
        System.out.println(code);
        System.out.println(colors);
    }
}
