package org.example.slidingwindow.fixed;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class FirstNegativeNumberFromEachWindow {
    public static void main(String[] args) {
        int nums[] = {12,-1,-7,8,-15,30,16,28};
        int k=3;

        System.out.println(negativeNum(nums,k));
    }

    static List<Integer> negativeNum(int[] arr, int k){
        Queue<Integer> queue = new LinkedList<>();
        List<Integer> ans = new ArrayList<>();

        for (int i=0; i<k; i++){
            //add only neg
            if (arr[i]<0)queue.add(arr[i]);
        }

        if (queue.isEmpty()){
            ans.add(0);
        }else {
            ans.add(queue.peek());
        }

        for (int i = 1; i <arr.length-k+1 ; i++) {

           //remove element which is out from window is neg then remove from queue also
            if (arr[i-1]<0){
                queue.poll();
            }

            //checking new element is neg or pos if neg then add in queue
            if (arr[i+k-1]<0){
                queue.add(arr[i + k -1]);
            }
            ans.add(queue.isEmpty()?0: queue.peek());
        }

        return ans;
    }
}
