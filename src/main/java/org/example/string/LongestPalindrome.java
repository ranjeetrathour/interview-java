package org.example.string;

/**
 * leetcode 5
 */
public class LongestPalindrome {
    public static void main(String[] args) {
        String s = "babad";
        String res ="";
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j <s.length() ; j++) {
                String temp = s.substring(i,j+1);
                if (!isPalindrome(temp) && res.length()<temp.length()){
                    res=temp;
                }
            }
        }
        System.out.println(res);
    }
    static boolean isPalindrome(String s){
        int i=0;
        int j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return true;
            }
            i++;j--;
        }
        return false;
    }
}
