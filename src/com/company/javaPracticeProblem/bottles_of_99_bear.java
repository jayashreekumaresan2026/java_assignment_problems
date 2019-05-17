package com.company.javaPracticeProblem;

public class bottles_of_99_bear {

    public static void main(String[] args) {
        int beerNumber = 99;
        String word = "bottles";
        while (beerNumber > 0) {
            if (beerNumber == 1) {
                word = "bottle";
            }
            System.out.println(beerNumber + " " + word + " of beer on the wall");
            System.out.println(beerNumber + " " + word + " of beer");
            System.out.println("Take one down.");
            System.out.println("pass it around.");
            beerNumber = beerNumber - 1;
            if (beerNumber > 0) {
                continue;
            } else {
                System.out.println("No more beer on the wall");
            }


        }
    }
}
