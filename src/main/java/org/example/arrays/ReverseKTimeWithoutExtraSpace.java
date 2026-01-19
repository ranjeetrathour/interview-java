package org.example.arrays;

import java.util.Arrays;

public class ReverseKTimeWithoutExtraSpace {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        System.out.println(Arrays.toString(rotateRightWithoutExtraSpace(arr,4)));
    }

    static int[] reverseArray(int[] arr, int idx1, int idx2){
        while (idx1<=idx2){
            int temp=arr[idx1];
            arr[idx1]=arr[idx2];
            arr[idx2]=temp;
            idx1++;
            idx2--;
        }
        return arr;
    }

    static int[] rotateRightWithoutExtraSpace(int[] arr, int k){
        int n=arr.length;
        k=k%n;
        //reverse first part of array
        reverseArray(arr,0, n-k-1);
        //reverse second part
        reverseArray(arr,n-k,n-1);
        //reverse complete array
        return reverseArray(arr,0,n-1);

    }
}
