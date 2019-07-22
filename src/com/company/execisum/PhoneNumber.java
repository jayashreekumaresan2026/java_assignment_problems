package com.company.execisum;

    public class PhoneNumber {

        private String number;

        public PhoneNumber(String number) {
            String newNumber = number.replaceAll("[()\\- .+]", "");
            if (newNumber.matches(".*[a-z]+.*")) {
                throw new IllegalArgumentException("letters not permitted");
            }
            if (newNumber.matches(".*[@:!]+.*")) {
                throw new IllegalArgumentException("punctuations not permitted");
            }
            if (newNumber.length() == 11) {
                if (!newNumber.startsWith("1")) {
                    throw new IllegalArgumentException("11 digits must start with 1");
                }
                newNumber = newNumber.substring(1);
            }


            if (newNumber.length() < 10) {
                throw new IllegalArgumentException("incorrect number of digits");
            } else if (newNumber.length() > 11) {
                throw new IllegalArgumentException("more than 11 digits");
            }

            if (newNumber.substring(0, 1).equals("0")) {
                throw new IllegalArgumentException("area code cannot start with zero");
            } else if (newNumber.substring(0, 1).equals("1")) {
                throw new IllegalArgumentException("area code cannot start with one");
            }

            if (newNumber.substring(3, 4).equals("0")) {
                throw new IllegalArgumentException("exchange code cannot start with zero");
            } else if (newNumber.substring(3, 4).equals("1")) {
                throw new IllegalArgumentException("exchange code cannot start with one");
            }
            this.number = newNumber;
        }

        public String getNumber() {
            return number;
        }


    public static void main(String[] args) {
        PhoneNumber phoneNumber = new PhoneNumber("1 (023) 456-7890");
        String number=phoneNumber.getNumber();
        System.out.println(number);

    }


}
