package Lab1;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayStore {

    private int[] arr = new int[10];
    private int size = 0; // to track actual number of elements

    Scanner sc = new Scanner(System.in);

    public void acceptElements() {
        System.out.println("Enter 10 integers:");
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }
        size = 10;
    }

    public void displayFor() {
        System.out.println("Array elements (for loop):");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public void displayWhile() {
        System.out.println("Array elements (while loop):");
        int i = 0;
        while (i < size) {
            System.out.print(arr[i] + " ");
            i++;
        }
        System.out.println();
    }

    public void sortArray() {
        Arrays.sort(arr, 0, size);
        System.out.println("Array sorted: " + Arrays.toString(Arrays.copyOf(arr, size)));
    }

    public int countOccurrences(int num) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (arr[i] == num) count++;
        }
        return count;
    }

    public void insertAt(int num, int pos) {
        if (pos < 0 || pos > size || size >= arr.length) {
            System.out.println("Invalid position or array full.");
            return;
        }

        for (int i = size; i > pos; i--) {
            arr[i] = arr[i - 1];
        }
        arr[pos] = num;
        size++;
        System.out.println("Array after insertion: " + Arrays.toString(Arrays.copyOf(arr, size)));
    }

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
