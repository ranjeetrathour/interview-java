package org.example.streams;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class UniqueEvenNumber {
    public static void main(String[] args) {
        List<Integer> list = List.of(10,7,10,22,5,33,30,22,9,8);

        list.stream()
                .filter(integer -> integer % 2 == 0)
                .collect(Collectors.groupingBy(integer -> integer, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() == 1) //it return so will extract only key which i need that's why use map() function
                .map(Map.Entry::getKey)
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);

    }
}
