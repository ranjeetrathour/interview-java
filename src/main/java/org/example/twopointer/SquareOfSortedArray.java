package org.example.twopointer;

import java.util.Arrays;

/**
 * leetcode 977
 */
public class SquareOfSortedArray {
    public static void main(String[] args) {
        int[] nums = {-4, -1, 0, 3, 10};
        int n = nums.length;

        int[] result = new int[n];
        int i = 0;
        int j = n - 1;
        int k = n - 1;

        while (i <= j) {
            if (Math.abs(nums[i]) > Math.abs(nums[j])) {
                result[k] = nums[i] * nums[i];
                i++;
            } else {
                result[k] = nums[j] * nums[j];
                j--;
            }
            k--;
        }
        System.out.println(Arrays.toString(result));
    }
}
