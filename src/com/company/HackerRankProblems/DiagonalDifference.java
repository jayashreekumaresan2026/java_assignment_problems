package com.company.HackerRankProblems;

import java.util.Scanner;

class FindDiagnols {
    int leftDiagonalCalculation(int[][] array) {
        int firstSum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i == j) {
                    firstSum += array[i][j];
                }
            }
        }
        return firstSum;
    }

    int rightDiagonalCalculation(int[][] array) {
        int length = array.length;
        int secondSum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i == length - j - 1) {
                    secondSum += array[i][j];
                }
            }
        }
        return secondSum;
    }

    int differenceCalculation(int firstDiagnalSum, int secondDiagnalSum) {
        int diagonalDifference = firstDiagnalSum - secondDiagnalSum;
        return diagonalDifference;
    }
}

public class DiagonalDifference {
    public static void main(String[] args) {
        FindDiagnols findDiagonals = new FindDiagnols();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns :");
        int userInput = scanner.nextInt();
        int[][] array = new int[userInput][userInput];
        for (int i = 0; i < userInput; i++) {
            for (int j = 0; j < userInput; j++) {
                array[i][j] = scanner.nextInt();
            }
        }
        int firstDiagonal = findDiagonals.leftDiagonalCalculation(array);
        int secondDiagonal = findDiagonals.rightDiagonalCalculation(array);
        int result = findDiagonals.differenceCalculation(firstDiagonal, secondDiagonal);
        System.out.println("DiagonalDifference of a matrix" + result);
    }
}
