package org.example.arrays;

import java.util.Arrays;

public class SmallAndLargetElementFromArray {
    public static void main(String[] args) {
        int[] arr = {100, 2, 2, 2, 2, 1};

        System.out.println(Arrays.toString(largestAndSmallestValue(arr)));
    }

    /**
     *
     * @param arr
     * @return smallest and largest element
     */
    static int[] largestAndSmallestValue(int[] arr){
        int small=arr[0];
        int large=arr[0];
        int i=1;
        int j=arr.length-1;
        /**
         * loop run n/2 so time complexity is O(n/2) -> O(n)
         */
        while (i<=j){
            if (small>arr[i]){
                small=arr[i];
            }
            if (large<arr[i]){
                large=arr[i];
            }
            if (small>arr[j]){
                small=arr[j];
            }
            if (large<arr[j]){
                large=arr[j];
            }
            i++;j--;
        }
        return new int[] {small,large};
    }
}
