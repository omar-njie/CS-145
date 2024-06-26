package com.omar.data_structures.assignments.assignment_4;

import java.util.*;

/**
 * The GrammarSolver class represents a grammar solver that can generate random occurrences of symbols based
 * on the given grammar rules. It allows checking if a symbol is a non-terminal in the grammar
 * and provides a method to retrieve all non-terminal symbols.
 * Random occurrences of symbols can be generated using the grammar rules.
 *
 * @author Omar
 * @version 5.21.23
 */
public class GrammarSolver {

    private Map<String, String[]> grammar;

    /**
     * Creates a GrammarSolver object that uses the given grammar rules.
     *
     * @param rules the grammar rules to use
     * @throws IllegalArgumentException if the rules list is null or empty
     * @throws IllegalArgumentException if the grammar contains more than one line for the same non-terminal
     */
    public GrammarSolver(List<String> rules) {
        if (rules == null || rules.isEmpty())
            throw new IllegalArgumentException("Rules list is null or empty");

        grammar = new HashMap<>();

        for (String rule : rules) {
            String non_terminal = rule.split("::=")[0].trim();
            String[] terminals = rule.split("::=")[1].trim().split("\\|");

            if (grammar.containsKey(non_terminal))
                throw new IllegalArgumentException("Grammar contains more than one line " +
                        "for the same non-terminal: " + non_terminal);

            grammar.put(non_terminal, terminals);
        }

    }

    /**
     * Returns true if the given symbol is a non-terminal of the grammar.
     *
     * @param symbol the symbol to check if it is a non-terminal of the grammar
     * @return true if the given symbol is a non-terminal of the grammar;
     * @throws IllegalArgumentException if the given symbol is null or empty
     */
    public boolean contains(String symbol) {
        check_symbol(symbol);

        return grammar.containsKey(symbol);
    }

    /**
     * Retrieves all non-terminal symbols of the grammar.
     *
     * @return a sorted set of non-terminal symbols
     */
    public Set<String> getSymbols() {
        return new TreeSet<>(grammar.keySet());
    }

    /**
     * Generates a random occurrence of the given symbol based on the grammar rules.
     * If the symbol is not a non-terminal in the grammar, it is assumed to be a terminal symbol and returned as is.
     *
     * @param symbol the symbol to generate
     * @return a randomly generated occurrence of the symbol as a string
     * @throws IllegalArgumentException if the symbol is null or empty
     * @see StringBuilder
     */
    public String generate(String symbol) {
        check_symbol(symbol);

        if (!(grammar.containsKey(symbol)))
            return symbol;

        Random rand = new Random();
        String[] terminals = grammar.get(symbol);
        int get_length = terminals.length;
        String random_terminal = terminals[rand.nextInt(get_length)];

        String[] symbols = random_terminal.split("\\s+");
        StringBuilder sb = new StringBuilder();

        for (String s : symbols) {
            sb.append(generate(s));
            sb.append(" ");
        }

        return sb.toString().trim();
    }


    // helper method to check if symbol is null or empty
    private void check_symbol(String symbol) {
        if (symbol == null || symbol.isEmpty()) {
            throw new IllegalArgumentException("Symbol is null or empty");
        }
    }
}
