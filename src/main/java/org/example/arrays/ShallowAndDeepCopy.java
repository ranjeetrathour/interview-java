package org.example.arrays;

/**
 * shallow copy where only original reference get copy to new reference and point to same heap address
 * deep copy create an new memory in heap and copy all value from original array tp cloned array
 */
public class ShallowAndDeepCopy {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        System.out.println("original array");
        printArray(arr);

        /**
         * copy an array
         */
       /* int[] arr2 = arr;
        printArray(arr2);
        System.out.println("after change in copy array which is shallow copy");

        changeArray(arr2);
        System.out.println("after change in copy array print original array");
        printArray(arr);
        System.out.println("after change in copy array print copy array");
        printArray(arr2);*/

        /**
         * copy array which create an deep copy
         */
        int deepCopyOfArray [] = arr.clone();
        System.out.println("after change in copy array which is deep copy");

        changeArray(deepCopyOfArray);
        System.out.println("after change in copy array print original array");
        printArray(arr);
        System.out.println("after change in copy array print copy array");
        printArray(deepCopyOfArray);


    }

    static void changeArray(int arr[]){
        arr[0]=0;
        arr[1]=0;
    }

    static void printArray(int arr[]){
        for (int i:arr){
            System.out.println(i);
        }
    }
}
