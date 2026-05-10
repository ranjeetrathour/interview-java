package org.example.arrays.basic;


import java.util.Arrays;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SortZeoOneTwos {
    public static void main(String[] args) {
        int[] arr ={0,1,2,0,2,1,2,0,0,1};


        var res = Arrays.stream(arr)
                .boxed()
                .collect(Collectors.groupingBy(
                        i -> i,
                        TreeMap::new,
                        Collectors.counting()
                ))
                .entrySet()
                .stream().flatMapToInt(integerLongEntry ->
                        IntStream.generate(integerLongEntry::getKey)
                                .limit(integerLongEntry.getValue()))
                .toArray();

        System.out.println(Arrays.toString(res));

    }
}
