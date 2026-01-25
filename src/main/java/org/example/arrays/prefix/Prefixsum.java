package org.example.arrays.prefix;

import java.util.Arrays;

public class Prefixsum {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6};
        for (int i=1;i< arr.length;i++){
            arr[i]=arr[i-1]+arr[i];
        }
        System.out.println(Arrays.toString(arr));
    }

}
