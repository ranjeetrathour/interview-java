package org.example.arrays.basic;

import java.util.Arrays;

public class LeftRotateOnePlace {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int d = 3;

        d = d % arr.length;
        int n = arr.length;

        // Reverse first part (0 to d-1)
        int start = 0, end = d - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

        // Reverse second part (d to n-1)
        start = d;
        end = n - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

        // Reverse whole array (0 to n-1)
        start = 0;
        end = n - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

        System.out.println(Arrays.toString(arr));
    }
}

// this is brute force
/**
 *   int temp[] = new int[d];
 *        //fill temp arr
 *         for (int i = 0; i <d ; i++) {
 *             temp[i]=arr[i];
 *         }
 *
 *         //fill first upto d
 *         for (int i = 0; i <=d ; i++) {
 *             arr[i]=arr[d+i];
 *         }
 *
 *         //rest part of array
 *         int c=0;
 *         for (int i = d+1; i <arr.length ; i++) {
 *             arr[i]=temp[c++];
 *         }
 */
