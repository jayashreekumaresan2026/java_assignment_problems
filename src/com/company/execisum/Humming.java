package com.company.execisum;

public class Humming {
    String leftStrand;
    String rightStrand;

    public Humming(String leftStrand, String rightStrand) throws IllegalArgumentException {
        if (leftStrand.isEmpty() || rightStrand.isEmpty()) {
            String expection = leftStrand.isEmpty() ? "left" : "right";
            expection += "left strand must not be empty.";
            throw new IllegalArgumentException(expection);
        } else if (leftStrand.length() != rightStrand.length()) {
            throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
        }
        this.leftStrand = leftStrand;
        this.rightStrand = rightStrand;
    }

    int getHummingDistance() {
        int count = 0;
        char[] leftStandArray = leftStrand.toCharArray();
        char[] rigthStandArray = rightStrand.toCharArray();
        for (int i = 0; i < leftStandArray.length; i++) {
            if (leftStandArray[i] != rigthStandArray[i]) {

                count += 1;
            }
        }
        return count;

    }
    public static void main(String[] args) throws IllegalArgumentException {
        Humming hummingDistance = new Humming("ACD", "GFFFF");
        int result = hummingDistance.getHummingDistance();
        System.out.println(result);
    }
}
