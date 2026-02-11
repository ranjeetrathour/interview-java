package org.example.arrays;

/**
 * leetcode 1346
 */
public class DoubleExits {
    public static void main(String[] args) {
        int nums[] = {7,1,14,11};
        for (int i = 0; i < nums.length ; i++) {
            for (int j = 0; j <nums.length ; j++) {
                if (nums[i]==nums[j]*2 && i!=j){
                    System.out.println("true");
                }
            }
        }
    }
}
