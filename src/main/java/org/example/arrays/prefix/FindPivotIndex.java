package org.example.arrays.prefix;

import java.util.Arrays;

/**
 * leetcode 724 again have to do with the use of prefix sum
 */
public class FindPivotIndex {
    public static void main(String[] args) {
        int[] nums = {2,1,-1};
        int pre=0;
        int back=0;

        for (int i = 0; i < nums.length ; i++) {
            back=Arrays.stream(nums).limit(i).sum();
            pre= Arrays.stream(nums).skip(i+1).sum();
            if (back==pre){
                System.out.println(i);
            }
        }
    }
}
