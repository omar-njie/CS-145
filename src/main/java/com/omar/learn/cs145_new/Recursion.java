package com.omar.learn.cs145_new;

import java.io.File;
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
        System.out.println(mystery(648));
        printBinary(12);
        System.out.println(repeat("hello", 3));
        int index = indexOf("Barack Obama", "bam");
        System.out.println(index);  // Output: 8
        // crawl(new File("/Users/omar/Desktop/College/Computer Science/Spring-Quarter-2023/CS-145"));

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
        if (n == 0) {
            // base case just end the line of output
            System.out.println();
        } else {
            // recursive case print one more star
            System.out.print("*");
            printStars(n - 1);
        }
    }

    static int mystery(int n) {
        if (n < 10) {
            return n;
        } else {
            int a = n / 10;
            int b = n % 10;
            return mystery(a + b);
        }
    }

    static void printBinary(int n) {
        if (n < 0) {
            System.out.println("~");
            printBinary(-n);
        } else if (n < 2) {
            System.out.println(n);
        } else {
            printBinary(n / 2);
            printBinary(n % 2);
        }
    }

    static void reverseLines(Scanner in) {
        while (in.hasNextLine()) {
            String line = in.nextLine();
            reverseLines(in);
            System.out.println(line);
        }
    }

    static String repeat(String s, int n) {
        if (n == 0) {
            return "";
        } else {
            return s + repeat(s, n - 1);
        }
    }

    public static int indexOf(String str, String target) {
        return indexOf(str, target, 0);
    }

    private static int indexOf(String str, String target, int index) {
        if (index > str.length() - target.length()) {
            return -1;  // Target string cannot fit starting from the current index
        }
        if (str.startsWith(target, index)) {
            return index;  // Found a match at the current index
        }
        return indexOf(str, target, index + 1);  // Move to the next index and search recursively
    }


    static void crawl(File f) {
        if (f.isDirectory()) {
            File[] files = f.listFiles();
            assert files != null;
            for (File file : files) {
                crawl(file);
            }
        } else {
            System.out.println(f);
        }
    }


}
