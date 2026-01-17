package org.example.arrays;

public class FirstRepeatingNumber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 3};
        System.out.println(firstRepeatingNumber(arr));
    }

    static int firstRepeatingNumber(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return arr[i];
                }
            }
        }
        return -1;
    }
}
