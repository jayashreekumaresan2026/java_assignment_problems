package com.company.execisum;

public class LargestSeriesProduct {

    String number;

    LargestSeriesProduct(String inputNumber) {
        if (!inputNumber.matches("^[0-9]+$") && inputNumber != "")
            throw new IllegalArgumentException("String to search may only contain digits.");
        this.number = inputNumber;
    }

    long calculateLargestProductForSeriesLength(int numberOfDigits) {
        if (numberOfDigits > number.length())
            throw new IllegalArgumentException("Series length must be less than or equal to the length of the string to search.");

        if (numberOfDigits < 0)
            throw new IllegalArgumentException("Series length must be non-negative.");

        long maxProd = 0;
        long prod;
        for (int i = 0; numberOfDigits+i <= number.length(); i++) {
            prod = 1;
            for (int j = 0; j < numberOfDigits; j++) {
                prod *= Character.getNumericValue(number.charAt(i + j));
            }
            if(prod>maxProd)
            {
               maxProd=prod;
            }

        }
        return maxProd;
    }

    public static void main(String[] args) {
        LargestSeriesProduct largestSeriesProduct = new LargestSeriesProduct("");
        long result = largestSeriesProduct.calculateLargestProductForSeriesLength(0);
        System.out.println(result);
    }
}
