package com.company.execisum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NucleotideCounter {
    static List<Character> NUCLEOTIDES = Arrays.asList('A', 'C', 'G', 'T');
    HashMap<Character,Integer> map=new HashMap<>();
    String word;

    public NucleotideCounter(String s) {
        this.word = s;
        for (Character chr : word.toCharArray()) {
            if (!NUCLEOTIDES.contains(chr)) {
                throw new IllegalArgumentException();
            }
        }
    }
    Map<Character,Integer> nucleotideCounts(){
        for (int i = 0; i <NUCLEOTIDES.size() ; i++) {
            map.put(NUCLEOTIDES.get(i),0);
        }
        for (Character chr : word.toCharArray()) {
            map.put(chr, map.get(chr) + 1);
        }
        return map;
    }

    public static void main(String[] args) {
        NucleotideCounter nucleotideCounter=new NucleotideCounter("AGXXACT");
        Map<Character,Integer> result= nucleotideCounter.nucleotideCounts();
        System.out.println(result.toString());
    }
}