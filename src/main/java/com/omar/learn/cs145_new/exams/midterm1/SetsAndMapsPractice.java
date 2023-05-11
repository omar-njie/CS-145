package com.omar.learn.cs145_new.exams.midterm1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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


        System.out.println(maxOccurences(lst));

    }

    static int maxOccurences(List<Integer> lst) {
        Map<Integer, Integer> map = new HashMap<>();
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
