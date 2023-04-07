package com.omar.data_structures.assignments.assignment_1;

public class ShoppingItem {

    private String name;
    private int quantity;
    private double price;

    public ShoppingItem() {
        this.name = "";
        this.quantity = 0;
        this.price = 0;
    }

    public ShoppingItem(String name, int quantity, double price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getCost() {
        return quantity * price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String toString() {
        return quantity + " " + name;
    }


}
