package com.company.execisum;

import java.util.Optional;

public class TwoFer {
    String twofer(String name) {
        return String.format("One for %s, one for me.",Optional.ofNullable(name).orElse("you"));

    }

    public static void main(String[] args) {
        TwoFer twoFer = new TwoFer();
        String result = twoFer.twofer("ovi");
        System.out.println(result);
    }
}

