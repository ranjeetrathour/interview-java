package org.example.arrays.basic;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalInt;

public class LongestSubArray {
    public static void main(String[] args) {
        int[] array = {1,2,3,1,1,1,1,1,2,3,4};
        int k = 3;

        List<List<Integer>> list = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            List<Integer> temp = new ArrayList<>();
            for (int j = i; j < array.length; j++) {
                temp.add(array[j]);
                list.add(new ArrayList<>(temp));
            }
        }

        OptionalInt max = list.stream()
                .filter(integers -> integers.stream().mapToInt(Integer::intValue).sum() == k)
                .toList()
                .stream()
                .map(List::size).mapToInt(Integer::intValue).max();
        System.out.println(max);
    }
}