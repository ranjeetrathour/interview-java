package org.example.arrays.basic;

public class LongestSubArray {
    public static void main(String[] args) {
        int[] array = {1,2,1,3,4,2,43,2,3,1,43,2,32,32,43,85};
        int k=3;
        int max=0;
        int res=0;
        for (int i = 0; i <k ; i++) {
            res+=array[i];
        }
        max = res;

        for (int i = 1; i <array.length-k+1; i++) {
            res=res-array[i-1]+array[i+k-1];
           max= Math.max(res,max);
        }
        System.out.println(max);
    }
}
