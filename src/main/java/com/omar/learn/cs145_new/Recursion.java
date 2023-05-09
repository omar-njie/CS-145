package com.omar.learn.cs145_new;

import java.util.*;

/**
 * @author omar
 * @version 5/9/23
 */
public class Recursion {

    public static void main(String[] args) {
        // Example of using recursion to sum a list of integers
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5);
        int sum = sumList(nums);
        System.out.println("Sum of list: " + sum);

        // Example of using recursion to find all subsets of a set
        Set<Integer> set = new HashSet<>(Arrays.asList(1, 2, 3));
        List<Set<Integer>> subsets = findAllSubsets(set);
        System.out.println("All subsets of set " + set + ": " + subsets);

        // Example of using recursion to calculate a Fibonacci sequence
        int n = 6;
        int fibonacci = calculateFibonacci(n);
        System.out.println("Fibonacci sequence of " + n + ": " + fibonacci);
        printStars(2);
    }

    // Recursive method to sum a list of integers
    public static int sumList(List<Integer> list) {
        if (list.isEmpty()) {
            return 0;
        } else {
            int head = list.get(0);
            List<Integer> tail = list.subList(1, list.size());
            return head + sumList(tail);
        }
    }

    // Recursive method to find all subsets of a set
    public static List<Set<Integer>> findAllSubsets(Set<Integer> set) {
        if (set.isEmpty()) {
            List<Set<Integer>> subsets = new ArrayList<>();
            subsets.add(new HashSet<>());
            return subsets;
        } else {
            int element = set.iterator().next();
            set.remove(element);
            List<Set<Integer>> subsets = findAllSubsets(set);
            List<Set<Integer>> newSubsets = new ArrayList<>();
            for (Set<Integer> subset : subsets) {
                Set<Integer> newSubset = new HashSet<>(subset);
                newSubset.add(element);
                newSubsets.add(newSubset);
            }
            subsets.addAll(newSubsets);
            return subsets;
        }
    }

    // Recursive method to calculate a Fibonacci sequence
    public static int calculateFibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return calculateFibonacci(n - 1) + calculateFibonacci(n - 2);
        }
    }

      static void printStars(int n) {
        if (n == 1) {
            // base case just print one star
            System.out.println("*");
        } else {
            // recursive case print one more star
            System.out.print("*");
            printStars(n - 1);
        }
    }
}
