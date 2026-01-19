package org.example.arrays;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        System.out.println(Arrays.toString(reverse(arr)));
    }

    public static int[] reverse(int[] arr){
        int backCounter= arr.length-1;

        for (int i = 0; i < arr.length/2 ; i++) {
            int temp=arr[i];
            arr[i]=arr[backCounter];
            arr[backCounter]=temp;
            backCounter--;
        }
        return arr;
    }
}
