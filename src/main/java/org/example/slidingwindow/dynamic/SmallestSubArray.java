package org.example.slidingwindow.dynamic;

import org.example.Main;

public class SmallestSubArray {
    public static void main(String[] args) {
        int[] arr = {1,1,1,1,1,1,1,1};
        int sum=0;
        int j=0;
        int target=11;
        int min = Integer.MAX_VALUE;
        int i=0;

        while (j< arr.length){
            sum=sum+arr[j];
            while (sum>=target){
                min=Math.min(min,j-i+1);
                sum=sum-arr[i];
                i++;
            }
            j++;
        }
        System.out.println(min);
    }
}
