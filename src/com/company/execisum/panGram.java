package com.company.execisum;

public class panGram {
    public boolean isPangram(String input) {
        String charArray = input.toLowerCase();
        if (charArray.length() < 26)
            return false;
        else {
            for (char ch = 'a'; ch <= 'z'; ch++) {
                if (charArray.indexOf(ch) < 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        panGram panGram = new panGram();
        boolean result=panGram.isPangram("\"Five1 quacking-4ephyrs3 jolt my wax bed.\"");
        System.out.println(result);
    }
}

