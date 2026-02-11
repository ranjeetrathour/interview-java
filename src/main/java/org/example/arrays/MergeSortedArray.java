package org.example.arrays;

import java.util.Arrays;

/**
 * leetcode 88
 */
public class MergeSortedArray {
    public static void main(String[] args) {
        int[] num = {1,2,3,0,0,0};
        int[] num1= {2,5,6};
        int n=3;
        int m=3;
        int k=m+n-1;
        int i=n-1; int j=m-1;

        while (i>=0&& j>=0){
            if (num[i]>num1[j]){
                num[k--]=num[i--];
            }else{
                num[k--]=num1[j--];
            }
        }

        while (i>=0){
            num[k--]=num[i--];
        }

        while (j>=0){
            num[k--]=num1[j--];
        }

        System.out.println(Arrays.toString(num));
    }
}
