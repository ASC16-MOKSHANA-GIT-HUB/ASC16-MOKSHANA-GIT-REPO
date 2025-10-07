package com.demo.packages.p1;

public class p1c3 extends p1c1{
    public static void main(String[] args) {
        p1c3 P1c3 = new p1c3();
        P1c3.testaccess();
    }
    public void testaccess(){
        p1c1 P1c1 = new p1c1();
        System.out.println(P1c1.packagePrivateVar);
        P1c1.packagePrivateMethod();
        System.out.println(P1c1.protectedVar + " by creating an obejct of p1c1");
        P1c1.protectedMethod();
        System.out.println(P1c1.protectedVar + " by inhertance");
//        System.out.println(P1c1.privateVar);
//        P1c1.privateMethod();
    }
}