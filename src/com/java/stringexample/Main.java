package com.java.stringexample;

public class Main {

    public static void main(String[] args) {
        // String comparisons
        String str1 = "Hello";
        String str2 = "World";

        if (str1.equals(str2)) {
            System.out.println("Strings are equal.");
        } else {
            System.out.println("Strings are not equal.");
        }

        // String methods
        String text = "   This is a sample text.   ";

        System.out.println("Length of the string: " + text.length());
        System.out.println("Substring: " + text.substring(5, 15));
        System.out.println("Uppercase: " + text.toUpperCase());
        System.out.println("Lowercase: " + text.toLowerCase());
        System.out.println("Trimmed string: " + text.trim());

        // String conversions
        int number = 123;
        String numberString = String.valueOf(number);
        System.out.println("Number as string: " + numberString);

        String priceString = "99.99";
        double price = Double.parseDouble(priceString);
        System.out.println("Price: " + price);

        // StringBuilder
        StringBuilder sb = new StringBuilder();

        sb.append("Java");
        sb.append(" is");
        sb.append(" awesome!");

        String result = sb.toString();

        System.out.println("Result: " + result);
    }
}
