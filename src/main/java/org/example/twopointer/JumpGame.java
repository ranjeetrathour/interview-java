package org.example.twopointer;

/**
 * leetcode 45
 */
public class JumpGame {
    public static void main(String[] args) {
        int[] nums= {2,3,1,1,4};
        int i=0;
        int jump=0;
        while (i<nums.length){
            i=jump+1+i;
            jump++;
        }
        System.out.println(jump-1);
    }
}
