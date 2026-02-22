package org.example.arrays;

import java.util.Arrays;

/**
 * leetcode 189
 */
public class RotateArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        int k=3;
        int n= nums.length;
        int t=k%n;
        int[] ans = new int[n];
        int index = 0;
        for (int i = n - k; i < n; i++) {
            ans[index++] = nums[i];
        }
        for (int i = 0; i < n - k; i++) {
            ans[index++] = nums[i];
        }

        for (int i = 0; i <nums.length ; i++) {
            nums[i]=ans[i];
        }

        System.out.println(Arrays.toString(nums));
    }
}
