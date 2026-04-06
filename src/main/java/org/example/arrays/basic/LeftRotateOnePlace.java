package org.example.arrays.basic;

import java.util.Arrays;

public class LeftRotateOnePlace {
    public static void main(String[] args) {
       int[] arr = {1,2,3,4,5};
        int timesOfRotate=5;
        int backCounter=arr.length-1;
        for (int i = 0; i <timesOfRotate% arr.length ; i++) {
            int temp=arr[backCounter];
            arr[backCounter]=arr[i];
            arr[i]=temp;
            backCounter--;
        }
        System.out.println(Arrays.toString(arr));
    }
}
