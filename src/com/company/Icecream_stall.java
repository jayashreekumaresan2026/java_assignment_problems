package com.company;
import java.util.Scanner;
import java.lang.String;
import java.util.ArrayList;

class menu_items {
}

public class Icecream_stall {
    public static void main(String[] args) {
        int i;
        ArrayList<menu_items> list = new ArrayList<menu_items>();
        //Add a new ShoppingItem to the list
        System.out.println();
        System.out.println("enter the number of your item");
        Scanner keyboard = new Scanner(System.in);
        int total_item= keyboard.nextInt();
        System.out.println("enter the items name");
        String ice_cream_name = keyboard.nextLine();
        String array[] = new String[total_item];
        for (i = 0; i < total_item; i++) {
            array[i] = keyboard.nextLine();

        }
        System.out.println("Icecream menu list");
        for (i = 0; i < total_item; i++) {
            System.out.println("items :"+array[i]);
        }



        }


    }


