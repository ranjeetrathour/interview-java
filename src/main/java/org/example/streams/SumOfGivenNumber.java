package org.example.streams;

public class SumOfGivenNumber {
    public static void main(String[] args) {
        int num=12345;
        System.out.println(String.valueOf(num)
                .chars()
                .map(Character::getNumericValue)
                .sum());
    }
}
