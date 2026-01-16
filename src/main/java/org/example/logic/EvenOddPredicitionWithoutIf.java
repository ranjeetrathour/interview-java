package org.example.logic;

public class EvenOddPredicitionWithoutIf {
    public static void main(String[] args) {

        System.out.println(isEvenOrOdd(8));
    }

    static String isEvenOrOdd(int n){
        String[] checker = {"Even","Odd"};
        return checker[n%2];
    }
}
