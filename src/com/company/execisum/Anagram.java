package com.company.execisum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Anagram {
    String word;

    Anagram(String word) {
        this.word = word;
    }

    List<String> match(List<String> stringList) {
        List<String> strings = new ArrayList<>();
        char[] charArray = word.toLowerCase().toCharArray();
        Arrays.sort(charArray);
        for (String s : stringList) {
            String temp = s;
            char[] array = s.toLowerCase().toCharArray();
            Arrays.sort(array);
            if (Arrays.equals(array, charArray)&& !(word.equalsIgnoreCase(temp))) {

                strings.add(temp);
            }
        }
        return strings;
    }

    public static void main(String[] args) {
        Anagram detector = new Anagram("BANANA");
        List<String> stringList = new ArrayList<>(Arrays.asList("BANANA", "Banana", "banana"));
        List<String> result = detector.match(stringList);
        System.out.println(result);
    }
}

