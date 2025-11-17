package com.foodapp;

import java.util.HashMap;
import java.util.Map;

public class UserService {

    private Map<String, String> users = new HashMap<>();

    public UserService() {
        users.put("bhuvana", "1234");
        users.put("admin", "admin123");
    }

    public boolean login(String username, String password) {
        if (!users.containsKey(username)) return false;
        return users.get(username).equals(password);
    }
}
