package com.company.execisum;

public class DayTwelve {
    public static void main(String[] args) {
        class TwelveDays {

            String dayverse;
            String dayverses;
            String wholeverse;

            String verse(int verseNumber) {

                switch (verseNumber) {

                    case 1:
                        dayverse = ("On the first day of Christmas my true love gave to me: a Partridge in a Pear Tree.\n");
                        break;

                    case 2:
                        dayverse = ("On the second day of Christmas my true love gave to me: two Turtle Doves, and a Partridge in a Pear Tree.\n");
                        break;

                    case 3:
                        dayverse = ("On the third day of Christmas my true love gave to me: three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n");
                        break;

                    case 4:
                        dayverse = ("On the fourth day of Christmas my true love gave to me: four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n");
                        break;

                    case 5:
                        dayverse = ("On the fifth day of Christmas my true love gave to me: five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves,"
                                + " and a Partridge in a Pear Tree.\n");
                        break;

                    case 6:
                        dayverse = ("On the sixth day of Christmas my true love gave to me: six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge"
                                + " in a Pear Tree.\n");
                        break;

                    case 7:
                        dayverse = ("On the seventh day of Christmas my true love gave to me: seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens,"
                                + " two Turtle Doves, and a Partridge in a Pear Tree.\n");
                        break;

                    case 8:
                        dayverse = ("On the eighth day of Christmas my true love gave to me: eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, three"
                                + " French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n");
                        break;

                    case 9:
                        dayverse = ("On the ninth day of Christmas my true love gave to me: nine Ladies Dancing, eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four"
                                + " Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n");
                        break;

                    case 10:
                        dayverse = ("On the tenth day of Christmas my true love gave to me: ten Lords-a-Leaping, nine Ladies Dancing, eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying,"
                                + " five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n");
                        break;

                    case 11:
                        dayverse = ("On the eleventh day of Christmas my true love gave to me: eleven Pipers Piping, ten Lords-a-Leaping, nine Ladies Dancing, eight Maids-a-Milking, seven"
                                + " Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n");
                        break;

                    case 12:
                        dayverse = ("On the twelfth day of Christmas my true love gave to me: twelve Drummers Drumming, eleven Pipers Piping, ten Lords-a-Leaping, nine Ladies Dancing,"
                                + " eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves,"
                                + " and a Partridge in a Pear Tree.\n");
                        break;
                }

                return dayverse;
            }

            String verses(int startVerse, int endVerse) {

                dayverses = "";

                for(int i = startVerse; i<endVerse+1;i++){
                    dayverses = dayverses + this.verse(i);
                    if(i!=endVerse){
                        dayverses= dayverses + "\n";
                    }

                }

                return dayverses;
            }

            String sing() {

                wholeverse = "";
                wholeverse = wholeverse + this.verses(1,12);

                return wholeverse;

            }
        }
    }
}
