package com.company.execisum;

public class TwelDays {
    StringBuilder stringBuilder = new StringBuilder();
    String input = "";
    String[] verseArray = new String[]{"On the first day of Christmas my true love gave to me: a Partridge in a Pear Tree.\n",
            "On the second day of Christmas my true love gave to me: two Turtle Doves, and a Partridge in a Pear Tree.\n",
            "On the third day of Christmas my true love gave to me: three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n",
            "On the fourth day of Christmas my true love gave to me: four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n",
            "On the fifth day of Christmas my true love gave to me: five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves,"
                    + " and a Partridge in a Pear Tree.\n",
            "On the sixth day of Christmas my true love gave to me: six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge"
                    + " in a Pear Tree.\n",
            "On the seventh day of Christmas my true love gave to me: seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens,"
                    + " two Turtle Doves, and a Partridge in a Pear Tree.\n",
            "On the eighth day of Christmas my true love gave to me: eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, three"
                    + " French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n",
            "On the ninth day of Christmas my true love gave to me: nine Ladies Dancing, eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four"
                    + " Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n",
            "On the tenth day of Christmas my true love gave to me: ten Lords-a-Leaping, nine Ladies Dancing, eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying,"
                    + " five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n",
            "On the eleventh day of Christmas my true love gave to me: eleven Pipers Piping, ten Lords-a-Leaping, nine Ladies Dancing, eight Maids-a-Milking, seven"
                    + " Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n",
            "On the twelfth day of Christmas my true love gave to me: twelve Drummers Drumming, eleven Pipers Piping, ten Lords-a-Leaping, nine Ladies Dancing,"
                    + " eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves,"
                    + " and a Partridge in a Pear Tree.\n"

    };

    String verses(int start, int end) {
        for (int i = start; i < end + 1; i++) {
            input += verseArray[i-1];
            stringBuilder.append(input);
            if (i != end)
                input += "\n";

        }
        return stringBuilder.toString();
    }

    String verse(int end) {
        return verseArray[end-1];
    }

    String sing() {
        for (int i = 1; i < verseArray.length; i++) {
            stringBuilder.append(verseArray[i-1]);
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        TwelDays twelDays = new TwelDays();
//        String string = twelDays.verses(1, 3);
//        String wholeString = twelDays.verse(1);
        String result = twelDays.sing();
//        System.out.println(string);
//        System.out.println(wholeString);
        System.out.println(result);
    }
}
