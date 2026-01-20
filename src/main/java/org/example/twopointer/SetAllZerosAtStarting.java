package org.example.twopointer;

import java.util.Arrays;

public class SetAllZerosAtStarting {
    public static void main(String[] args) {
        int[] arr={1,0,0,1,0,1,0,1,0};
        System.out.println(Arrays.toString(setZeros(arr)));
    }
    static int[] setZeros(int[] arr){
        int s=0;
        int e=arr.length-1;
        while (s<e){
            if (arr[s]!=0 && arr[e]==0){
                swap(arr,s,e);
                s++;
                e--;
            } else if (arr[s]==0) {
                s++;
            } else {
                e--;
            }

        }
        return arr;
    }

    static void swap(int[] arr, int s, int e){
        int temp=arr[s];
        arr[s]=arr[e];
        arr[e]=temp;
    }
}
