package com.mytutorials.javacore.exceptions.codingwithjohn;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedUncheckedMain {

    public static void main(String[] args) throws FileNotFoundException {

        readFile("readme.txt"); // checked Exception

        String name = null;
        System.out.println(name.length()); // NPE

    }

    private static void readFile(String fileName) throws FileNotFoundException {
        FileReader fileReader = new FileReader(fileName);

    }
}
