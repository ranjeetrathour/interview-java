package org.example.slidingwindow.dynamic;

import java.util.HashSet;
import java.util.Set;

/**
 * 3. Longest Substring Without Repeating Characters
 */
public class LongestDistinctSubString {
    public static void main(String[] args) {
        String s = "abcabcbb";

        Set<Character> window = new HashSet<>();
        int max = 0;
        int i = 0, j = 0;

        while (j < s.length()) {
            char c = s.charAt(j);

            if (!window.contains(c)) {
                window.add(c);
                max = Math.max(max, window.size());
                j++;
            } else {
                window.remove(s.charAt(i));
                i++;
            }
        }

        System.out.println(max); // 3
    }
}
