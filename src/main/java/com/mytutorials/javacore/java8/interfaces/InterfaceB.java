package com.mytutorials.javacore.java8.interfaces;

public interface InterfaceB {

    void test();

    default void print() {
        System.out.println("Print from B");
    }
}
