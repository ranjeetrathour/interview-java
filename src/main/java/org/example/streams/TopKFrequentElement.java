package org.example.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class TopKFrequentElement {
    public static void main(String[] args) {
        int arr[] = {1,2,4,1,1,2,2,3,3};
        int k=2;
        System.out.println(Arrays.toString(getResult(arr,k)));
    }

    static int[] getResult(int arr[], int k){
        int result[] = new int[k];
        AtomicInteger atomicInteger = new AtomicInteger(-1);
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i:arr){
            map.put(i, map.getOrDefault(i,0)+1);
        }
        System.out.println(map);
        map.keySet().stream()
                .sorted((a,b)->map.get(b)-map.get(a))
                .limit(k).forEach(in->result[atomicInteger.incrementAndGet()]= in);
        return result;
    }
}
