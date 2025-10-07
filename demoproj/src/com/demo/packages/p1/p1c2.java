package com.demo.packages.p1;

public class p1c2 {
    public static void main(String[] args) {
        p1c1 P1c1 = new p1c1();
        System.out.println(P1c1.packagePrivateVar);
        P1c1.packagePrivateMethod();
        System.out.println(P1c1.protectedVar);
        P1c1.protectedMethod();
    }
}
