package Lab2;

import java.util.Scanner;

public class LargestNumberMethod {

    public static int largest(int a, int b, int c) {
        if (a >= b && a >= c) return a;
        else if (b >= a && b >= c) return b;
        else return c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 3 numbers 1: ");
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();

        System.out.println("Largest is: " + largest(a, b, c));
        sc.close();
    }
}
