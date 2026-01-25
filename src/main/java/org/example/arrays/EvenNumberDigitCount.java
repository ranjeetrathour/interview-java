package org.example.arrays;

/**
 * leetcode 1295
 */
public class EvenNumberDigitCount {
    public static void main(String[] args) {
        int[] arr = {12,345,2,6,7896};
        System.out.println(evenNumberDigitCount(arr));
    }
    static int evenNumberDigitCount(int[]arr){
        int counter=0;
        for (int i = 0; i < arr.length ; i++) {
            var isEven = String.valueOf(arr[i]).length()%2==0;
            if (isEven){
                counter++;
            }
        }
        return counter;
    }
}
