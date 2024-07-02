package com.itacademy.service;

import com.itacademy.model.dao.CoffeeDao;
import com.itacademy.model.entity.Coffee;

import java.util.HashSet;

public class CoffeeService {

    public Coffee getCoffee(String id) {
        return CoffeeDao.getInstance().getCoffee(Integer.parseInt(id));
    }

    public HashSet<Coffee> getAvailableCoffeeList() {
        return CoffeeDao.getInstance().getCoffeeList();
    }

}
