package org.example.string;


public class FIndVowelInWord {
    public static void main(String[] args) {
        String s = "aebshuo";

        long count = s.chars().mapToObj(c -> (char) c).filter(FIndVowelInWord::isVowel).count();

        System.out.println(count);
    }

    static boolean isVowel(char c){
        return c == 'a' || c == 'e' || c == 'i' ||
                c == 'o' || c == 'u' ||
                c == 'A' || c == 'E' || c == 'I' ||
                c == 'O' || c == 'U';
    }
}
