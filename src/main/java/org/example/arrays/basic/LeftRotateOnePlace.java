package org.example.arrays.basic;

import java.util.Arrays;

/**
 *
 */
public class LeftRotateOnePlace {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int d = 3;
        int temp[] = new int[d];
       //fill temp arr
        for (int i = 0; i <d ; i++) {
            temp[i]=arr[i];
        }

        //fill first upto d
        for (int i = 0; i <=d ; i++) {
            arr[i]=arr[d+i];
        }

        //rest part of array
        int c=0;
        for (int i = d+1; i <arr.length ; i++) {
            arr[i]=temp[c++];
        }
        System.out.println(Arrays.toString(arr));
    }
}
