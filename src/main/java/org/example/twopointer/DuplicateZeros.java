package org.example.twopointer;

import java.util.Arrays;

/**
 * leetcode 1089
 */
public class DuplicateZeros {
    public static void main(String[] args) {

        int[] arr ={1,0,2,3,0,4,5,0};
        int newArray[] = new int[arr.length];

        int counter=0;
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] == 0) {
                if (counter < arr.length) newArray[counter++] = 0;
                if (counter < arr.length) newArray[counter++] = 0;
            } else {
                if (counter < arr.length) newArray[counter++] = arr[i];
            }

        }
        System.out.println(Arrays.toString(newArray));
    }
}
