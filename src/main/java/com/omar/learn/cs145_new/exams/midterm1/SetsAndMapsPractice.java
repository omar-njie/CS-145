package com.omar.learn.cs145_new.exams.midterm1;

import java.util.*;

/**
 * @author omar
 * @version 5/9/23
 */
public class SetsAndMapsPractice {

    public static void main(String[] args) {

        List<Integer> lst = new ArrayList<>();
        lst.add(1);
        lst.add(1);
        lst.add(2);
        lst.add(2);
        lst.add(2);
        lst.add(2);
        lst.add(2);
        lst.add(2);
        lst.add(2);
        lst.add(12);


        System.out.println(maxOccurrences(lst));

    }

    static int maxOccurrences(List<Integer> lst) {
        Map<Integer, Integer> map = new HashMap<>();

        if (lst.isEmpty()) {
            return 0;
        }

        for (Integer i : lst) {
            if (map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            } else {
                map.put(i, 0);
            }
        }

        int max = 0;
        for (Integer i : map.keySet()) {
            if (map.get(i) > max) {
                max = map.get(i);
            }
        }
        return max;
    }
}
