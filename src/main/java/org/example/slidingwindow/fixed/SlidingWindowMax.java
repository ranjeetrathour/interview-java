package org.example.slidingwindow.fixed;

import java.util.*;

/**
 * leetcode 239
 */
public class SlidingWindowMax {
    public static void main(String[] args) {
        int[] nums = {1,3,-1,-3,5,3,6,7};
        int k=3;
        Deque<Integer> queue = new ArrayDeque<>();
        int newArray[] = new int[nums.length-k+1];
        int c=0;
        int max=Integer.MIN_VALUE;
        for (int i = 0; i <k ; i++) {
            max= Math.max(nums[i],max );
        }
        queue.add(max);
        newArray[c++]=max;

        for (int i = k; i <nums.length ; i++) {
            max=Math.max(queue.getLast(), nums[i]);
            queue.add(max);
            newArray[c++]=max;

        }
        System.out.println(Arrays.toString(newArray));
    }
}
