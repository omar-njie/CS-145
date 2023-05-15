package com.omar.data_structures.assignments.assignment_3;

import java.util.*;

/**
 * The HangmanManager class represents the game manager for the game Hangman.
 * It manages the list of words, the target word length, and the maximum number
 * of wrong guesses allowed, along with keeping track of the set of guessed
 * characters and the remaining guesses.
 *
 * @author Omar
 * @version 5.14.23
 *
 */
public class HangmanManager {

    private List<String> dictionary;
    private int length;
    private int max;
    private Set<String> words;
    private Set<Character> guesses;
    private String pattern;
    private int guessesLeft;


    /**
     * Constructs a HangmanManager object with the given parameters.
     *
     * @param dictionary list of words
     * @param length     the target word length
     * @param max        the maximum number of wrong guesses allowed
     *
     * @throws IllegalArgumentException if length is less than 1 or max is less than 0
     *
     * @see String#repeat(int)
     */
    public HangmanManager(List<String> dictionary, int length, int max) {
        if (length < 1 || max < 0) {
            throw new IllegalArgumentException("Length should be at least 1, and max should be at least 0.");
        }
        this.dictionary = dictionary;
        this.length = length;
        this.max = max;
        this.words = new TreeSet<>();
        this.guesses = new TreeSet<>();
        this.guessesLeft = max;

        for (String word : dictionary) {
            if (word.length() == length)
                this.words.add(word);
        }

        this.pattern = "-".repeat(length);
    }

    /**
     * Returns the set of words.
     *
     * @return the set of words.
     */
    public Set<String> words() {
        return this.words;
    }

    /**
     * Returns the number of guesses left.
     *
     * @return the number of guesses left.
     */
    public int guessesLeft() {
        return this.guessesLeft;
    }

    /**
     * Returns the set of guessed characters.
     *
     * @return the set of guessed characters.
     */
    public Set<Character> guesses() {
        return this.guesses;
    }

    /**
     * Returns the current pattern.
     *
     * @return the current pattern.
     * @throws IllegalStateException if there are no words left.
     */
    public String pattern() {
        if (this.words.isEmpty())
            throw new IllegalStateException("No words left");

        return this.pattern;
    }


    /**
     * Records a guessed character and updates the list of remaining words and the pattern of the word.
     *
     * @param guess the character guessed
     * @return the number of occurrences of the guessed character in the pattern
     * @throws IllegalStateException    if there are no words left in the list
     * @throws IllegalArgumentException if the character has already been guessed
     */
    public int record(char guess) {
        if (this.words.isEmpty())
            throw new IllegalStateException("No words left");


        if (this.guesses.contains(guess))
            throw new IllegalArgumentException("Already guessed: " + guess);

        this.guesses.add(guess);
        Map<String, Set<String>> map = new TreeMap<>();
        for (String word : this.words) {
            String pattern = get_pattern(word, guess);
            if (!(map.containsKey(pattern)))
                map.put(pattern, new TreeSet<>());
            map.get(pattern).add(word);
        }

        int max = 0;
        String max_pattern = "";
        for (String pattern : map.keySet()) {
            int size = map.get(pattern).size();
            if (size > max) {
                max = size;
                max_pattern = pattern;
            }
        }

        this.words = map.get(max_pattern);
        int occurrences = count_occurrences(max_pattern, guess);
        if (occurrences == 0)
            this.guessesLeft--;

        return occurrences;
    }

    // ============ Helper Methods ============//

    // Returns a pattern of the word with the guessed character.
    private String get_pattern(String word, char guess) {
        StringBuilder pattern = new StringBuilder();
        char[] letters = word.toCharArray();
        for (char letter : letters) {
            if (letter == guess)
                pattern.append(letter);
            else
                pattern.append("-");
        }
        return pattern.toString();
    }

    // Returns the number of occurrences of the guessed character in the pattern.
    private int count_occurrences(String pattern, char guess) {
        int occurrences = 0;
        StringBuilder new_pattern = new StringBuilder();
        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            if (c == guess)
                occurrences++;

            if (this.pattern.charAt(i) != '-') {
                new_pattern.append(this.pattern.charAt(i));
            } else if (c == '-') {
                new_pattern.append('-');
            } else {
                new_pattern.append(guess);
            }
        }
        this.pattern = new_pattern.toString();

        return occurrences;
    }

}
