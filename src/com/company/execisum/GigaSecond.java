package com.company.execisum;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

public class GigaSecond {
     LocalDateTime now;
     long GIGASECONDS = 1000000000L;

    GigaSecond(LocalDate moment) {
        this.now = moment.atStartOfDay();
    }

    GigaSecond(LocalDateTime moment) {
        this.now = moment;
    }

    LocalDateTime getDateTime() {
        return now.plusSeconds(GIGASECONDS);
    }

    public static void main(String[] args) {
        GigaSecond gigaSecond = new GigaSecond(LocalDate.of(2011, Month.APRIL, 25));
        LocalDateTime result = gigaSecond.getDateTime();
        System.out.println(result);

    }
}
