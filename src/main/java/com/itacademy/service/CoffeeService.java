package com.itacademy.service;

import com.itacademy.model.Coffee;
import com.itacademy.model.dao.CoffeeDao;

import java.util.HashSet;

public class CoffeeService {

    public boolean addCofee(Coffee cofee) {
        return false;
    }

    public Coffee getCoffee(String id) {
        return CoffeeDao.getInstance().getCoffee(Integer.parseInt(id));
    }

    public HashSet<Coffee> getAvailableCoffeeList() {
        return CoffeeDao.getInstance().getCoffeeList();
    }

}
