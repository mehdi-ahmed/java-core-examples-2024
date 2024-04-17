package com.mytutorials.javacore.java8.interfaces;

public interface InterfaceA {

    void test();

    default void print() {
        System.out.println("Print from A");
    }
}
