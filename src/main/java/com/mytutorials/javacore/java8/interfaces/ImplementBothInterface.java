package com.mytutorials.javacore.java8.interfaces;

public class ImplementBothInterface implements InterfaceA, InterfaceB{


    @Override
    public void test() {
    }

    @Override
    public void print() {
        InterfaceA.super.print();
        InterfaceB.super.print();
    }
}
