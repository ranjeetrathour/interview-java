package org.example.string;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class FIndVowelInEachWord {
    public static void main(String[] args) {
        String s="hello how how are you";


        Map<String, Long> collect = Arrays.stream(s.split(" ")).distinct()
                .collect(Collectors.toMap(w -> w,
                        w -> w.chars().mapToObj(c -> (char) c).filter(FIndVowelInEachWord::isVowel).count()));
        System.out.println(collect);
    }
    static boolean isVowel(char c){
        return c == 'a' || c == 'e' || c == 'i' ||
                c == 'o' || c == 'u' ||
                c == 'A' || c == 'E' || c == 'I' ||
                c == 'O' || c == 'U';
    }
}
