package org.example.arrays;


public class OccerenceOfElement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 6, 1, 2, 5, 2, 3, 5};
        int target = 2;
        System.out.println(occurenceCount(arr, target));
    }

    static int occurenceCount(int arr[], int k) {
        int counter = 0;
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            if (arr[start] == k) {
                counter++;
                start++;
                continue;
            }
            if (arr[end] == k) {
                counter++;
                end--;
                continue;
            }
            start++;
            end--;
        }
        return counter;
    }
}
