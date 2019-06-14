package com.company.HackerRankProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class GamesCalculation {
    int GamesBuyLimit(int startingPoint, int discountAmount, int discountLimit, int amount) {
        int sum = startingPoint, count = 1;
        while (startingPoint > discountLimit + discountAmount) {
            startingPoint = startingPoint - discountAmount;
            sum += startingPoint;
            count += 1;
        }
        while (sum + discountLimit <= amount) {
            count = count + 1;
            sum += discountLimit;
        }

        return count;
    }
}

public class HalloweenSale {
    public static void main(String[] args) {
        GamesCalculation gamesCalculation = new GamesCalculation();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the input String");
        String[] input = scanner.nextLine().split(" ");
        List<String> arrayList = new ArrayList<>(Arrays.asList(input));
        int doller = Integer.parseInt(arrayList.get(0));
        int discountAmount = Integer.parseInt(arrayList.get(1));
        int discountLimit = Integer.parseInt(arrayList.get(2));
        int amount = Integer.parseInt(arrayList.get(3));
        int result = gamesCalculation.GamesBuyLimit(doller, discountAmount, discountLimit, amount);
        System.out.println("count of games: " + result);
    }
}
