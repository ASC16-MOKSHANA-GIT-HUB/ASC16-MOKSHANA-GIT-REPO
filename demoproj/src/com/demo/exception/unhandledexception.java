package com.demo.exception;

public class unhandledexception {
    public static void main(String[] args) {
        int i = 100;
        System.out.println("divide by zero");
        int result = i / 0;
    } catch (exception exception)
    {
        System.out.println("Execution occured : " + exception);
    }
    System.out.println("abriptly terminated, so this does not run");
    System.out.println(result);
}
