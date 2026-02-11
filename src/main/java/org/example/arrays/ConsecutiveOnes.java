package org.example.arrays;

/**
 *leetcode 485
 */
public class ConsecutiveOnes {
    public static void main(String[] args) {
        int[] nums = {1,1,0,0,1,1,1};
        System.out.println(findMaxConsecutiveOnes(nums));
    }

    static int findMaxConsecutiveOnes(int[] arr){
        int counter=0;
        int max=0;
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]==1){
                counter++;
            }else {
                max=Math.max(max,counter);
                counter=0;
            }
        }
        return Math.max(max,counter);
    }
}
