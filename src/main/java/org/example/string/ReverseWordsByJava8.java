package org.example.string;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseWordsByJava8 {

    public static void main(String[] args) {
        String string = "hello my name is ranjeet";
        String[] s = string.split(" ");
        String reverseWords = Arrays.stream(s).map(s1 -> new StringBuilder(s1).reverse()).collect(Collectors.joining(" "));
        System.out.println(reverseWords);

    }

}
