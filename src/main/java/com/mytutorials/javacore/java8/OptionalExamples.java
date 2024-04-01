package com.mytutorials.javacore.java8;

import java.util.Optional;

public class OptionalExamples {

    public static Optional<String> findValueById(int id) {
        // Logic to find the value by ID
        // Return Optional.of(value) if found, Optional.empty() otherwise
        System.out.println(id);
        return Optional.empty();
    }

    public static void main(String[] args) {

        Optional<String> optionalValue = findValueById(123);

        if (optionalValue.isPresent()) {
            String value = optionalValue.get();
            System.out.println("value = " + value);
        } else {
            // Handle the absence of the value
            System.out.println("no Optional value"); // no Optional value
        }

        // java 8 - functional programming constructs with Lambda

        optionalValue.ifPresent(value ->
                // Process the value
                System.out.println("value = " + value)
        );

        // Handle its absence
        optionalValue.orElseGet(() -> {
            String defaultValue = "default";
            System.out.println(defaultValue);
            return defaultValue;
        });
    }
}
