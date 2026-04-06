package org.example.arrays.basic;

import java.util.Arrays;

public class RemoveDuplicateInplace {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,3,3};
        int counter=0;
        int i=1;
        while (i<arr.length){
            if(arr[counter]!=arr[i]){
                counter++;
                arr[counter]=arr[i];
            }
            i++;
        }
        for (int j = counter+1; j < arr.length ; j++) {
            arr[j]=Integer.MIN_VALUE;
        }
        System.out.println(Arrays.toString(arr));
    }
}
