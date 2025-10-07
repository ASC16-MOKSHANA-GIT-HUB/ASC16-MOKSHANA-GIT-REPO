package com.demo.fund;

public class datatypes {
    public static void main(String[] args){
        System.out.println("datatypes");
        System.out.println("1. int");
        System.out.println("2. short");
        System.out.println("3. byte");
        System.out.println("4. long");
        System.out.println("5. float");
        System.out.println("6. double");
        System.out.println("7. char");
        System.out.println("8. boolean");
        //

        // Integer types
        byte byteVar = 100;               // 1 byte
        short shortVar = 10000;           // 2 bytes
        int intVar = 1000000000;          // 4 bytes
        long longVar = 100000000000L;     // 8 bytes (note the 'L' suffix)

        // Floating point types
        float floatVar = 5.75f;           // 4 bytes (note the 'f' suffix)
        double doubleVar = 19.99;         // 8 bytes

        // Character type
        char charVar = 'A';               // 2 bytes

        // Boolean type
        boolean boolVar = true;           // 1 bit (depends on JVM)

        // Print all values
        System.out.println("byte: " + byteVar);
        System.out.println("short: " + shortVar);
        System.out.println("int: " + intVar);
        System.out.println("long: " + longVar);
        System.out.println("float: " + floatVar);
        System.out.println("double: " + doubleVar);
        System.out.println("char: " + charVar);
        System.out.println("boolean: " + boolVar);
        // print the size of memory occupied by each data type
        System.out.println("\nSize of Primitive Data Types:");
        System.out.println("byte: " + Byte.BYTES + " bytes");
        System.out.println("short: " + Short.BYTES + " bytes");
        System.out.println("int: " + Integer.BYTES + " bytes");
        System.out.println("long: " + Long.BYTES + " bytes");
        System.out.println("float: " + Float.BYTES + " bytes");
        System.out.println("double: " + Double.BYTES + " bytes");
        System.out.println("char: " + Character.BYTES + " bytes");

        // assign default vaulues
        byte b = 0;
        short s = 0;
        int i = 0;
        long l = 0L;
        float f = 0.0f;
        double d = 0.0d;
        // The 'h\u0000' is the Unicode representation for the null character
        char c = '\u0000';
        boolean bool = false;
        System.out.println("\nDefault Values:");
        System.out.println("byte: " + b);
        System.out.println("short: " + s);
        System.out.println("int: " + i);
        System.out.println("long: " + l);
        System.out.println("float: " + f);
        System.out.println("double: " + d);
        System.out.println("char: " + c);
        System.out.println("boolean: " + bool);

    }
}