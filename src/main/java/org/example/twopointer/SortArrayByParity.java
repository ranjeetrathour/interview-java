package org.example.twopointer;

/**
 * leetcode 905
 */
public class SortArrayByParity {
    public static void main(String[] args) {
        int nums[] = {3,1,2,4};
        int i=0; int j=nums.length-1;

        while(i<j){
            if(nums[i]%2!=0 && nums[j]%2==0){
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                i++;j--;
            }else if(nums[i]%2==0){
                i++;
            }else if(nums[j]%2!=0){
                j--;
            }else{
                i++;j--;
            }
        }
    }
}
