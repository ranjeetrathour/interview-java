package org.example.slidingwindow.fixed;

/**
 * leetcode 16
 */
public class ThreeClosestSum {
    public static void main(String[] args) {
        int[] nums={-1,2,1,-4};
        int target=1;
        int ws=3;

        int sum=0;
        for (int i = 0; i <ws ; i++) {
            sum+=nums[i];
        }
        if (sum==target){
            System.out.println(sum);
            return;
        }
        int value=sum;
        for (int i = 1; i <= nums.length-ws ; i++) {
            value=value-nums[i-1]+nums[i+ws-1];
            if (value==target){
                System.out.println(value);
                return;
            }
        }
        System.out.println(0);
    }
}
