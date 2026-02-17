package org.example.streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FrequecyUsigStream {
    public static void main(String[] args) {
        int[] arr =  {1,2,1,2,3,4,32,5,5,5,3};
        Map<Integer, Long> collect = Arrays.stream(arr).boxed().collect(Collectors.groupingBy(integer -> integer, Collectors.counting()));
        System.out.println(collect);


        // Convert int[] to List<Integer>
        List<Integer> list = Arrays.stream(arr)
                .boxed()
                .toList();

        // Print frequency of each element
        list.stream()
                .distinct()
                .forEach(i ->
                        System.out.println(i + " -> " + Collections.frequency(list, i))
                );
    }
}
