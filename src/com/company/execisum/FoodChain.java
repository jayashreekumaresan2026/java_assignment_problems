package com.company.execisum;

class FoodChain {
    String verse(int verse) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(chooseQuotes(verse));
        return stringBuilder.toString();
    }

    String verses(int start, int end) {
        String input = "";
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = start; i < end + 1; i++) {
            input += chooseQuotes(i);
            if (i != end)
                input += "\n\n";
        }
        stringBuilder.append(input);
        return stringBuilder.toString();
    }

    String chooseQuotes(int number) {
        String dayverse = " ";
        switch (number) {
            case 1:
                dayverse = ("I know an old lady who swallowed a fly.\n" +
                        "I don't know why she swallowed the fly. Perhaps she'll die.");
                break;

            case 2:
                dayverse = ("I know an old lady who swallowed a spider.\n" +
                        "It wriggled and jiggled and tickled inside her.\n" +
                        "She swallowed the spider to catch the fly.\n" +
                        "I don't know why she swallowed the fly. Perhaps she'll die.");
                break;

            case 3:
                dayverse = ("I know an old lady who swallowed a bird.\n" +
                        "How absurd to swallow a bird!\n" +
                        "She swallowed the bird to catch the spider that wriggled and jiggled and " +
                        "tickled inside her.\n" +
                        "She swallowed the spider to catch the fly.\n" +
                        "I don't know why she swallowed the fly. Perhaps she'll die.");
                break;

            case 4:
                dayverse = ("I know an old lady who swallowed a cat.\n" +
                        "Imagine that, to swallow a cat!\n" +
                        "She swallowed the cat to catch the bird.\n" +
                        "She swallowed the bird to catch the spider that wriggled and jiggled and " +
                        "tickled inside her.\n" +
                        "She swallowed the spider to catch the fly.\n" +
                        "I don't know why she swallowed the fly. Perhaps she'll die.");
                break;

            case 5:
                dayverse = ("I know an old lady who swallowed a dog.\n" +
                        "What a hog, to swallow a dog!\n" +
                        "She swallowed the dog to catch the cat.\n" +
                        "She swallowed the cat to catch the bird.\n" +
                        "She swallowed the bird to catch the spider that wriggled and jiggled and " +
                        "tickled inside her.\n" +
                        "She swallowed the spider to catch the fly.\n" +
                        "I don't know why she swallowed the fly. Perhaps she'll die.");
                break;

            case 6:
                dayverse = ("I know an old lady who swallowed a goat.\n" +
                        "Just opened her throat and swallowed a goat!\n" +
                        "She swallowed the goat to catch the dog.\n" +
                        "She swallowed the dog to catch the cat.\n" +
                        "She swallowed the cat to catch the bird.\n" +
                        "She swallowed the bird to catch the spider that wriggled and jiggled and " +
                        "tickled inside her.\n" +
                        "She swallowed the spider to catch the fly.\n" +
                        "I don't know why she swallowed the fly. Perhaps she'll die.");
                break;

            case 7:
                dayverse = ("I know an old lady who swallowed a cow.\n" +
                        "I don't know how she swallowed a cow!\n" +
                        "She swallowed the cow to catch the goat.\n" +
                        "She swallowed the goat to catch the dog.\n" +
                        "She swallowed the dog to catch the cat.\n" +
                        "She swallowed the cat to catch the bird.\n" +
                        "She swallowed the bird to catch the spider that wriggled and jiggled and " +
                        "tickled inside her.\n" +
                        "She swallowed the spider to catch the fly.\n" +
                        "I don't know why she swallowed the fly. Perhaps she'll die.");
                break;
            case 8:
                dayverse=("I know an old lady who swallowed a horse.\n" +
                        "She's dead, of course!");
                break;
        }
        return dayverse;
    }

    public static void main(String[] args) {
        FoodChain foodChain = new FoodChain();
        String stringResult = foodChain.verse(1);
        String finalResult = foodChain.verses(1,8);
//        System.out.println(stringResult);
      System.out.println(finalResult);

    }
}
