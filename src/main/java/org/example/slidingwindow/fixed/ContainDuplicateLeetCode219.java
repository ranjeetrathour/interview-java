package org.example.slidingwindow;

public class ContainDuplicateLeetCode219 {
    public static void main(String[] args) {
        int nums[] = {0,1,2,3,2,5};
        int k=3;

        System.out.println(isDuplicate(nums,k));
    }

    static boolean isDuplicate(int arr[], int k){
        if (k==0){
            return false;
        }
        int sum=0;
        if (arr.length==2){
            return arr[0]==arr[1];
        }
        for (int i = 0; i <k ; i++) {
            if (i>0 && arr[i-1]==arr[i]){
                return true;
            }
            sum+=arr[i];
        }
        int sum1;

        for (int i = 1; i < arr.length+1-k ; i++) {
            sum1=sum-arr[i-1]+arr[i+k-1];
            if (sum1==sum){
                return true;
            }
        }
        return false;
    }
}
