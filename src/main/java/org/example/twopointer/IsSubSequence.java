package org.example.twopointer;

/**
 * leetcode 392
 */
public class IsSubSequence {
    public static void main(String[] args) {
        String s = "abc";
        String t="ahbgdcc";
       int i=0; int j=0;

       while (i<s.length() && j<t.length()){
           if (s.charAt(i)==t.charAt(j)){
               i++;
           }
           j++;
       }

       boolean res = i==s.length();
        System.out.println(res);
    }
}
