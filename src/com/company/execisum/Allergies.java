package com.company.execisum;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

enum Allergen {
    EGGS(1),
    PEANUTS(2),
    SHELLFISH(4),
    STRAWBERRIES(8),
    TOMATOES(16),
    CHOCOLATE(32),
    POLLEN(64),
    CATS(128);

    private final int score;

    Allergen(int score) {
        this.score = score;
    }

    int getScore() {
        return score;
    }
}
class Allergies {
        private List<Allergen> allergens = new ArrayList<>();

        public Allergies(int score) {
            for (Allergen allergen : Allergen.values()) {
                if ((allergen.getScore()&score) != 0) {
                    allergens.add(allergen);
                    score -= allergen.getScore();
                }
            }
            Collections.reverse(allergens);
        }

        public boolean isAllergicTo(Allergen allergen) {
            return allergens.contains(allergen);
        }

        public List<Allergen> getList() {
            return allergens;
        }

        public static void main(String[] args) {
            Allergies allergies=new Allergies(0);
            boolean result=allergies.isAllergicTo(Allergen.CATS);
            List<Allergen> finalResult=allergies.getList();
            System.out.println(finalResult.toString());
            System.out.println(result);

        }
}
