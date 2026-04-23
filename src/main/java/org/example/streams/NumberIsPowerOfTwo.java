package org.example.streams;

import java.util.stream.IntStream;

public class NumberIsPowerOfTwo {
    public static void main(String[] args) {
        int num = 1024;

        boolean b = IntStream.iterate(1, i -> i * 2).limit(32)
                .anyMatch(value -> value == num);

        System.out.println(b);
    }
}
