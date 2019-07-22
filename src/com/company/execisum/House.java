package com.company.execisum;

public class House {
    StringBuilder stringBuilder = new StringBuilder();
    String dayverse = "";
    String input="";

    String verses(int start, int end) {
        for (int i = start; i < end+1; i++) {
            input += chooseQuotes(i);
            if (i!= end)
                input += "\n";
        }
        stringBuilder.append(input);
        return stringBuilder.toString();
    }
    String verse(int end) {
        for (int i = 1; i <= end ; i++) {
            stringBuilder.append(chooseQuotes(i));
        }
        return stringBuilder.toString();
    }
    String sing() {
        for (int i = 1; i <= 12 ; i++) {
            stringBuilder.append(chooseQuotes(i));
        }
        return stringBuilder.toString();
    }

    String chooseQuotes(int number) {
        switch (number) {
            case 1:
                dayverse = ("This is the house that Jack built.");
                break;

            case 2:
                dayverse = ("This is the malt " +
                        "that lay in the house that Jack built.");
                break;

            case 3:
                dayverse = ("This is the rat " +
                        "that ate the malt " +
                        "that lay in the house that Jack built.");
                break;

            case 4:
                dayverse = ("This is the cat " +
                "that killed the rat " +
                        "that ate the malt " +
                        "that lay in the house that Jack built.");
                break;

            case 5:
                dayverse = ("This is the dog " +
                        "that worried the cat " +
                        "that killed the rat " +
                        "that ate the malt " +
                        "that lay in the house that Jack built.");
                break;

            case 6:
                dayverse = ("This is the cow with the crumpled horn " +
                        "that tossed the dog " +
                        "that worried the cat " +
                        "that killed the rat " +
                        "that ate the malt " +
                        "that lay in the house that Jack built.");
                break;

            case 7:
                dayverse = ( "This is the maiden all forlorn " +
                        "that milked the cow with the crumpled horn " +
                        "that tossed the dog " +
                        "that worried the cat " +
                        "that killed the rat " +
                        "that ate the malt " +
                        "that lay in the house that Jack built.");
                break;

            case 8:
                dayverse = ("This is the man all tattered and torn " +
                        "that kissed the maiden all forlorn " +
                        "that milked the cow with the crumpled horn " +
                        "that tossed the dog " +
                        "that worried the cat " +
                        "that killed the rat " +
                        "that ate the malt " +
                        "that lay in the house that Jack built.");
                break;

            case 9:
                dayverse = ("This is the priest all shaven and shorn " +
                        "that married the man all tattered and torn " +
                        "that kissed the maiden all forlorn " +
                        "that milked the cow with the crumpled horn " +
                        "that tossed the dog " +
                        "that worried the cat " +
                        "that killed the rat " +
                        "that ate the malt " +
                        "that lay in the house that Jack built.");
                break;

            case 10:
                dayverse = ( "This is the rooster that crowed in the morn " +
                        "that woke the priest all shaven and shorn " +
                        "that married the man all tattered and torn " +
                        "that kissed the maiden all forlorn " +
                        "that milked the cow with the crumpled horn " +
                        "that tossed the dog " +
                        "that worried the cat " +
                        "that killed the rat " +
                        "that ate the malt " +
                        "that lay in the house that Jack built.");
                break;

            case 11:
                dayverse = ( "This is the farmer sowing his corn " +
                        "that kept the rooster that crowed in the morn " +
                        "that woke the priest all shaven and shorn " +
                        "that married the man all tattered and torn " +
                        "that kissed the maiden all forlorn " +
                        "that milked the cow with the crumpled horn " +
                        "that tossed the dog " +
                        "that worried the cat " +
                        "that killed the rat " +
                        "that ate the malt " +
                        "that lay in the house that Jack built.");
                break;

            case 12:
                dayverse = ( "This is the horse and the hound and the horn " +
                        "that belonged to the farmer sowing his corn " +
                        "that kept the rooster that crowed in the morn " +
                        "that woke the priest all shaven and shorn " +
                        "that married the man all tattered and torn " +
                        "that kissed the maiden all forlorn " +
                        "that milked the cow with the crumpled horn " +
                        "that tossed the dog " +
                        "that worried the cat " +
                        "that killed the rat " +
                        "that ate the malt " +
                        "that lay in the house that Jack built.");
                break;
        }

        return dayverse;
    }

    public static void main(String[] args) {
        House house=new House();
        String result=house.verse(4);
        String result2=house.verses(3,5);
        String result3=house.sing();
        System.out.println(result);
        System.out.println(result2);
        System.out.println(result3);

    }
}
