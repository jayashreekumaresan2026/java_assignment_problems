package com.company.execisum;

public class IsbnVerifier {
    boolean isValid(String s) {
        int sum = 0, product = 10;
        if (s.length() > 0 && s.length() >= 10 && s.length()!=11) {
            String isbnNumber = s.replace("-", "");
            for (int i = 0; i < isbnNumber.length(); i++) {
                if (isbnNumber.charAt(i) == 'X') {
                    sum += 10;
                } else if (isbnNumber.charAt(i) != 'X' && Character.isDigit(isbnNumber.charAt(i))) {
                    sum += (Integer.parseInt(String.valueOf(isbnNumber.charAt(i)))) * product;
                    product = product - 1;
                }

            }
            if (sum % 11 == 0) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }

    }

    public static void main(String[] args) {
        IsbnVerifier isbnVerifier = new IsbnVerifier();
        boolean result = isbnVerifier.isValid("3-598-21507-X");
        System.out.println(result);
    }


}
