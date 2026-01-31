package org.example.slidingwindow.fixed;

import java.util.ArrayList;
import java.util.List;

/**
 * leetcode 2461
 */
public class MaxSumDistinctSubArray {
    public static void main(String[] args) {
        int[] nums ={9,9,9,1,2,3};
        int k=3;
        int sum=0;
        int i=0;
        int max=Integer.MIN_VALUE;
        List<Integer> l = new ArrayList<>();
        while (l.size()<k && i<=nums.length-1){
            if (nums[i]==nums[i+1]){
                l.clear();
                i++;
            }else {
                l.add(nums[i++]);
            }
        }
        //first window
       /* for (int i = 0; i <k ; i++) {
            if (nums[i]==nums[i+1]){
                break;
            }
            sum+=nums[i++];
            if (i==k){
                max = Math.max(max,sum);
            }
        }*/

        sum = l.stream().mapToInt(Integer::intValue).sum();
        max=sum;
        System.out.println(i);
        i=i-1;
        for (; i < nums.length-1 ; i++) {
            if (nums[i]==nums[i+1]){
                l.removeFirst();
                l.add(nums[i]);
            }else{
                l.removeFirst();
                l.add(nums[i+1] );
                sum = l.stream().mapToInt(Integer::intValue).sum();
                max = Math.max(sum,max);
            }
        }
        System.out.println(max);
    }
}
