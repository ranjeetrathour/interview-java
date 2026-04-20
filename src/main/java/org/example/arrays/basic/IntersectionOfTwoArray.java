package org.example.arrays.basic;

import java.util.ArrayList;
import java.util.List;

public class IntersectionOfTwoArray {
    public static void main(String[] args) {
        int[] A = {1,2,2,3,3,4,5,6};
        int[] B = {2,3,3,5,6,6,7};

        List<Integer> list = new ArrayList<>();
        List<Integer> visitedIndex = new ArrayList<>();
        for (int i = 0; i <A.length ; i++) {
            for (int j = 0; j < B.length ; j++) {
                if (A[i]==B[j] &&  !visitedIndex.contains(j)){
                    list.add(A[i]);
                    visitedIndex.add(j);
                }
            }
        }
        System.out.println(list);
    }
}
