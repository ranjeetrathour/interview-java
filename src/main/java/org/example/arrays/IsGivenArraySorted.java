package org.example.arrays;

import static java.lang.System.exit;

public class IsGivenArraySorted {
    public static void main(String[] args) {
        int[] arr = {1,5,7,9,10,12,15,18};

        for (int i = 0; i < arr.length-1 ; i++) {
            if (arr[i]>arr[i+1]){
                System.out.println("false");
                exit(0);
            }
        }
    }


}
