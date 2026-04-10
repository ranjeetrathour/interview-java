package org.example.arrays.basic;

import java.util.Arrays;

public class MoveZerosAtEnd {
    public static void main(String[] args) {
        int[] arr = {1,2,0,7,0,3,0,1};

        int count=0;
        for (int i=0; i< arr.length; i++){
            if (arr[i]!=0){
                arr[count++]=arr[i];
            }
        }
        for (int i=count;i< arr.length; i++){
            arr[count++]=0;
        }
        System.out.println(Arrays.toString(arr));
    }
}
