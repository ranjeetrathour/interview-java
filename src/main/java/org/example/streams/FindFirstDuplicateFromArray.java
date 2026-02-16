package org.example.streams;

import java.util.*;
import java.util.stream.Collectors;

/**
 * leetcode 287
 */
public class FindFirstDuplicateFromArray {
    public static void main(String[] args) {
        int nums[] = {1,3,4,2,2};

        Map<Integer, Long> collect = Arrays.stream(nums).boxed().collect(Collectors.groupingBy(o -> o, Collectors.counting()));
        Long l = collect.values().stream().filter(aLong -> aLong > 1).findFirst().get();

        /**
         * with set bcz need integer
         */

        Set<Integer> set = new HashSet<>();

        Optional<Integer> first = Arrays.stream(nums)
                .boxed().filter(integer -> !set.add(integer))
                .findFirst();
    }
}
