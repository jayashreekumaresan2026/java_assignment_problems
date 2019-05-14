package com.company;

import java.util.Scanner;
import java.lang.String;
import java.util.*;


class list_the_item {
    String name;
    int quantity;
    double price;

    list_the_item(String name, int quantity, double price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;

    }

    void show_item_name() {
        System.out.println(name);

    }

}

public class print_the_item_name {
    public static void main(String[] args) {
        int i;
        list_the_item[] item_array = new list_the_item[3];
        list_the_item item_list1= new list_the_item("pen", 2, 3);
        list_the_item item_list2= new list_the_item("pencil", 1, 1);
        list_the_item item_list3= new list_the_item("ball point pen", 2, 50);
        item_array[0]=item_list1;
        item_array[1]=item_list2;
        item_array[2]=item_list3;
        for (i=0;i<item_array.length;i++) {
            item_array[i].show_item_name();
        }

       Scanner items = new Scanner(System.in);
       System.out.print("enter the item name :");
       String name = items.nextLine();
       String[] words=name.split(" ");
//       for(String word :words)
//           System.out.println(word);
       ArrayList<String> wordArrayList = new ArrayList<>(Arrays.asList(words));
        String quantity=wordArrayList.get(0);
        String Name=wordArrayList.get(1);
        String cost=wordArrayList.get(3);
        System.out.println(quantity+" is quantity");
        System.out.println(Name+" is name");
        System.out.println(cost+" is cost of pen");
//       int j,length_of_array;
//       length_of_array=wordArrayList.size();
//       for(j=0;j<length_of_array;j++)
//       {
//          if(j!=length_of_array-2)
//          {
//              String index_word=wordArrayList.get(j);
//              System.out.println(index_word);
//          }
//       }
//        System.out.print("enter the quantity :");
//        int quantity = items.nextInt();
//        System.out.print("enter the cost :");
//        double cost = items.nextDouble();

    }
}
