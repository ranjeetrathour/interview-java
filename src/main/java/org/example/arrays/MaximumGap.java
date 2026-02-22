package org.example.arrays;

/**
 * leetcode
 */
public class MaximumGap {
    public static void main(String[] args) {
        int nums[] = {1,3,100};
        if(nums.length==1){

        }
        int maxGap=Integer.MIN_VALUE;
        for(int i=0; i<nums.length-1; i++){
            int minus = (nums[i]-nums[i+1]);
            if(minus<0){
                var v = Math.abs(minus);
                maxGap = Math.max(maxGap,v);
            }
        }

        System.out.println(Math.abs(maxGap));
    }
}
