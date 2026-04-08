package org.example.streams.collection;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicate {
    public static void main(String[] args) {
        List<Integer> i = List.of(1,1,2,3,2,1,5,6,6,7);
        Set<Integer> set = new HashSet<>();
        Set<Integer> dup = new HashSet<>();

        i.forEach(integer -> {
            if (!set.add(integer)){
                dup.add(integer);
            }
        });

        System.out.println(dup);
    }
}
