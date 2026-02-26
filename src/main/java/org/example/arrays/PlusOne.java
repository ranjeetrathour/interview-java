package org.example.arrays;

import java.util.Arrays;

/**
 * leetcode 66
 */
public class PlusOne {
    public static void main(String[] args) {
        int[] digits = {3, 6, 1, 0};

        for (int i = digits.length - 1; i >= 0; i--) {
            digits[i]++;
            if (digits[i] == 10) {
                digits[i] = 0;
            } else {
                System.out.println(Arrays.toString(digits));
            }
        }
        int[] result = new int[digits.length + 1];
        result[0] = 1;
        System.out.println(Arrays.toString(result));
    }
}

