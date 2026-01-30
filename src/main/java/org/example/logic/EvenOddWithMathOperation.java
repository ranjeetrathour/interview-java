package org.example.logic;

import java.util.Objects;

/**
 *
 */
public class EvenOddWithMathOperation {
    public static void main(String[] args) {
        int number = 8;
        var res = (number/2)*2;
        if (Objects.equals(number,res)){
            System.out.println("even");
        }else {
            System.out.println("odd");
        }
    }
}
