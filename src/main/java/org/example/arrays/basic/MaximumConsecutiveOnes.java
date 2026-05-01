package org.example.arrays.basic;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

public class MaximumConsecutiveOnes {
    public static void main(String[] args) {
        int[] arr = {1,1,0,1,1,1,0,1,1};

        AtomicInteger count = new AtomicInteger(0);
        AtomicInteger max1 = new AtomicInteger(0);

        Arrays.stream(arr)
                .forEach(value -> {
                    if (value==1){
                        count.incrementAndGet();
                        max1.set(Math.max(max1.get(), count.get()));
                    }else{
                        count.set(0);
                    }
                });

        int max=Integer.MIN_VALUE;
        int counter=0;
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]==1){
                counter++;
            }else if(arr[i]==0){
                max = Math.max(counter,max);
                counter=0;
            }
        }
        max = Math.max(counter,max);
        System.out.println(max);
    }
}
