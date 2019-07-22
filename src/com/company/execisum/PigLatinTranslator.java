package com.company.execisum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PigLatinTranslator {

    String translate(String input) {
        String result = "";
        List<Character> characterList = new ArrayList<Character>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
        String[] arrOfStr = input.split(" ");
        if (arrOfStr.length == 1) {
            int firstIndex = input.indexOf('q');
            int secondIndex = input.indexOf('u');
            char[] charArray = input.toCharArray();
            for (int i = 0; i < charArray.length; i++) {
                if (characterList.contains(charArray[0]) || (charArray[0] == 'y' && charArray[1] == 't')
                        || (charArray[0] == 'x' && charArray[1] == 'r')) {
                    result += input + "ay";
                    break;
                } else if (characterList.contains(charArray[i])) {
                    String startingString = "";
                    String stringFrom = input.substring(i, charArray.length);
                    for (int j = 0; j < i; j++) {
                        startingString += charArray[j];
                    }
                    result += stringFrom + startingString + "ay";
                    break;
                } else if ((firstIndex != -1) && (secondIndex != -1) && (secondIndex == firstIndex + 1)) {
                    String startingString = "";
                    if (firstIndex == 0) {
                        String stringFrom = input.substring(secondIndex + 1, charArray.length);
                        for (int j = 0; j < firstIndex + secondIndex + 1; j++) {
                            startingString += charArray[j];
                        }
                        result += stringFrom + startingString + "ay";
                        break;
                    } else {
                        String stringFrom = input.substring(secondIndex + 1, charArray.length);
                        for (int j = 0; j < firstIndex + secondIndex; j++) {
                            startingString += charArray[j];
                        }
                        result += stringFrom + startingString + "ay";
                        break;
                    }
                } else if (charArray[0] != 'y' && charArray[i] == 'y') {
                    String startingString = "";
                    String stringFrom = input.substring(i, charArray.length);
                    for (int j = 0; j < i; j++) {
                        startingString += charArray[j];
                    }
                    result += stringFrom + startingString + "ay";
                    break;
                }


            }

        } else {
            List<String> stringList=new ArrayList<>();
            for (String a : arrOfStr) {

                char[] charArray = a.toCharArray();
                if ((charArray[0] == 'q' && charArray[1] == 'u')) {
                    String startingString = "";
                        String stringFrom = input.substring(2, charArray.length);
                        for (int j = 0; j < 2; j++) {
                            startingString += charArray[j];
                        }
                       stringList.add(stringFrom + startingString + "ay"+" ");
                    }
                else{
                    String string=a.substring(1,charArray.length);
                    stringList.add(string+charArray[0]+"ay"+" ");
                }
            }
            String names = String.join("", stringList);
            result +=names;


        }
        return result;
    }
    public static void main(String[] args) {
        PigLatinTranslator pigLatinTranslator = new PigLatinTranslator();
        String finalResult = pigLatinTranslator.translate("quick fast run");
        System.out.println(finalResult);
    }
}
