package org.example.twopointer;

/**
 * leetcode 125
 */
public class ValidPalindrome {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panamr";
        System.out.println(isValidPalindrome(s));
    }

    private static boolean isValidPalindrome(String s){
        int i=0;
        int j=s.length()-1;

        while (i<j){
            if (!Character.isAlphabetic(s.charAt(i)) && !Character.isDigit(s.charAt(i))){
                i++;
            } else if (!Character.isAlphabetic(s.charAt(j)) && !Character.isDigit(s.charAt(j))) {
                j--;
            }else{
                if (s.toLowerCase().charAt(i)!=s.toLowerCase().charAt(j)){
                    return false;
                }
                i++;j--;
            }
        }
        return true;
    }
}
