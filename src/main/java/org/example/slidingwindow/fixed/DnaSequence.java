package org.example.slidingwindow.fixed;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * leetcode 187
 */
public class DnaSequence {
    public static void main(String[] args) {
        String s = "AAAAAAAAAAAAAA";
        Set<String> set = new HashSet<>();
        String builder =null;
        builder=s.substring(0,10);
        set.add(builder);
        System.out.println(builder.length());
        System.out.println(s.substring(1,builder.length()+1));
        List<String> res = new ArrayList<>();
        for (int i=1;i<s.length()-10+1; i++){
            builder=s.substring(i,builder.length()+i);
            if (set.contains(builder)&&!res.contains(builder)){
                res.add(builder);
            }else {
                set.add(builder);
            }
        }

        System.out.println(res);

    }
}
