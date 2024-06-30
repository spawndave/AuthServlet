package com.itacademy.service;

import com.itacademy.model.dao.CoffeeDao;
import com.itacademy.model.Coffee;
import java.util.HashSet;

public class CoffeeService {

    public static boolean addCofee(Coffee cofee) {
        return false;
    }

    public static Coffee getCoffee(String id) {
        return CoffeeDao.getInstance().getCoffee(Integer.parseInt(id));
    }

    public static HashSet<Coffee> getAvailableCoffeeList() {
        return CoffeeDao.getInstance().getCoffeeList();
    }

}
