package org.example.streams;

import java.util.Arrays;

/**
 * leetcode 81
 */
public class SearchInRotatedArray {
    public static void main(String[] args) {
        int[] ar = {2,5,6,0,0,1,2};
        int t=0;
        boolean present = Arrays.stream(ar).boxed().filter(a -> a == t).findAny().isPresent();

        System.out.println(present);
    }
}
