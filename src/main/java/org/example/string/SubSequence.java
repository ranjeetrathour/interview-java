package org.example.string;

public class SubSequence {
    public static void main(String[] args) {
        String s = "abc";
        String t = "aabbccdef";

        String ss = "";
//        int index = 0; // pointer for s

        for (int i = 0; i < t.length()/* && index < s.length()*/; i++) {
            if (s.contains(Character.toString(t.charAt(i)))) {
                ss = ss + t.charAt(i);
//                index++;
            }
        }

        // Check if the built subsequence matches s
        boolean isSubsequence = ss.equals(s);
        System.out.println("Subsequence found: " + isSubsequence);
    }
}