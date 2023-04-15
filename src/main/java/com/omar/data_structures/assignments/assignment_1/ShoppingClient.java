package com.omar.data_structures.assignments.assignment_1;

import java.util.Scanner;

public class ShoppingClient {

    public static void main(String[] args) {
        ShoppingList shoppingList = new ShoppingList();
        Scanner input = new Scanner(System.in);
        int user_choice = 0;

        do {
            display_menu();
            System.out.print("Enter your choice: ");

            while (!(input.hasNextInt())) {
                System.out.println("Invalid input. Please enter a number from 1-5.");
                input.next();
            }

            user_choice = input.nextInt();
            input.nextLine();

            switch (user_choice) {
                case 1 -> display_menu();
                case 2 -> add_item(shoppingList);
                case 3 -> change_quantity(shoppingList);
                case 4 -> display_shopping_list(shoppingList);
                case 5 -> exit();
                default -> System.out.println("Invalid input. Please enter a number from 1-5.");
            }

        } while (user_choice != 5);
    }

    public static void display_menu() {
        System.out.println("Select a choice from the menu (1-5):");
        System.out.println("1. Display Menu");
        System.out.println("2. Add an Item");
        System.out.println("3. Change Quantity");
        System.out.println("4. Display Shopping List");
        System.out.println("5. Exit");
    }

    public static void add_item(ShoppingList list) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the name of the item: ");
        String item_name = input.nextLine();
        System.out.print("Enter the quantity of the item: ");

        while (!input.hasNextInt()) {
            System.out.println("Invalid input. Please enter a number.");
            input.next();
            System.out.print("Enter the quantity of the item: ");
        }

        int quantity = input.nextInt();
        System.out.print("Enter the price of the item: ");

        while (!input.hasNextDouble()) {
            System.out.println("Invalid input. Please enter a valid price.");
            input.next();
            System.out.print("Enter the price of the item: ");
        }

        double price = input.nextDouble();
        ShoppingItem item = new ShoppingItem(item_name, quantity, price);
        list.add(item);
    }

    public static void change_quantity(ShoppingList list) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the name of the item: ");
        String name = input.nextLine();
        ShoppingItem item = list.searchByName(name);

        if (item == null) {
            System.out.println("Item not found");
        } else {
            System.out.print("Enter the new quantity: ");

            while (!(input.hasNextInt())) {
                System.out.println("Invalid input. Please enter a number.");
                input.next();
                System.out.print("Enter the new quantity: ");
            }

            int quantity = input.nextInt();
            item.setQuantity(quantity);
        }
    }

    public static void display_shopping_list(ShoppingList list) {
        if (list.isEmpty()) {
            System.out.println("ShoppingList is empty");
        } else {
            System.out.println(list.toString());
            System.out.printf("Total cost: $%.2f\n", list.getTotalCost());
        }
    }

    public static void exit() {
        System.out.println("Exited successfully!!");
        System.exit(0);
    }
}
