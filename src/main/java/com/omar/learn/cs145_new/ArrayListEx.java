package com.omar.learn.cs145_new;

import java.util.ArrayList;

/**
 * @author omar
 * @version 4/24/23
 */
public class ArrayListEx {

    public static void main(String[] args) {

        // ArrayList Methods
        // add: adds an element to the end of the list
        // add(index, element): adds an element at the specified index
        // get(index): returns the element at the specified index
        // set(index, element): replaces the element at the specified index with the specified element
        // remove(index): removes the element at the specified index
        // size(): returns the number of elements in the list
        // indexOf(element): return first where given value is found in list or -1 if not found
        // lastIndexOf(element): returns the index of the last occurrence of the specified element
        // clear(): removes all elements from the list
        // isEmpty(): returns true if the list is empty
        // contains(element): returns true if the list contains the specified element
        // toArray(): returns an array containing all of the elements in the list in proper sequence
        // subList(fromIndex, toIndex): returns a view of the portion of this list between the specified fromIndex, inclusive, and toIndex, exclusive
        // addAll(Collection): appends all of the elements in the specified collection to the end of this list, in the order that they are returned by the specified collection's iterator
        // addAll(index, Collection): inserts all of the elements in the specified collection into this list, starting at the specified position
        // removeAll(Collection): removes from this list all of its elements that are contained in the specified collection
        // retainAll(Collection): retains only the elements in this list that are contained in the specified collection
        // containsAll(Collection): returns true if this list contains all of the elements of the specified collection
        // equals(Object): compares the specified object with this list for equality

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
