package com.company.HackerRankProblems;

import java.util.Scanner;

class FindSquare {
    double findSquareNumber(int firstNumber, int secondNumber) {
        return (Math.floor(Math.sqrt(secondNumber)) - Math.ceil(Math.sqrt(firstNumber)) + 1);
    }
}

class SherlockAndSquares {
    public static void main(String[] args) {
        FindSquare findSquare = new FindSquare();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first elements :");
        int firstNumber = scanner.nextInt();
        System.out.print("Enter the second number :");
        int secondNumber = scanner.nextInt();
        double result = findSquare.findSquareNumber(firstNumber, secondNumber);
        System.out.print("Number of square: " + result);
    }
}

