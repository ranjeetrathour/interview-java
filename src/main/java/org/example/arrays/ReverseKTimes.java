package org.example.arrays;

import java.util.Arrays;

/**
 * same need to without extra space
 */
public class ReverseKTimes {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        System.out.println(Arrays.toString(rotateRight(arr,4)));
    }

    private static int[] rotateRight(int[] arr, int k) {
        int n = arr.length;
        k = k % n;
        int[] ans = new int[n];
        int index = 0;
        for (int i = n - k; i < n; i++) {
            ans[index++] = arr[i];
        }
        for (int i = 0; i < n - k; i++) {
            ans[index++] = arr[i];
        }

        return ans;
    }

}
