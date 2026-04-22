package org.example.arrays.basic;

public class MaximumConsecutiveOnes {
    public static void main(String[] args) {
        int[] arr = {1,1,0,1,1,1,0,1,1};
        int max=Integer.MIN_VALUE;
        int counter=0;
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]==1){
                counter++;
            }else if(arr[i]==0){
                max = Math.max(counter,max);
                counter=0;
            }
        }
        max = Math.max(counter,max);
        System.out.println(max);
    }
}
