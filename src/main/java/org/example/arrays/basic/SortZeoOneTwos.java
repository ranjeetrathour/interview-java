package org.example.arrays.basic;


import java.util.Arrays;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SortZeoOneTwos {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 0, 2, 1, 2, 0, 0, 1};


        int low = 0;
        int mid = 0;
        int high = arr.length - 1;

        while (mid <= high) {
            switch (arr[mid]) {
                case 0:
                    swap(arr, low, mid);
                    mid++;
                    low++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    swap(arr, mid, high);
                    high--;
                    break;
            }
        }

        System.out.println(Arrays.toString(arr));

    }

    public static void swap(int[] arr, int i1, int i2) {
        int temp = arr[i1];
        arr[i1] = arr[i2];
        arr[i2] = temp;
    }
}

/**
 * using java 8 stream
 * var res = Arrays.stream(arr)
 * .boxed()
 * .collect(Collectors.groupingBy(
 * i -> i,
 * TreeMap::new,
 * Collectors.counting()
 * ))
 * .entrySet()
 * .stream().flatMapToInt(integerLongEntry ->
 * IntStream.generate(integerLongEntry::getKey)
 * .limit(integerLongEntry.getValue()))
 * .toArray();
 */
