package org.example.twopointer;

import java.util.Arrays;

/**
 * Leetcode 283
 * code walk through simulator again
 */
public class MoveZeroesAtEndWithMaintainOrder {

    public static void main(String[] args) {
        int[] nums = {0, 0, 0, 3, 12};
        movesZero(nums);
        System.out.println(Arrays.toString(nums));
    }

    static void movesZero(int[] arr) {
        int i = 0;
        int j = 0;

        while (i < arr.length) {
            if (arr[i] != 0) {
                swap(arr, i, j);
                j++;
            }
            i++;
        }
    }

    static void swap(int[] arr, int s, int e) {
        int temp = arr[s];
        arr[s] = arr[e];
        arr[e] = temp;
    }
}
