package org.example.streams;

import java.util.List;

public class IntersectionOfTwoList {
    public static void main(String[] args) {
        List<Integer> list1 = List.of(1,2,3,3,4,5);
        List<Integer> list2 = List.of(3,4,5,6,7,3);

        list1.stream().filter(list2::contains)
                .forEach(System.out::println);
    }
}
