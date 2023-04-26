package com.omar.learn.cs145_new;

import java.util.*;

/**
 * @author Omar
 * @version 4/26/23
 */
public class SetEx {

    public static void main(String[] args) {

        // set: A collection of unique values (no duplicates allowed)
        //      that can perform the following operations efficiently:
        //      add, remove, search (contains), size, isEmpty, clear, equals

        // We don't think of a set as having indexes; we just add things
        // to the set in general and don't worry about order

        // Set implementation:
        // In Java, sets are represented by the Set interface in java.util
        // Set is implemented by HashSet, TreeSet, and LinkedHashSet

        // HashSet: implemented using a hash table array;
        //          very fast: O(1) for add, remove, and contains (All operations)
        //          elements are stored in unpredictable order

        // TreeSet: implemented using a binary search tree;
        //          pretty fast: O(log n) for add, remove, and contains (All operations)
        //          elements are stored in sorted order

        // LinkedHashSet: O(1) but stores in order of insertion

        List<String> list = new ArrayList<>();

        Set<Integer> set_a = new TreeSet<>();
        Set<Integer> set_b = new HashSet<>();
        Set<String> set_c = new HashSet<>(list);
    }
}
