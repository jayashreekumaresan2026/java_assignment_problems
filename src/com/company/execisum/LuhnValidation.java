package com.company.execisum;

public class LuhnValidation {
//    boolean isValid(String s) {
//        int sum = 0;
//        int product = 0;
//        if (s.split("[^\\d\\s]").length > 1)
//            return false;
//        String validString = s.replace("\\D", "").strip();
//        char[] inputArray = validString.toCharArray();
//        for (int i = 0; i < inputArray.length; i++) {
//            int digit = Character.getNumericValue(inputArray[inputArray.length - 1 - i]);
//            if (i % 2 == 1) {
//                product = digit + digit;
//                if (product > 9) {
//                    sum += product - 9;
//                }
//            } else {
//                sum += digit;
//            }
//        }
//        return sum % 10 == 0;
//    }

    boolean isValid(String candidate) {
        if (candidate.split("[^\\d\\s]").length > 1) return false;
        char[] digits = candidate.replaceAll(" ", "").toCharArray();
        if (digits.length < 2) return false;
        int sum = 0;
        for (int i = 0; i < digits.length; i++) {
            int digit = Character.getNumericValue(digits[digits.length -1 -i]);
            if (i%2 == 1) {
                sum += doubleDigit(digit);
            } else {
                sum += digit;
            }
        }

        return sum % 10 == 0;
    }

    private int doubleDigit(int digitToDouble) {
        int retval = digitToDouble;
        retval *= 2;
        if (retval > 9) {
            retval -= 9;
        }
        return retval;
    }



    public static void main(String[] args) {
        LuhnValidation luhnValidation = new LuhnValidation();
        boolean result = luhnValidation.isValid("059a");
        System.out.println(result);
    }


}
