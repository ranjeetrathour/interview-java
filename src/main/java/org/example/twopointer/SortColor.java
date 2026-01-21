package org.example.twopointer;

import java.util.Arrays;

/**
 * leetcode 75
 * need to do again and dry run with simulator
 */
public class SortColor {
    public static void main(String[] args) {
        int[] arr={2,0,1};
        sortColor(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void sortColor(int[] arr){
        int s=0; int mid=0; int end= arr.length-1;

        while (mid<=end) {
            if (arr[mid]==0){
                swap(arr,s++,mid++);
            } else if (arr[mid]==1) {
                mid++;
            }else {
                swap(arr,mid,end--);
            }
        }
    }

    static void swap(int[] arr, int s, int e) {
        int temp = arr[s];
        arr[s] = arr[e];
        arr[e] = temp;
    }
}
