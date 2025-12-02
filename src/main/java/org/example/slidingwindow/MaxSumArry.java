package org.example.slidingwindow;

public class MaxSumArry {
    public static void main(String[] args) {
        int arr[] = {2, 1, 5, 1, 3, 2};
        int k=3;
        System.out.println("max sum of sub array {} "+ maxSumOfArray(arr,k));
    }

    static int maxSumOfArray(int arr[], int k){
        int max=0;
        for (int i = 0; i < k; i++) {
            max+=arr[i];
        }


        int temp=max;
        for (int i=1; i<arr.length-k+1;i++){
            temp=temp-arr[i-1]+arr[i+k-1];
            max= Math.max(temp, max);
        }
        return max;
    }
}
