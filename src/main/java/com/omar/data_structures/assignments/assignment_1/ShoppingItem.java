package com.omar.data_structures.assignments.assignment_1;

/**
 * Represents a shopping item with a name, quantity, and price.
 *
 * @see ShoppingList
 */
public class ShoppingItem {

    private String name;
    private int quantity;
    private double price;


    /**
     * Constructs a ShoppingItem with default values.
     */
    public ShoppingItem() {
        this.name = "";
        this.quantity = 0;
        this.price = 0;
    }


    /**
     * Constructs a ShoppingItem with the given name, quantity, and price.
     *
     * @param name     The name of the item.
     * @param quantity The quantity of the item.
     * @param price    The price of the item.
     */
    public ShoppingItem(String name, int quantity, double price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }


    /**
     * Returns the name of the item.
     *
     * @return The name of the item.
     */
    public String getName() {
        return name;
    }

    /**
     * Return Returns the cost of the shopping item, which is calculated as the product of quantity and price.
     * @return The cost of the item.
     */
    public double getCost() {
        return quantity * price;
    }

    /**
     * Sets the quantity of the shopping item.
     * @param quantity the quantity of the shopping item to set
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return quantity + " " + name;
    }
}
