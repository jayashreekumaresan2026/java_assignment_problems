package com.company.execisum;

import java.util.HashMap;
public class RNATransition {
    HashMap<String, String> map = new HashMap<>();
    {
        map.put("G", "C");
        map.put("C", "G");
        map.put("T", "A");
        map.put("A", "U");
    }


    String checkRNATransition(String dnaStrand) {
        StringBuilder stringBuilder = new StringBuilder();
        char[] array = dnaStrand.toCharArray();
        for (int i = 0; i < array.length; i++) {
            stringBuilder.append(map.get(String.valueOf(array[i])));
        }
        return stringBuilder.toString();
    }



    public static void main(String[] args) {
        RNATransition rnaTransition = new RNATransition();
        String result = rnaTransition.checkRNATransition("UGCACCAGAAUU");
        System.out.println(result);
    }
}
