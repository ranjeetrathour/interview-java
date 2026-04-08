package org.example.streams;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        String s = "this is my name";
        Character c1 = s.chars().mapToObj(value -> (char) value)
                .filter(c -> !Character.isSpaceChar(c))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream().filter(characterLongEntry -> characterLongEntry.getValue() == 1).map(Map.Entry::getKey).findFirst().get();

        System.out.println(c1);
    }
}
