package com.demo.packages.p1;

public class p1c1 {
    private String privateVar = "private var";
    private void privateMethod(){
        System.out.println("private method");
    }

    String packagePrivateVar = "package private var";
    void packagePrivateMethod(){
        System.out.println("packageprivatemethod");
    }
    protected String protectedVar = "protected var";
    protected void protectedMethod() {
        System.out.println("protectedmethod");
    }

    public static void main(String[] args){
        p1c1 P1c1 = new p1c1();
        System.out.println(P1c1.privateVar);
        P1c1.privateMethod();
        System.out.println(P1c1.packagePrivateVar);
        P1c1.packagePrivateMethod();
        System.out.println(P1c1.protectedVar);
        P1c1.protectedMethod();
    }
}