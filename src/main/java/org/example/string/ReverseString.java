package org.example.string;

import java.util.stream.Collectors;

public class ReverseString {
    public static void main(String[] args) {
        String s = "hello";

        StringBuilder reverse = new StringBuilder(
                s.chars()
                        .mapToObj(c -> String.valueOf((char) c))
                        .collect(Collectors.joining()))
                .reverse();
        System.out.println(reverse);
    }
}
