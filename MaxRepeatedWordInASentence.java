package com.example.demo;

import java.util.*;
import java.util.stream.Collectors;

public class MaxRepeatedWordInASentence {

    public static void main(String[] args) {
        String input = "This is testing program testing program is is is is testing";
        String[] words = input.split(" ");
        Map<String, Integer> map = new HashMap<>();
        Arrays.stream(words).forEach(t -> {
            if (map.containsKey(t)) {
                map.put(t, map.get(t) + 1);
            } else {
                map.put(t, 1);
            }
        });

        /*List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
        Collections.sort(list, (e1, e2) ->e2.getValue().compareTo(e1.getValue()));
        //Map<String, Integer> newMap = list.stream().collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (en1, en2)->en2, LinkedHashMap::new));

        System.out.println(map);
        System.out.println(list.get(0));
*/
        System.out.println("----------------");
        System.out.println(map);//{testing=3, This=1, is=5, program=2}

      /*  map.entrySet().stream()
                      .sorted((e1, e2) ->e2.getValue().compareTo(e1.getValue()))//Map.Entry.comparingByValue() Ascending(Also Map.Entry.comparingByKey() is there)
                      .limit(1)//.skip(map.size()-1)
                      .forEach(e -> System.out.println(e.getKey()));//is*/
        System.out.println("----------------");
        System.out.println(map.entrySet().stream().max(Map.Entry.comparingByValue()).get().getKey());
    }
}
