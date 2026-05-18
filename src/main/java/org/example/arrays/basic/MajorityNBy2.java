package org.example.arrays.basic;

import java.util.Arrays;

public class MajorityNBy2 {
    public static void main(String[] args) {
        int[] arr = {2, 2, 4, 4, 2, 4, 1, 4, 4, 4, 4, 4, 2, 4, 4, 4, 2};
        int cnt=0;
        int ele=0;

        for (int j : arr) {
            if (cnt == 0) {
                cnt++;
                ele = j;
            } else if (ele == j) {
                cnt++;
            } else {
                cnt--;
            }
        }
        int cnt1=0;
        for (int j : arr) {
            if (j == ele) {
                cnt1++;
            }
        }
        if (cnt1>arr.length/2){
            System.out.println(ele);
        }
    }
}

/**
 * System.out.println(arr.length);
 * int realValue = -1;
 * for (int i = 0; i < arr.length; i++) {
 * int counter =0;
 * for (int j = i+1; j <arr.length ; j++) {
 * if(arr[i]==arr[j]){
 * counter++;
 * }
 * }
 * if(arr.length/2<=counter){
 * realValue=arr[i];
 * }
 * }
 * System.out.println(realValue);
 */

/**
 * better
 * int[] res = new int[9];
 *
 *         for (int i = 0; i < arr.length; i++) {
 *             res[arr[i]]=res[arr[i]]+1;
 *         }
 *
 *         for (int i = 0; i < res.length-1; i++) {
 *             if (res[i]>arr.length/2){
 *                 System.out.println(i);
 *             }
 *         }
 */
