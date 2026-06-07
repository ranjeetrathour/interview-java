package org.example.streams;

import java.util.Arrays;

public class PrintAllMethodNameOfAnyClass {
    public static void main(String[] args) {
        Arrays.stream(String.class.getDeclaredMethods()).forEach(method -> {
            System.out.println(method.getName());
        });
    }
}
