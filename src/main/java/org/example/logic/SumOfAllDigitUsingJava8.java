package org.example.logic;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

public class SumOfAllDigitUsingJava8 {
    public static void main(String[] args) {
        int num=12345;
        AtomicInteger sum = new AtomicInteger(0);
        Arrays.stream(String.valueOf(num).split(""))
                .forEach(ele->sum.set(sum.get()+Integer.parseInt(ele)));
        System.out.println(sum);
    }
}
