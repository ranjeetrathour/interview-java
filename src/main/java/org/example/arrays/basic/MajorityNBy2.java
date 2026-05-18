package org.example.arrays.basic;

public class MajorityNBy2 {
    public static void main(String[] args) {
        int []arr = {2,2,4,4,2,4,1,4,4,4,4,4,2,4,4,4,2};
        System.out.println(arr.length);
        int realValue = -1;
        for (int i = 0; i < arr.length; i++) {
            int counter =0;
            for (int j = i+1; j <arr.length ; j++) {
                if(arr[i]==arr[j]){
                    counter++;
                }
            }
            if(arr.length/2<=counter){
               realValue=arr[i];
            }
        }
        System.out.println(realValue);

    }
}
