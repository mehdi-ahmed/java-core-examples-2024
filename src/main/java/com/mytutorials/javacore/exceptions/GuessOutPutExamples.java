package com.mytutorials.javacore.exceptions;

public class GuessOutPutExamples {

    public static void main(String[] args) {

        int i = guessOutput();
        System.out.println("i = " + i); // i = 3
    }

    @SuppressWarnings("finally")
    private static int guessOutput() {

        try {
            return 1;
        } catch (Exception e) {
            return 2;
        } finally {
            return 3;
        }
    }
}
