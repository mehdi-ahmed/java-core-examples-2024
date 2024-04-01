package com.mytutorials.javacore.java17.records;

public record Car(String make, String model, int year) {
    // No need for explicit getters, toString, hashCode, and equals methods.
}
