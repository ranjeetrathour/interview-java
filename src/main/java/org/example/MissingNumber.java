package org.example;

import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5};

        var result = (((arr.length+1)*(arr.length+2))/2)-(Arrays.stream(arr).sum());
        System.out.println(result);
    }
}

/** this approach will work for sorted array
 *  int[] arr = {1,2,4,5};
 *         for (int i = 0; i <arr.length-1 ; i++) {
 *             if (arr[i]!=arr[i+1]-1){
 *                 System.out.println(arr[i]+1);
 *             }
 *         }
 */


/**  for unsorted array
 *      int[] arr = {1,2,4,5};
 *         int[] hash = new int[arr.length+2];
 *
 *         for (int i = 0; i <arr.length ; i++) {
 *             hash[arr[i]]=1;
 *         }
 *         for (int i = 1; i < hash.length ; i++) {
 *             if (hash[i]==0){
 *                 System.out.println(i);
 *             }
 *         }
 */
