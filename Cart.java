package com.foodapp;

import java.util.ArrayList;
import java.util.List;

public class Cart {

    private List<FoodItem> cartItems = new ArrayList<>();

    public void addToCart(FoodItem item) {
        cartItems.add(item);
    }

    public void showCart() {
        if (cartItems.isEmpty()) {
            System.out.println("Cart is empty!");
            return;
        }

        double total = 0;
        System.out.println("\n--- Your Cart ---");
        for (FoodItem item : cartItems) {
            System.out.println(item.getName() + " - Rs." + item.getPrice());
            total += item.getPrice();
        }
        System.out.println("Total Bill: Rs." + total);
    }

    public double getTotal() {
        double total = 0;
        for (FoodItem f : cartItems) {
            total += f.getPrice();
        }
        return total;
    }
}
