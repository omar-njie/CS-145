package com.omar.data_structures.assignments.short_assignments;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/**
 * ArrayLiat/Set Quiz
 *
 * @author Omar
 * @version 4.28.23
 */
public class QuizSet {

    public static void main(String[] args) {

        try {
            ArrayList<String> words = new ArrayList<>();
            Scanner input = new Scanner(new File("assignment_files/mobydick.txt"));

            while (input.hasNext())
                words.add(input.next());
            input.close();

            long startTime = System.currentTimeMillis();
            Set<String> uniqueWordsSet = reportSet(words);
            long endTime = System.currentTimeMillis();
            System.out.println("Time taken to add unique words to set: " + (endTime - startTime) + "ms");

            startTime = System.currentTimeMillis();
            List<String> uniqueWordsList = reportArrayList(words);
            endTime = System.currentTimeMillis();
            System.out.println("Time taken to add unique words to ArrayList: " + (endTime - startTime) + "ms");

            System.out.println("Number of unique words in Mobydick file: " + uniqueWordsSet.size());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static Set<String> reportSet(ArrayList<String> words) {
        return new HashSet<>(words);
    }

    private static ArrayList<String> reportArrayList(ArrayList<String> words) {
        ArrayList<String> unique_words = new ArrayList<>();
        for (String word : words) {
            if (!(unique_words.contains(word)))
                unique_words.add(word);
        }
        return unique_words;
    }
}
