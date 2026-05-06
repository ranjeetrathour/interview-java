package org.example.arrays.basic;

import java.util.HashMap;
import java.util.Map;

public class TwoPresentOrNot {
    public static void main(String[] args) {
        int arr[]={2,6,5,8,11};
        int t=14;


    }
}

/** brute force
 *   for (int i = 0; i < arr.length; i++) {
 *             for (int j = i+1; j < arr.length-i; j++) {
 *                 if (arr[i]+arr[j]==t){
 *                     System.out.println(true);
 *                     break;
 *                 }
 *             }
 *         }
 */

/** optimal
 *
 *  Map<Integer,Integer> map = new HashMap<>();
 *
 *         for (int i = 0; i < arr.length; i++) {
 *             map.put(arr[i],arr[i]);
 *             int sub = t-arr[i];
 *             if (map.containsKey(sub)){
 *                 System.out.println(true);
 *                 break;
 *             }
 *         }
 */
