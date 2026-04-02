package org.example.arrays.basic;

import java.util.stream.IntStream;

import static java.lang.System.*;

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {10, 5, 8};
        int largest = IntStream.of(arr).max().getAsInt();
        out.println( IntStream.of(arr).filter(v->v!=largest).max().getAsInt());
        int largest1 = arr[0];
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 1; i <arr.length ; i++) {
            if (arr[i]>largest1){
                secondLargest=largest1;
                largest1=arr[i];
            } else if (arr[i]<largest1 && arr[i]>secondLargest) {
                secondLargest=arr[i];
            }

        }
        out.println(secondLargest);
    }
}
