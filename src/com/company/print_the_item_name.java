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
        System.out.println("Item name :"+name);

    }



    void show_total_quantity() {
        double total_quantity;
        System.out.println("Normal price of the item");
        total_quantity=quantity*price;
        System.out.println(name+" is "+total_quantity);

        

    }
    void sales_tax_of_th_item(){
        double total_quantity,sales_tax;
        System.out.println("sales tax of the item");
        sales_tax=(15.00/100)+price;
        total_quantity=quantity*sales_tax;
        System.out.println(name+" is "+total_quantity);
    }

    }
class extract_item_from_list {
    void extract_the_item_from_the_sentence(String sentence) {

        String[] words = sentence.split(" ");
//       for(String word :words)
//           System.out.println(word);
        ArrayList<String> wordArrayList = new ArrayList<>(Arrays.asList(words));
        String quantity = wordArrayList.get(0);
        String Name = wordArrayList.get(1);
        String cost = wordArrayList.get(3);
        System.out.println(quantity + " is quantity");
        System.out.println(Name + " is name");
        System.out.println(cost + " is cost of pen");
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


    }
}
    public class print_the_item_name {
        public static void main(String[] args) {
            int i;
            list_the_item[] item_array = new list_the_item[4];
            list_the_item item_list1 = new list_the_item("pen", 2, 3);
            list_the_item item_list2 = new list_the_item("pencil", 1, 1);
            list_the_item item_list3 = new list_the_item("ball point pen", 2, 50);
            list_the_item item_list4 = new list_the_item("marker", 3, 10);
            item_array[0] = item_list1;
            item_array[1] = item_list2;
            item_array[2] = item_list3;
            item_array[3] = item_list4;
            for (i = 0; i < item_array.length; i++) {
                item_array[i].show_item_name();
                item_array[i].show_total_quantity();
                item_array[i].sales_tax_of_th_item();
            }

            Scanner items = new Scanner(System.in);
            System.out.print("enter the item name :");
            String sentence = items.nextLine();
            extract_item_from_list object = new extract_item_from_list();
            object.extract_the_item_from_the_sentence(sentence);
        }
    }

