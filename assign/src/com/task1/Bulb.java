package com.task1;

public class Bulb {

    public void add(int a, int b) {
        System.out.println("Sum of two integers: " + (a + b));
    }
    public void add(int a, int b, int c) {
        System.out.println("Sum of three integers: " + (a + b + c));
    }

    public void add(double a, double b) {
        System.out.println("Sum of two doubles: " + (a + b));
    }

    public void add(String a, int b) {
        System.out.println("Concatenation: " + (a + " " + b));
    }

    public void add(short a, short b) {
        System.out.println("Sum of two shorts: " + (a + b));
    }

    public static void main(String[] args) {
        Bulb obj = new Bulb();

        obj.add(10, 20);
        obj.add(10, 20, 30);
        obj.add(10.5, 20.1);
        obj.add("Hello", 20);
        obj.add((short)5, (short)6);
    }
}