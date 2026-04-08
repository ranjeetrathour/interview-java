package org.example.streams;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharacterFrequency {
    public static void main(String[] args) {
        String s = "this is my name";

        Map<Character, Long> collect = s.chars().mapToObj(value -> (char) value)
                .filter(character -> !Character.isSpaceChar(character))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(collect);
    }
}
