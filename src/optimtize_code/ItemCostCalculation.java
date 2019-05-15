package optimtize_code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class ItemMenu {
    String name;
    int quantity;
    double price;

    void getItemDetail(String name, int quantity, double price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;

    }

    void showItemName() {

        System.out.println(name + "   " + quantity + "   " + price + " ");
    }


}


class ExtractCostQuantityName {
    void getSentence(String sentence) {
        String[] words = sentence.split(" ");
        ArrayList<String> wordArrayList = new ArrayList<>(Arrays.asList(words));
        String quantity = wordArrayList.get(0);
        int quantityInInteger = Integer.parseInt(quantity);
        String itemName = wordArrayList.get(1);
        String cost = wordArrayList.get(3);
        double costInInteger = Double.parseDouble(cost);
        System.out.println(quantityInInteger + " is quantity");
        System.out.println(itemName + " is name");
        System.out.println(costInInteger + " is cost of pen");

    }

}


public class ItemCostCalculation {
    public static void main(String[] args) {
        int i;
        ItemMenu[] itemArray = new ItemMenu[3];
        ItemMenu itemList1 = new ItemMenu();
        itemList1.getItemDetail("   Pen", 2, 3);
        ItemMenu itemList2 = new ItemMenu();
        itemList2.getItemDetail("Pencil", 1, 1);
        ItemMenu itemList3 = new ItemMenu();
        itemList3.getItemDetail("Marker", 2, 50);
        itemArray[0] = itemList1;
        itemArray[1] = itemList2;
        itemArray[2] = itemList3;
        for (i = 0; i < (itemArray.length); i++) {
            itemArray[i].showItemName();
        }
        System.out.print("enter the item name :");
        Scanner keyboard = new Scanner(System.in);
        String sentence = keyboard.nextLine();
        ExtractCostQuantityName CQN = new ExtractCostQuantityName();
        CQN.getSentence(sentence);
    }
}
