package org.example.string;

/**
 * leetcode 8
 */
public  class StringToInteger {
    public static void main(String[] args) {
       String s="-042";
        StringBuilder sb = new StringBuilder();
        int c=0;
        if (s.startsWith(String.valueOf(Character.isAlphabetic(c)))){
            System.out.println(0);
        }

        while (c<s.length()){
            if (!Character.isWhitespace(c)  || !Character.isSpaceChar(c) || s.charAt(c)!=-'-' || s.charAt(c)!=0 ){
                sb.append(s.charAt(c));
            } else if (Character.isAlphabetic(c)) {
                break;
            }
            c++;
        }
        System.out.println(Integer.parseInt(sb.toString()));
    }
}
