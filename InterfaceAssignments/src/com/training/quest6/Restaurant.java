package com.training.quest6;

import java.util.Scanner;

public class Restaurant {

    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);

        System.out.println("Welcome to Restaurant!");
        System.out.println("Select your cuisine:");
        System.out.println("1. Indian");
        System.out.println("2. International");

        int choice = scr.nextInt();
        scr.nextLine();

        ICuisine cuisine = null;

        switch (choice) {

            case 1:
                cuisine = new Indian();
                System.out.println("You selected Indian Cuisine");
                break;

            case 2:
                cuisine = new International();
                System.out.println("You selected International Cuisine");
                break;

            default:
                System.out.println("Invalid cuisine selection");
                scr.close();
                return;
        }

        System.out.println("\nSelect menu type:");
        System.out.println("1. Starters");
        System.out.println("2. Main Course");
        System.out.println("3. Desserts");

        int menuChoice = scr.nextInt();

        String type = "";

        switch (menuChoice) {

            case 1:
                type = "starters";
                break;

            case 2:
                type = "maincourse";
                break;

            case 3:
                type = "desserts";
                break;

            default:
                System.out.println("Invalid menu selection");
                scr.close();
                return;
        }

        // Calling the overridden method using interface reference
        String[] menus = cuisine.showMenus(type);

        System.out.println("\nAvailable dishes:");

        for (String food : menus) {
            System.out.println(food);
        }

        scr.close();
    }
}