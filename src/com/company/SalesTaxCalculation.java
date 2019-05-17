package com.company;

import java.util.Scanner;
import java.lang.String;
import java.util.*;


class list_the_item {

     String name;
     int quantity;
     double price;

    void show_detail(String name, int quantity, double price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;

    }

     String getName() {

        return name;
    }

    double calculate_the_cost(String Name,double costs,int quantities) {
        double cost_of_the_item;
        System.out.println("price of the item without sales tax");
        cost_of_the_item = quantities *costs;
//        System.out.println(Name + " is " + cost_of_the_item);
        return cost_of_the_item;

    }




double sales_tax_of_the_item() {
    double total_quantity, sales_tax;
//    System.out.println("sales tax of the item");
    sales_tax = (15.00 / 100) + price;
    total_quantity = quantity * sales_tax;
    return total_quantity;
//    System.out.println(name + " is " + total_quantity);

}


}

class extract_item_from_list {
    double extract_the_item_from_the_sentence(String sentence) {
        double item_cost;
        int length_of_array;
        list_the_item object1=new list_the_item();
        String[] words = sentence.split(" ");
//       for(String word :words)
//           System.out.println(word);
        ArrayList<String> wordArrayList = new ArrayList<>(Arrays.asList(words));
            String quantity = wordArrayList.get(0);
            int quantities = Integer.parseInt(quantity);
            String Name = wordArrayList.get(1);
            String cost = wordArrayList.get(3);
            double costs = Double.parseDouble(cost);
            System.out.println(quantities + " is quantity");
            System.out.println(Name + " is name");
            System.out.println(costs + " is cost of pen");
            item_cost = object1.calculate_the_cost(Name, costs, quantities);
        return item_cost;
        }

}

public class SalesTaxCalculation {
    public static void main(String[] args) {
        int i;
        double final_cost;
        double total_sales_tax=0;
        list_the_item[] item_array = new list_the_item[4];
        list_the_item item_list1 = new list_the_item();
        item_list1.show_detail("pen",2,3);
        list_the_item item_list2 = new list_the_item();
        item_list2.show_detail("pencil",1,1);
        list_the_item item_list3 = new list_the_item();
        item_list3.show_detail("ball point pen",2,50);

        item_array[0] = item_list1;
        item_array[1] = item_list2;
        item_array[2] = item_list3;

        for (i = 0; i < (item_array.length); i++) {
            System.out.println(item_array[i].getName());
            System.out.println();
            total_sales_tax+=item_array[i].sales_tax_of_the_item();
            System.out.println();

        }
        System.out.println("total " +total_sales_tax);
        System.out.println();

        Scanner items = new Scanner(System.in);
        System.out.println();
        System.out.print("enter the item name :");
        String sentence = items.nextLine();
        extract_item_from_list object = new extract_item_from_list();
        final_cost=total_sales_tax+object.extract_the_item_from_the_sentence(sentence);
        System.out.print("final_cost"+final_cost);
    }
}

