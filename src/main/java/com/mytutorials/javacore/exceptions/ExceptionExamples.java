package com.mytutorials.javacore.exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionExamples {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        try {
            testException(-5);
            testException(-10); // never gets executed
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Releasing resources");
        }
        testException(15); // This provokes the "throws" in method signature -> propagating it to runtime

        java7Improvement();
    }

    public static void testException(int i) throws FileNotFoundException, IOException {
        if (i < 0) {
            throw new FileNotFoundException("Negative Integer " + i);
        } else if (i > 10) {
            throw new IOException("Only supported for index 0 to 10");
        } else if(i < -2){
            throw new IllegalArgumentException("NOT -5 PLZZZ");
        }
    }


    public static void java7Improvement() {
        try {
            testException(-5);
        } catch (IllegalArgumentException | IOException e) {
            e.printStackTrace();
        }
    }
}
