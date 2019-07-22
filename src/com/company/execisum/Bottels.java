package com.company.execisum;

public class Bottels {
    String sing(int limit, int remove) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = limit; i > (limit - remove); i--) {
            {
                checkTheBottle(stringBuilder, i);

            }
        }
        return stringBuilder.toString();

    }

    String singSong() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 99; i >= 0; i--) {
            checkTheBottle(stringBuilder,i);
        }
        return stringBuilder.toString();
    }


    private void checkTheBottle(StringBuilder stringBuilder, int i) {
        switch (i) {
            case 0: {
                stringBuilder.append("No more  bottles of beer on the wall, no more bottles of beer.\n"
                        + "Go to the store and buy some more, 99 bottles of beer on the wall.\n\n");
            }
            break;
            case 1: {
                stringBuilder.append(String.format("1 bottle of beer on the wall, 1 bottle of beer.\n" +
                        "Take it down and pass it around, no more bottles of beer on the wall.\n\n"));
            }
            break;
            case 2: {
                stringBuilder.append(String.format("2 bottles of beer on the wall, 2 bottles of beer.\n" +
                        "Take one down and pass it around, 1 bottle of beer on the wall.\n\n"));
            }
            break;
            default: {
                stringBuilder.append(String.format("%d bottles of beer on the wall, %d bottles of beer.\n"
                        + "Take one down and pass it around, %d bottles of beer on the wall.\n\n", i, i, (i - 1)));
            }
            break;
        }
    }

    public static void main(String[] args) {
        Bottels bottels = new Bottels();
        String string = bottels.sing(99, 1);
        String finalString = bottels.singSong();
        System.out.println(string);

    }
}
