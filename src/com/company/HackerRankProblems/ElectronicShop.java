//https://www.hackerrank.com/challenges/electronics-shop/problem
package com.company.HackerRankProblems;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class SelectItemsForBuy {
    int selectItemForBuy(int budget, List<Integer> keyboards, List<Integer> drives) {
        int result = -1;
        for (Integer integer : keyboards) {
            for (Integer value : drives) {
                if (integer + value <= budget && integer + value > result) {
                    result = integer + value;

                }
            }
        }
        return result;
    }
}

public class ElectronicShop {
    public static void main(String[] args) {
        ElectronicShop electronicShop=new ElectronicShop();
        SelectItemsForBuy selectItemsForBuy = new SelectItemsForBuy();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the budget, number of items in the first list and second list :");
        String[] input = scanner.nextLine().split(" ");
        List<String> arrayList = new ArrayList<>(Arrays.asList(input));
        int budget = Integer.parseInt(arrayList.get(0));
        int keyboards = Integer.parseInt(arrayList.get(1));
        int drives = Integer.parseInt(arrayList.get(2));
        List<Integer> firstList = electronicShop.getFirstList(scanner, keyboards);
        List<Integer> secondList = electronicShop.getSecondList(scanner, drives);
        int maxValue = selectItemsForBuy.selectItemForBuy(budget, firstList, secondList);
        System.out.println("Final budget cost: " + maxValue);
    }

     List<Integer> getSecondList(Scanner scanner, int drives) {
        System.out.println("Enter the items in the secondList");
        List<Integer> secondList = new ArrayList<>();
        for (int j = 0; j < drives; j++) {
            String secondArray = scanner.nextLine();
            secondList.add(Integer.parseInt(secondArray));
        }
        return secondList;
    }

     List<Integer> getFirstList(Scanner scanner, int keyboards) {
        System.out.println("Enter the items in the firstList");
        List<Integer> firstList = new ArrayList<>();
        for (int i = 0; i < keyboards; i++) {
            String firstArray = scanner.nextLine();
            firstList.add(Integer.parseInt(firstArray));
        }
        return firstList;
    }
}

