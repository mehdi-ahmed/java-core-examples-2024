package com.mytutorials.javacore.exceptions.codingwithjohn;

public class ExceptionHandling {

    public static void main(String[] args) {

        try {
            // code that may throw an exception
            getIntParsed();
            System.out.println("If there is an exception, this line is never reached");
        } catch (NumberFormatException ex) {
            // Code we want to execute if this type of exception happen.
            System.out.println("HEY BIATCH, you can't parse a String Nigga");
        } finally {
            System.out.println("I am always executed");
        }

        // guess
        System.out.println(gussOutput()); //66
    }

    private static void getIntParsed() {
        int myInt = Integer.parseInt("1");
    }


    private static int gussOutput() {
        try {
            return 3;
        } catch (NumberFormatException ex) {
            return 5;
        } finally {
            return 66; // OK
        }
    }
}

