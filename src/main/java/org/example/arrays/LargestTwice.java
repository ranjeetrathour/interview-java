package org.example.arrays;

import java.util.Arrays;

/**
 * leetcode 747 again have to do
 */
public class LargestTwice {
    public static void main(String[] args) {
        int nums[] = {3,6,1,0};
        //second largest;
//        Arrays.sort(nums);
        int firstLargest = Arrays.stream(nums).distinct().max().getAsInt();
        System.out.println(firstLargest);
        int secondLarget=Arrays.stream(nums).filter(value -> value!=firstLargest).max().getAsInt();
        System.out.println(secondLarget);
    }
}
