package org.example.arrays;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public static void main(String[] args) {
        int i = 5;
        List<List<Integer>> result = new ArrayList<>();
        result.add(List.of(1));
        for (int j = 1; j < i; j++) {
            List<Integer> l = new ArrayList<>();
            l.add(1);
            var preRow = result.get(j - 1);
            for (int k = 1; k < j; k++) {
                l.add(preRow.get(k - 1) + preRow.get(k));
            }
            l.add(1);
            result.add(l);
        }

        System.out.println(result);
    }
}