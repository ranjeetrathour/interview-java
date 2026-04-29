package org.example.streams;

import java.util.List;

public class ListOfIntegerFindStartWithOne {
    public static void main(String[] args) {
        List<Integer> listOfInteger = List.of(1,23,12,13,15,23,45);

        listOfInteger.stream()
                .filter(integer -> integer.toString().startsWith("1"))
                .forEach(System.out::println);
    }
}
