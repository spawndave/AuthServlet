package com.itacademy.service;

import com.itacademy.dao.CoffeeDao;
import com.itacademy.model.Coffee;
import jakarta.servlet.http.Cookie;

import java.util.HashSet;

public class CoffeeService {

    public static boolean addCofee(Coffee cofee) {
        return false;
    }

    public static Coffee getCoffee(String id) {
        return CoffeeDao.coffeeStorage.get(Integer.parseInt(id));
    }

    public static HashSet<Coffee> getAvailableCoffeeList() {
        return CoffeeDao.getCoffeeList();
    }

}
