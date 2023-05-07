package com.omar.data_structures.assignments.short_assignments;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/**
 * @author Omar
 * @version 5.5.23
 */
public class QuizMap {

    public static void main(String[] args) {

        try {
            Set<String> words = new HashSet<String>();
            Scanner input = new Scanner(new File("assignment_files/mobydick.txt"));
            while (input.hasNext()) {
                words.add(input.next());
            }
            System.out.println(reportMap(words));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }


    public static Set<String> reportMap(Set<String> set) {
        Map<Integer, Set<String>> map = new HashMap<>();

        for (String s : set) {
            int length = s.length();
            Set<String> string_set = map.get(length);

            if (string_set == null) {
                string_set = new TreeSet<>();
                map.put(length, string_set);
            }

            string_set.add(s);
        }

        Set<String> largest_set = null;
        int max_size = 0;

        for (Set<String> strign_set : map.values()) {
            if (strign_set.size() > max_size) {
                largest_set = strign_set;
                max_size = strign_set.size();
            }
        }

        return largest_set;
    }

}
