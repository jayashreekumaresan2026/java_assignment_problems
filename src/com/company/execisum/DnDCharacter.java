package com.company.execisum;

import java.util.Random;

class DnDCharacter {

    private int strength;
    private int dexterity;
    private int constitution;
    private int intelligence;
    private int wisdom;
    private int charisma;

    public DnDCharacter() {
        this.strength = ability();
        this.dexterity = ability();
        this.constitution = ability();
        this.intelligence = ability();
        this.wisdom = ability();
        this.charisma = ability();
    }

    int ability() {
        Random rand = new Random();
        System.out.println(rand.nextInt(16));
        return rand.nextInt(16) + 3;
    }

    int modifier(int input) {
        return Math.floorDiv((input - 10), 2);
    }

    int getStrength() {
        return strength;
    }

    int getDexterity() {
        return dexterity;
    }

    int getConstitution() {
        return constitution;
    }

    int getIntelligence() {
        return intelligence;
    }

    int getWisdom() {
        return wisdom;
    }

    int getCharisma() {
        return charisma;
    }

    int getHitpoints() {
        return modifier(constitution) + 10;
    }

    public static void main(String[] args) {
        DnDCharacter dnDCharacter=new DnDCharacter();
        int result=dnDCharacter.modifier(3);
        System.out.println(result);
    }
}
