package org.example.twopointer;

import java.util.Arrays;

/**
 * leetcode 3794
 */
public class ReverseFirstKPrefix {
    public static void main(String[] args) {
        String s="xyz";
        int k=3;
        System.out.println(reverse(s,k));
    }
    static String reverse(String s, int k){
        int i=0; int j=k-1;
        StringBuilder builder = new StringBuilder(s);
        while (i<j){
            char c = s.charAt(i);
            builder.setCharAt(i,s.charAt(j));
            builder.setCharAt(j,c);
            i++;j--;
        }
       return builder.toString();
    }
}
