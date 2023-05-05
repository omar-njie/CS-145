package com.omar.learn.cs145_new;

import java.util.*;

/**
 * @author omar
 * @version 5/4/23
 */
public class IteratorEx {

    public static void main(String[] args) {

        // Iterator Example
        Set<Integer> scores = new TreeSet<>();
        scores.add(28);
        scores.add(82);
        scores.add(98);
        scores.add(73);
        scores.add(57);

        Iterator<Integer> itr = scores.iterator();
        while (itr.hasNext()) {
            int score = itr.next();
            System.out.println("The score is " + score);

            // eliminating any failing scores
            if (score < 60) {
                itr.remove();
            }
        }
        System.out.println(scores); // [73, 82, 98]


        // Example 2
        Map<String, Integer> scores2 = new HashMap<>();
        scores2.put("Peter", 82);
        scores2.put("Paul", 57);
        scores2.put("Mary", 98);
        scores2.put("Omar", 73);
        scores2.put("Tim", 28);

        Iterator<String> itr2 = scores2.keySet().iterator();
        while (itr2.hasNext()) {
            String name = itr2.next();
            int score = scores2.get(name);
            System.out.println(name + " scored " + score);

            // eliminating any failing scores
            if (score < 60) {
                itr2.remove();
            }
        }
        System.out.println(scores2); // {Mary=98, Peter=82, Omar=73}
    }
}
