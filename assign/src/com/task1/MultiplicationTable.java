package com.task1;

public class MultiplicationTable {

    // Using for loop
    static void printTableFor(int n) {
        System.out.println("\nMultiplication Table of " + n + " using for loop:");
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }

    public static void main(String[] args) {
        int number = 2; // You can change this number as needed

        printTableFor(number);
    }
}
