package com.company.execisum;

import java.util.HashMap;
import java.util.Map;

class RnaTranscription {

    void transcribe(String dnaStrand) {
        String result = "";
        if (dnaStrand.length() == 0) {
            result = "";
        } else if (dnaStrand.length() == 1) {
            char c = dnaStrand.charAt(0);
            result = checkCharacter(c);
        } else if (dnaStrand.length() > 2) {
            result = splitTheString(dnaStrand);
        }
        System.out.println(result);
    }

    private String splitTheString(String dnaStrand) {
        String result = "";
        char[] array = dnaStrand.toCharArray();
        for (int i = 0; i < array.length; i++) {
            result += checkCharacter(array[i]);
        }
        return result;
    }

    String checkCharacter(char dnaStrand) {
        String result = "";
        switch (dnaStrand) {
            case 'G':
                result = "C";
                break;
            case 'C':
                result = "G";
                break;
            case 'A':
                result = "T";
                break;
            case 'T':
            case 'U':
                result = "A";
                break;
        }
        return result;
    }

    public static void main(String[] args) {
        RnaTranscription rnaTranscription = new RnaTranscription();
        Map<Character,Character> map=new HashMap<>();
        map.put('G','C');
        map.put('C','G');
        map.put('T','A');
        map.put('A','U');
        rnaTranscription.transcribe("");
        rnaTranscription.transcribe("G");
        rnaTranscription.transcribe("A");
        rnaTranscription.transcribe("UGCACCAGAAUU");
    }
}
