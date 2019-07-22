package com.company.execisum;

public class StringReverse {
    StringBuilder reverse(String inputString) {
        StringBuilder sb = new StringBuilder();

        for(int i = inputString.length() - 1; i >= 0; i--)
        {
            sb.append(inputString.charAt(i));
        }
        return sb;
    }

    public static void main(String[] args) {
        StringReverse reverseString = new StringReverse();
        StringBuilder string=reverseString.reverse("");
        System.out.println(string.toString());
    }
}
