package org.example.arrays.basic;

import java.util.Arrays;
import java.util.stream.IntStream;

public class LargestElement {
    public static void main(String[] args) {
        int arr[] = {1, 9, 8, 4, 5, 6, 17};
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        System.out.println(largest);

        System.out.println(IntStream.of(arr).max().getAsInt());
    }
}
