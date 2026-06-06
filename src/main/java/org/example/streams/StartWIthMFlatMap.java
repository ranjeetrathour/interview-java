package org.example.streams;

import java.util.*;

public class StartWIthMFlatMap {
    public static void main(String[] args) {
        Map<String, List<String>> map = new HashMap<>();
        map.put("City1", Arrays.asList("delhi", "mumbai", "manglore"));
        map.put("city2", Arrays.asList("pune", "dhanbad", "mango"));
//        map.values().stream().flatMap(strings -> strings.stream().filter(s -> s.startsWith()))

    }
}
