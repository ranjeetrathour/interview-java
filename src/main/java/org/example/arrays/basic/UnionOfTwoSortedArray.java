package org.example.arrays.basic;

import java.util.Arrays;
import java.util.stream.IntStream;

public class UnionOfTwoSortedArray {
    public static void main(String[] args) {
        int[] arr1 = {1, 1, 2, 3, 4, 5};
        int[] arr2 = {2, 3, 4, 4, 5};

        int[] result = new int[arr1.length + arr2.length];

        int i = 0, j = 0;
        int counter = 0;
        while (i < arr1.length && j < arr2.length) {

            if (arr1[i] < arr2[j]) {
                result[counter] = arr1[i];
                counter++;
                i++;
            } else if (arr1[i] > arr2[j]) {
                result[counter] = arr2[j];
                counter++;
                j++;
            } else {
                result[counter] = arr1[i];
                counter++;
                i++;
            }
        }

        while (i < arr1.length) {
            result[counter] = arr1[i];
            counter++;
            i++;
        }

        while (j < arr2.length) {
            result[counter] = arr2[j];
            counter++;
            j++;
        }

        int[] array = IntStream.concat(Arrays.stream(arr1), Arrays.stream(arr2))
                .sorted().toArray();

        System.out.println(Arrays.toString(array));
    }
}
