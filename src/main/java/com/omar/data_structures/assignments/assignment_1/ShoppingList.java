package com.omar.data_structures.assignments.assignment_1;

/**
 * This class represents a shopping list that can hold ShoppingItem objects.
 * It provides methods for adding items to the list, calculating the total cost
 * of all items in the list, searching for an item by name, checking if the list
 * is empty, and generating a string representation of the list.
 *
 * @author Omar
 * @version 04/16/2023
 * @see ShoppingItem
 * @see StringBuilder
 */
public class ShoppingList {

    private ShoppingItem[] items;
    private int size;


    /**
     * Constructs an empty ShoppingList with a default capacity of 10.
     */
    public ShoppingList() {
        items = new ShoppingItem[10];
        size = 0;
    }

    /**
     * Adds a ShoppingItem to the list.
     *
     * @param item The ShoppingItem to be added.
     * @return true if the item was added successfully, false if the list is full.
     */
    public boolean add(ShoppingItem item) {
        if (size < 10) {
            items[size] = item;
            size++;
            return true;
        }
        return false;
    }


    /**
     * Calculates the total cost of all items in the list.
     *
     * @return The total cost of all items in the list.
     */
    public double getTotalCost() {
        double total = 0;
        for (int i = 0; i < size; i++) {
            total += items[i].getCost();
        }
        return total;
    }


    @Override
    public String toString() {
        if (size == 0)
            return "ShoppingList is empty";

        System.out.println("=====================================");
        StringBuilder result = new StringBuilder("Shopping List has " + size + " shopping items: ");
        for (int i = 0; i < size; i++) {
            result.append(items[i].toString());
            if (i < size - 1) result.append(", ");
        }
        return result.toString();
    }


    /**
     * Searches for a ShoppingItem in the list by name.
     *
     * @param itemName The name of the ShoppingItem to be searched for.
     * @return The ShoppingItem if found, null if not found.
     */
    public ShoppingItem searchByName(String itemName) {
        for (int i = 0; i < size; i++) {
            if (items[i].getName().equals(itemName))
                return items[i];
        }
        return null;
    }


    /**
     * Checks if the list is empty.
     *
     * @return true if the list is empty, false if not.
     */
    public boolean isEmpty() {
        return size == 0;
    }
}
