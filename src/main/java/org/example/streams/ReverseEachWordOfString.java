package org.example.streams;

import java.util.Arrays;

public class ReverseEachWordOfString {
    public static void main(String[] args) {
        String message = "This is my test reverse question";

        String collect = String.join(" ",
                Arrays.stream(message.split(" "))
                        .map(s -> new StringBuilder(s).reverse())
                        .toList());

        System.out.println(collect);
    }
}
