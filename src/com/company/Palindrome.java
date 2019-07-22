package com.company;

public class Palindrome {
    boolean check(String str) {
        String IgnoreCase=str.toLowerCase();
        int start = 0;
        int end=str.length()-1;
        while (start <= end) {
            if(IgnoreCase.charAt(start)==IgnoreCase.charAt(end))
            {
                start++;
                end--;
            }
            else if(!(IgnoreCase.charAt(start)>='a'&& IgnoreCase.charAt(start)<='z')){
                 start++;
            }
            else if(!(IgnoreCase.charAt(end)>='a'&& IgnoreCase.charAt(end)<='z')){
                   end--;
            }
            else{
                return false;

            }
        }
        return true;
    }

    public static void main(String[] args) {
        Palindrome palindrome = new Palindrome();
        boolean result=palindrome.check("First ladies rule the State and state the rule: ladies first");
        System.out.println(result);

    }
}
