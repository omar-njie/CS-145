package com.omar.learn.cs145_new;

import java.util.ArrayList;

/**
 * @author omar
 * @version 4/24/23
 */
public class ArrayListEx {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        // add
        list.add("Hello");
        list.add("World");

        list.add(0, "Omar");
        list.add(1, "Tim");

        System.out.println(list);

        // clear
        //list.clear();

        // indexOf
        int x;
        x = list.indexOf("Hello");
        System.out.println(x);

        // get: get stuff out of the list
        String z = list.get(1);
        System.out.println(z);

        // set: get stuff in the list and replace it
        list.set(1, "Timothy");

        // remove
        list.remove(0);

        ArrayList<String> places = new ArrayList<>();
        places.add("New York");
        places.add("Chicago");
        places.add("Los Angeles");
        places.add("San Francisco");
        places.add("Seattle");

        places.remove(0);
        System.out.println(places);

        places.remove(1);
        System.out.println("Final result: " + places);

        ArrayList<String> names = new ArrayList<>();
        names.add("zinhos");
        names.add("omar");
        names.add("tims");
        names.add("andrews");
        names.add("james");
        names.add("tim");

        System.out.println(names);

        ArrayList<String> star = new ArrayList<>();
        star.add("the");
        star.add("quick");
        star.add("brown");
        star.add("fox");

        addStars(star);
        System.out.println(star);
        removeStars(star);
        System.out.println(star);

        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        swapPairs(list1, list2);
        System.out.println(list1);
        System.out.println(list2);

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(5);
        numbers.add(8);
        numbers.add(10);
        numbers.add(12);

        int sumOfEvenNumbers = 0;

        for (Integer number : numbers) {
            if (number % 2 == 0) {
                sumOfEvenNumbers += number;
            }
        }

        System.out.println("The sum of even numbers in the list is: " + sumOfEvenNumbers);

        ArrayList<String> strings = new ArrayList<String>();
        strings.add("foo");
        strings.add("bar");
        strings.add("baz");
        strings.add("qux");
        strings.add("quux");

        removeEvenLength(strings);

        System.out.println(strings);


    }

    static void name(ArrayList<String> list) {
        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            if (str.endsWith("s")) {
                list.remove(i);
                i--;
            }
        }
    }

    static void addStars(ArrayList<String> list) {
        for (int i = 1; i < list.size(); i+=2) {
            String s = "*";
            list.add(i, s);
        }
    }

    static void removeStars(ArrayList<String> list) {
        for (int i = 1; i < list.size(); i+=2) {
            list.remove(i);
            i--;
        }
    }

    static void swapPairs(ArrayList<String> list1, ArrayList<String> list2) {
        String[] words = {"four", "score", "and", "seven", "years", "ago"};
        String[] words2 = {"our", "fathers", "brought", "forth", "on", "this", "continent"};
        for (int i = 0; i < words.length; i++) {
            list1.add(words[i]);
        }
        for (int i = 0; i < words2.length; i++) {
            list2.add(words2[i]);
        }
        System.out.println(list1);
        System.out.println(list2);
    }

    public static void removeEvenLength(ArrayList<String> strings) {
        for (int i = 0; i < strings.size(); i++) {
            String s = strings.get(i);
            if (s.length() % 2 == 0) {
                strings.remove(i);
                i--;
            }
        }
    }
}
