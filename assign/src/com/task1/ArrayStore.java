package com.task1;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayStore {

    private int[] arr = new int[10];
    private int size = 0; // to track actual number of elements

    Scanner sc = new Scanner(System.in);

    // Accept 10 integers
    public void acceptElements() {
        System.out.println("Enter 10 integers:");
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }
        size = 10;
    }

    // Display elements using for loop
    public void displayFor() {
        System.out.println("Array elements (for loop):");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Display elements using while loop
    public void displayWhile() {
        System.out.println("Array elements (while loop):");
        int i = 0;
        while (i < size) {
            System.out.print(arr[i] + " ");
            i++;
        }
        System.out.println();
    }

    // Sort the array
    public void sortArray() {
        Arrays.sort(arr, 0, size);
        System.out.println("Array sorted: " + Arrays.toString(Arrays.copyOf(arr, size)));
    }

    // Count occurrences of a number
    public int countOccurrences(int num) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (arr[i] == num) count++;
        }
        return count;
    }

    // Insert number at a specified position
    public void insertAt(int num, int pos) {
        if (pos < 0 || pos > size || size >= arr.length) {
            System.out.println("Invalid position or array full.");
            return;
        }
        // Shift elements to the right
        for (int i = size; i > pos; i--) {
            arr[i] = arr[i - 1];
        }
        arr[pos] = num;
        size++;
        System.out.println("Array after insertion: " + Arrays.toString(Arrays.copyOf(arr, size)));
    }

    // Return array excluding duplicates
    public int[] removeDuplicates() {
        int[] temp = new int[size];
        int newSize = 0;

        for (int i = 0; i < size; i++) {
            boolean exists = false;
            for (int j = 0; j < newSize; j++) {
                if (temp[j] == arr[i]) {
                    exists = true;
                    break;
                }
            }
            if (!exists) {
                temp[newSize++] = arr[i];
            }
        }
        return Arrays.copyOf(temp, newSize);
    }

    // Main method to test all features
    public static void main(String[] args) {
        ArrayStore store = new ArrayStore();
        store.acceptElements();
        store.displayFor();
        store.displayWhile();
        store.sortArray();

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to count occurrences: ");
        int num = sc.nextInt();
        System.out.println(num + " occurs " + store.countOccurrences(num) + " times.");

        System.out.print("Enter number to insert: ");
        int newNum = sc.nextInt();
        System.out.print("Enter position to insert (0-based index): ");
        int pos = sc.nextInt();
        store.insertAt(newNum, pos);

        int[] uniqueArr = store.removeDuplicates();
        System.out.println("Array with duplicates removed: " + Arrays.toString(uniqueArr));
    }
}