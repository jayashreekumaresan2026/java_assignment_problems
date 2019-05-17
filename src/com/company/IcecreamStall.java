package com.company;
import java.util.Scanner;
import java.lang.String;
import java.util.ArrayList;

class items_name{
    int i;
    void get_items(int total_item,String[] array) {

        System.out.println("Icecream menu list");
        for (i = 0; i < total_item; i++) {
            System.out.println("items :" + array[i]);
        }

    }

}
class items_flavour{
    int i;
    void get_flavour(int total_item,String[] flavour_array){
        System.out.println("Icecream flavour list");
        for (i = 0; i < total_item; i++) {
            System.out.println("flavours :" + flavour_array[i]);
        }
    }
}

public class Icecream_stall {
    public static void main(String[] args) {
        int i;
        items_name object1=new items_name();
        items_flavour object2=new items_flavour();
        System.out.print("enter the number of your item");
        Scanner keyboard = new Scanner(System.in);
        int total_item= keyboard.nextInt();
        System.out.println("enter the items name");
        String name_array[] = new String[total_item];
        for (i = 0; i < total_item; i++) {
            name_array[i] = keyboard.nextLine();

        }
        System.out.println("enter the items flavour");
        String flavour_array[] = new String[total_item];
        for (i = 0; i < total_item; i++) {
            flavour_array[i] = keyboard.nextLine();

        }
        object1.get_items(total_item,name_array);
        object2.get_flavour(total_item,flavour_array);
        }


    }


