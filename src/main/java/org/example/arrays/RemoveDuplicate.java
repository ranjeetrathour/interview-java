package org.example.arrays;

import java.util.Arrays;

/**
 * leetcode 26
 */
public class RemoveDuplicate {
    public static void main(String[] args) {
        int[] nums= {1,1,2};
        int count=1;
        for (int i=1; i<nums.length; i++){
            if (nums[count-1]!=nums[i]){
                nums[count++]=nums[i];
            }
        }
//        System.out.println(removeDuplicateCount(nums));
        System.out.println(Arrays.toString(nums));
    }

    static int removeDuplicateCount(int[] nums) {
        if (nums.length == 0) return 0;

        int j = 0; // slow pointer

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[j]) {
                j++;
                nums[j] = nums[i];
            }
        }
        return j + 1;
    }

}
