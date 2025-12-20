package org.example.string;

public class RemoveConsecutiveCharacters {
    public static void main(String[] args) {
        String s = "aaabcaddd";

        StringBuilder sb = new StringBuilder();
        sb.append(s.charAt(0));
        int counter=1;
        for (int i=1; i<s.length()-1;i++){
            if (sb.charAt(counter-1)!=s.charAt(i)){
                sb.append(s.charAt(i));
                counter++;
            }
        }
        System.out.println(sb);
    }
}
