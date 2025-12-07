package org.example.string;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        String s = "aabccdeef";
        int charFreq[] = new int[26]; //initial all 26 is 0
        for (int i=0; i<s.length();i++){
            charFreq[s.charAt(i)-'a']++;
        }

        for (int i=0; i<s.length();i++){
            if(charFreq[s.charAt(i)-'a']==1){
                System.out.println(s.charAt(i));
                break;

            }
        }

    }
}
