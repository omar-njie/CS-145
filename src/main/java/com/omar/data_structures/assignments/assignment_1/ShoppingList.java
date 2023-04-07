package com.omar.data_structures.assignments.assignment_1;

public class ShoppingList {

    private ShoppingItem[] items;
    private int size;


    public ShoppingList() {
        items = new ShoppingItem[10];
        size = 0;
    }

    public boolean add(ShoppingItem item) {
        if (size < 10) {
            items[size] = item;
            size++;
            return true;
        }
        return false;
    }


    public double getTotalCost() {
        double total = 0;
        for (int i = 0; i < size; i++) {
            total += items[i].getCost();
        }
        return total;
    }

    public String toString() {
        if (size == 0) {
            return "ShoppingList is empty";
        }

        StringBuilder result = new StringBuilder("ShoppingList has " + size + " shopping items: ");
        for (int i = 0; i < size; i++) {
            result.append(items[i].toString());
            if (i < size - 1) {
                result.append(", ");
            }
        }
        return result.toString();
    }

    public ShoppingItem searchByName(Sring itemName) {
        for (int i = 0; i < size; i++) {
            if (items[i].getName().equals(itemName)) {
                return items[i];
            }
        }
        return null;
    }


}
