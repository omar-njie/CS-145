package com.omar.learn.cs145_new;

import java.util.*;

/**
 * @author omar
 * @version 5/2/23
 */
public class MapEx {

    public static void main(String[] args) {

        // Map Example
        Map<String, Integer> map = new HashMap<>();
        map.put("Omar", 1);
        map.put("Tim", 2);
        map.put("ff", 3);
        map.put("dd", 4);
        System.out.println(map); // {ff=3, Tim=2, Omar=1, dd=4}

        Map<String, Integer> IDs = new TreeMap<>();
        IDs.put("Omar", 1);
        IDs.put("Tim", 2);
        IDs.put("ff", 3);
        IDs.put("dd", 4);
        IDs.put("bb", 5);
        IDs.put("aa", 6);
        System.out.println(IDs); // {Omar=1, Tim=2, aa=6, bb=5, dd=4, ff=3}

        Map<String, Set<Integer>> map_set = new HashMap<>();
        map_set.put("Omar", Set.of(1, 2, 3));
        map_set.put("Tim", Set.of(4, 5, 6));
        System.out.println(map_set); // {Tim=[4, 5, 6], Omar=[1, 2, 3]}

        // Going through a map
        Map<String, Integer> ages = new HashMap<>();
        ages.put("Marty", 19);
        ages.put("Stuart", 44);
        ages.put("Peter", 2);
        ages.put("Kevin", 20);

        for (String name : ages.keySet()) {
            int age = ages.get(name);
            System.out.println(name + " -> " + age);
        }

        // Changing a map
        Map<String, Integer> ages2 = new HashMap<>();
        ages2.put("Marty", 19);
        ages2.put("Stuart", 44);
        ages2.put("Peter", 2);
        ages2.put("Kevin", 20);

        for (String name : ages2.keySet()) {
            int age = ages2.get(name);
            ages2.put(name, age + 10);
        }
        System.out.println(ages2);// {Peter=12, Marty=29, Kevin=30, Stuart=54}

        // Problem: opposite mapping
        Map<String, Double> stuGpa = new HashMap<>();
        stuGpa.put("Marty", 3.45);
        stuGpa.put("Stuart", 2.99);
        stuGpa.put("Peter", 3.75);
        stuGpa.put("Kevin", 2.5);

        System.out.println("Martin -> " + stuGpa.get("Marty")); // Martin -> 3.45

        // Proper map reversal
        Map<Double, Set<String>> taGpa = new HashMap<>();
        taGpa.put(3.6, new TreeSet<>());
        taGpa.get(3.6).add("Jared");
        taGpa.put(4.0, new TreeSet<>());
        taGpa.get(4.0).add("Alyssa");
        taGpa.put(2.9, new TreeSet<>());
        taGpa.get(2.9).add("Steve");
        taGpa.get(3.6).add("Stef");
        taGpa.get(2.9).add("Rob");

        System.out.println("Who got a 3.6? " + taGpa.get(3.6)); // [Jared, Stef]

    }

    public static int countUnique(Map<String, Integer> map) {
        Set<Integer> set = new HashSet<>(map.values());
        return set.size();
    }

    // Problem: reverse a map
    public static Map<Integer, String> reverse(Map<String, Integer> map) {
        Map<Integer, String> result = new HashMap<>();
        for (String name : map.keySet()) {
            int age = map.get(name);
            result.put(age, name);
        }
        return result;
    }

    // How to count
    static void count(List<String> list) {
        Map<String, Integer> count_map = new HashMap<>();

        for (String x : list) {
            if (count_map.containsKey(x))
                count_map.put(x, count_map.get(x) + 1);
            else
                count_map.put(x, 1);
        }
    }
}
