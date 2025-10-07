package Lab1;

public class StringMethodsDemo {
    static void testCharAt(String str) {
        System.out.println("charAt(2): " + str.charAt(2));
    }

    static void testContains(String str, String s) {
        System.out.println("contains(\"" + s + "\"): " + str.contains(s));
    }

    static void testLength(String str) {
        System.out.println("length(): " + str.length());
    }

    static void testIndexOf(String str, String s) {
        System.out.println("indexOf(\"" + s + "\"): " + str.indexOf(s));
    }

    static void testEquals(String str, String s) {
        System.out.println("equals(\"" + s + "\"): " + str.equals(s));
    }

    static void testEqualsIgnoreCase(String str, String s) {
        System.out.println("equalsIgnoreCase(\"" + s + "\"): " + str.equalsIgnoreCase(s));
    }

    static void testJoin(String delimiter, String[] arr) {
        System.out.println("join with \"" + delimiter + "\": " + String.join(delimiter, arr));
    }

    static void testLastIndexOf(String str, String s) {
        System.out.println("lastIndexOf(\"" + s + "\"): " + str.lastIndexOf(s));
    }

    static void testSubstring(String str, int start, int end) {
        System.out.println("substring(" + start + ", " + end + "): " + str.substring(start, end));
    }

    static void testToLowerCase(String str) {
        System.out.println("toLowerCase(): " + str.toLowerCase());
    }

    static void testToUpperCase(String str) {
        System.out.println("toUpperCase(): " + str.toUpperCase());
    }

    static void testTrim(String str) {
        System.out.println("trim(): \"" + str.trim() + "\"");
    }

    public static void main(String[] args) {
        String text = "  Hello World  ";
        String compareText = "hello world";
        String[] words = {"Java", "Python", "C++"};

        testCharAt(text);                   // H (index 2 is 'l')
        testContains(text, "World");        // true
        testLength(text);                   // 15 (including spaces)
        testIndexOf(text, "o");             // first occurrence
        testEquals(text, compareText);      // false
        testEqualsIgnoreCase(text.trim(), compareText); // true
        testJoin("-", words);               // Java-Python-C++
        testLastIndexOf(text, "l");         // last occurrence of 'l'
        testSubstring(text, 2, 7);          // "Hello" (including spaces if any)
        testToLowerCase(text);              // "  hello world  "
        testToUpperCase(text);              // "  HELLO WORLD  "
        testTrim(text);                     // "Hello World"
    }
}
