package com.omar.learn.cs145_new;

import java.util.*;

/**
 * @author Omar
 * @version 5.3.23
 */
public class SetsAndMaps {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(7);
        list.add(4);
        list.add(-9);
        list.add(4);
        list.add(15);
        list.add(8);
        list.add(27);
        list.add(7);
        list.add(11);
        list.add(-5);
        list.add(32);
        list.add(-9);
        list.add(-9);
        sortAndRemoveDuplicates(list);

    }

    // Exercise 1
    static void sortAndRemoveDuplicates(List<Integer> list) {
        Set<Integer> rm = new HashSet<>(list);
        List<Integer> sorted = new ArrayList<>(rm);
        Collections.sort(sorted);
        System.out.println(sorted);


    }


}
