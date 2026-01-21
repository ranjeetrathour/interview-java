package org.example.arrays;

import java.util.Arrays;

/**
 * leetcode 26
 */
public class RemoveDuplicate {
    public static void main(String[] args) {
        int[] arr= {1,1,2};


        System.out.println(removeDuplicateCount(arr));
        System.out.println(Arrays.toString(arr));
    }

    static int removeDuplicateCount(int[] arr) {
        if (arr.length == 0) return 0;

        int j = 0; // slow pointer

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[j]) {
                j++;
                arr[j] = arr[i];
            }
        }
        return j + 1;
    }

}
