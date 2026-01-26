package org.example.twopointer;

import java.util.Arrays;

public class MergeTwoSortedArray {
    public static void main(String[] args) {
        int[] arr= {1,2,2,8,9,10};
        int[] arr1= {1,2,3,4,12,13,14};
        int i=0;
        int j=0;
        int[] result = new int[arr.length+arr1.length];
        int counter=0;
        while (i<arr.length && j<arr1.length){
            if (arr[i]==arr1[j]){
                result[counter++]=arr[i];
                result[counter++]=arr[j];
                j++;i++;
            } else if (arr[i]<arr1[j]) {
                result[counter++]=arr[i];
                i++;
            }else {
                result[counter++]=arr1[j];
                j++;
            }
        }
        if (i<arr.length){
           while (i<arr.length){
               result[counter++]=arr[i++];
           }
        }else {
            while (j<arr1.length){
                result[counter++]=arr1[j++];
            }
        }
        System.out.println(Arrays.toString(result));

    }
}
