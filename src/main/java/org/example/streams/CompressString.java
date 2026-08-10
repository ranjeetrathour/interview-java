package org.example.streams;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CompressString {
    public static void main(String[] args) {
        String str = "aabbbbcccd";

        String compStr = Arrays.stream(str.split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .map(stringLongEntry -> stringLongEntry.getKey() + stringLongEntry.getValue())
                .collect(Collectors.joining());


        System.out.println(compStr);
    }
}
