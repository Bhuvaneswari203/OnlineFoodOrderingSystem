package com.foodapp;

import java.util.ArrayList;
import java.util.List;

public class FoodService {

    private List<FoodItem> menu = new ArrayList<>();

    public FoodService() {
        menu.add(new FoodItem(1, "Burger", 99));
        menu.add(new FoodItem(2, "Pizza", 199));
        menu.add(new FoodItem(3, "Sandwich", 79));
        menu.add(new FoodItem(4, "French Fries", 59));
        menu.add(new FoodItem(5, "Coke", 40));
    }

    public List<FoodItem> getMenu() {
        return menu;
    }

    public FoodItem getFoodById(int id) {
        for (FoodItem food : menu) {
            if (food.getId() == id) return food;
        }
        return null;
    }
}
