package org.example.arrays;

public class IsGivenArraySorted {
    public static void main(String[] args) {
        int[] arr = {1,5,7,4,9,10,12,15,18};
        System.out.println(isArraySorted(arr));
    }

    static boolean isArraySorted(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                return false;
            }
        }
        return true;
    }

}
