package org.example.arrays;

/**
 * step to find seconde the largest
 * step 1. find the largest element from array
 * step 2. mark the largest value - infinity
 * step 3. find the largest element from manipulated array
 */
public class SecondLargestElement {
    public static void main(String[] args) {
        int[] arr = {1,2,5,3,9,48,67,23,45,8};
        //step first
        int max = maxValueOfArray(arr);
        //step second manipulate array
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==max){
                arr[i]=Integer.MIN_VALUE;
            }
        }
        //step second find again max which will be second largest
        int secondMax = maxValueOfArray(arr);
        System.out.println(secondMax);
    }

    static int maxValueOfArray(int[] arr){
        int max=Integer.MIN_VALUE;
        for (int i=0;i<arr.length-1; i++){
            if (arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }

}
