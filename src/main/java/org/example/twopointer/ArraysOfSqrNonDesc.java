package org.example.twopointer;

import java.util.Arrays;

/**
 * i/p = {-10,-3,-2,1,4,5}
 * o/p = {1,4,9,16,25,100}
 */
public class ArraysOfSqrNonDesc {
    public static void main(String[] args) {

        int[] arr = {-10, -3, -2, 1, 4, 5};
        System.out.println(Arrays.toString(sortNonDesc(arr)));
    }

    static int[] sortNonDesc(int[] arr) {
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            if (Math.abs(arr[i]) > Math.abs(arr[j])) {
                swap(arr, i, j);
                arr[j] = arr[j] * arr[j];
                j--;
            } else {
                i++;
            }
        }
        return arr;
    }

    static void swap(int[] arr, int s, int e) {
        int temp = arr[s];
        arr[s] = arr[e];
        arr[e] = temp;
    }
}
