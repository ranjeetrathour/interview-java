package org.example.twopointer;

import java.util.ArrayList;
import java.util.List;

public class MergeTwoArray {
    public static void main(String[] args) {
        int arr[]={1,2,3,6,7};
        int arr1[]={1,2,4,5,8,9};

        int count1=0;
        int count2=0;
        List<Integer> list= new ArrayList<>();

        /**
         * if both counter is smaller than array length then will check both array
         * if any counter array exceed the array length then will add only one array to new array
         * for this will walk through new loop
         */
        while (count1<arr.length && count2<arr1.length){
            if (arr[count1]==arr1[count2]){
                list.add(arr[count1++]);
                list.add(arr1[count2++]);
            } else if (arr[count1]<arr1[count2]) {
                list.add(arr[count1++]);
            }else {
                list.add(arr1[count2++]);
            }
        }

        // adding remaining array
        while (count1<arr.length){
            list.add(arr[count1++]);
        }

        // adding remaining array
        while (count2<arr1.length){
            list.add(arr1[count2++]);
        }
        System.out.println(list);
    }
}
