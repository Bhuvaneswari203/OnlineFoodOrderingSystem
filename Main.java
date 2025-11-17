package com.foodapp;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        UserService userService = new UserService();
        FoodService foodService = new FoodService();
        Cart cart = new Cart();

        System.out.println("==== ONLINE FOOD ORDERING SYSTEM ====");
        System.out.print("Enter Username: ");
        String username = sc.nextLine();
        System.out.print("Enter Password: ");
        String password = sc.nextLine();

        if (!userService.login(username, password)) {
            System.out.println("Invalid Credentials! Exiting...");
            return;
        }

        System.out.println("Login Successful!\n");

        while (true) {

            System.out.println("\n1. View Menu");
            System.out.println("2. Add to Cart");
            System.out.println("3. View Cart & Bill");
            System.out.println("4. Exit");

            System.out.print("Choose option: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("\n--- MENU ---");
                    for (FoodItem f : foodService.getMenu()) {
                        System.out.println(f.getId() + ". " + f.getName() + " - Rs." + f.getPrice());
                    }
                    break;

                case 2:
                    System.out.print("Enter Food ID to Add: ");
                    int id = sc.nextInt();
                    FoodItem item = foodService.getFoodById(id);

                    if (item != null) {
                        cart.addToCart(item);
                        System.out.println(item.getName() + " added to cart.");
                    } else {
                        System.out.println("Invalid Food ID!");
                    }
                    break;

                case 3:
                    cart.showCart();
                    break;

                case 4:
                    System.out.println("Thank you for using the Food Ordering App!");
                    return;

                default:
                    System.out.println("Invalid Option!");
            }
        }
    }
}
