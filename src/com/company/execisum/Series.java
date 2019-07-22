package com.company.execisum;

import java.util.ArrayList;
import java.util.List;

public class Series {
    String input = "";
    List<String> numberList=new ArrayList<>();

    Series(String input) {
        this.input = input;
    }

    void slice(int sliceRange) {
        if (sliceRange> input.length() && sliceRange >= 0) {
            throw new IllegalArgumentException("Slice size is too big.");
        } else if (sliceRange <= -1||sliceRange==0) {
            throw new IllegalArgumentException("Slice size is too small.");
        }

       char[] charArray=input.toCharArray();

        for (int i = 0; i+sliceRange <=charArray.length; i++) {
            String result="";
            for (int j = 0; j < sliceRange; j++) {
                result +=charArray[i+j];
            }
            numberList.add(result);
        }
        System.out.println(numberList.toString());
    }


    public static void main(String[] args) {
        Series series = new Series("9142");
        series.slice(2);

    }

}
