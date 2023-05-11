package com.omar.learn.cs145_new.exams.midterm1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/**
 * @author omar
 * @version 5/9/23
 */
public class ArrayListsPractice {

    public static void main(String[] args) {

        ArrayList<String> str = new ArrayList<>();
        str.add("four");
        str.add("score");
        str.add("and");
        str.add("seven");
        str.add("years");
        removeShortStrings(str);
    }

    static void removeShortStrings(ArrayList<String> str) {
        for (int i = 0; i < str.size(); i++) {
            if (str.get(i).length() < str.size()) {
                str.remove(i);
                i--;
            }
        }
        System.out.println(str);
    }

    static void removeEvenLengths(Set<String> sets) {
        Iterator<String> it = sets.iterator();
        while (it.hasNext()) {
            String a = it.next();
            if (a.length() % 2 == 0) {
                it.remove();
            }
        }
        System.out.println(sets);
    }

}
