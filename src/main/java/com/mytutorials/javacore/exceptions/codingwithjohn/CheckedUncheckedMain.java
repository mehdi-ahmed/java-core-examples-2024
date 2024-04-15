package com.mytutorials.javacore.exceptions.codingwithjohn;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CheckedUncheckedMain {

    public static void main(String[] args) throws FileNotFoundException {

        // readFile("readme.txt"); // checked Exception

        // String name = null;
        // System.out.println(name.length()); // NPE

        System.out.println(parseFile("/home/fake-path/")); // David
    }

    private static void readFile(String fileName) throws FileNotFoundException {
        FileReader fileReader = new FileReader(fileName);
    }


    private static String parseFile(String filePath) {
        String name = "David";
        try {
            throw new IOException();
        } finally {
            return name;
        }
    }
}
