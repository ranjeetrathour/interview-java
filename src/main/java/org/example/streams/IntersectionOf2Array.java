package org.example.streams;

import java.util.*;
import java.util.stream.Collectors;

/**
 * leetcode 350
 */
public class IntersectionOf2Array {
    public static void main(String[] args) {
        int nums1[] = {4,4, 9, 5};
        int nums2[] = {9, 4, 9, 8, 4};

        // Step 1: Count frequencies of nums1
        Map<Integer, Long> freq1 = Arrays.stream(nums1)
                .boxed()
                .collect(Collectors.groupingBy(n -> n, Collectors.counting()));

        // Step 2: Count frequencies of nums2
        Map<Integer, Long> freq2 = Arrays.stream(nums2)
                .boxed()
                .collect(Collectors.groupingBy(n -> n, Collectors.counting()));

        // Step 3: Build intersection list with duplicates
        List<Integer> res = new ArrayList<>();
        for (Integer key : freq1.keySet()) {
            if (freq2.containsKey(key)) {
                long times = Math.min(freq1.get(key), freq2.get(key));
                for (int i = 0; i < times; i++) {
                    res.add(key);
                }
            }
        }

        System.out.println("Intersection: " + res);
    }
}
