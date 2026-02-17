package org.example.arrays;

import java.util.Arrays;

/**
 * leetcode 1051
 */
public class HightChecker {
    public static void main(String[] args) {
        int[] heights = {1,2,3,4,5};
        int[] expected = heights.clone();
        Arrays.sort(expected);
        int count=0;

        for (int i = 0; i < heights.length ; i++) {
            if (heights[i]!=expected[i]){
                count++;
            }
        }
        System.out.println(count);
    }
}
