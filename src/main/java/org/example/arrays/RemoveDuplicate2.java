package org.example.arrays;

/**
 * leetcode 80
 */
public class RemoveDuplicate2 {
    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,3};
        int count=1;
        int times=1;
        int remove=0;

        for(int i=1; i<nums.length; i++){
            if(nums[i]==nums[i-1] && times<2){
                nums[count++]=nums[i];
                times++;
            }else if(nums[i]!=nums[i-1] && times>1){
                nums[count++]=nums[i];
                times--;
            }else if(nums[i]!=nums[i-1]){
                nums[count++]=nums[i];
            }else{
                remove++;
            }
        }

        System.out.println(nums.length-remove);
    }
}
