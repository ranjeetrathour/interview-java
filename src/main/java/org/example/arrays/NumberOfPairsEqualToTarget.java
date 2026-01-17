package org.example.arrays;

import java.util.ArrayList;
import java.util.List;

public class NumberOfPairsEqualToTarget {
    public static void main(String[] args) {

        int[] arr = {4, 6, 3, 5, 8, 2};
        int target = 7;
        System.out.println(numberOfPairs(arr, target));
    }

    static List<List<Integer>> numberOfPairs(int[] arr, int target) {
        List<List<Integer>> listsPair = new ArrayList<>();
        for (int i = 0; i < arr.length ; i++) {

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    listsPair.add(List.of(arr[i], arr[j]));
                }
            }
        }
        return listsPair;
    }
}
