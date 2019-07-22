package com.company.execisum;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ProtienTranslator {
    HashMap<String, String> map = new HashMap<>();

    {
        map.put("AUG", "Methionine");
        map.put("UUU", "Phenylalanine");
        map.put("UUC", "Phenylalanine");
        map.put("UUA", "Leucine");
        map.put("UUG", "Leucine");
        map.put("UCU", "Serine");
        map.put("UCC", "Serine");
        map.put("UCA", "Serine");
        map.put("UCG", "Serine");
        map.put("UAU", "Tyrosine");
        map.put("UAC", "Tyrosine");
        map.put("UGU", "Cysteine");
        map.put("UGC", "Cysteine");
        map.put("UGG", "Tryptophan");
        map.put("UAA", "STOP");
        map.put("UAG", "STOP");
        map.put("UGA", "STOP");
    }

    List<String> Translate(String aug) {
        List<String> splitString = new ArrayList<>();
        List<String> stringList = new ArrayList<>();
        int index = 0;
        while (index < aug.length()) {
            splitString.add(aug.substring(index, Math.min(index + 3, aug.length())));
            index = index + 3;
        }
        for (int i = 0; i < splitString.size(); i++) {
            if(!map.get(String.valueOf(splitString.get(i))).equals("STOP")){
                stringList.add(map.get(String.valueOf(splitString.get(i)))+" ");
            }
            else {
               break;
            }
        }
        return stringList;
    }

    public static void main(String[] args) {
        ProtienTranslator protienTranslator = new ProtienTranslator();
        List<String> result = protienTranslator.Translate("UAGUGG");
        System.out.println(result);

    }
}
