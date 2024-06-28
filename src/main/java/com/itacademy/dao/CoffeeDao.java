package com.itacademy.dao;

import com.itacademy.model.Coffee;
import com.itacademy.model.User;

import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeMap;

public class CoffeeDao {
    public static TreeMap<Integer, Coffee> coffeeStorage = new TreeMap<>();
    static{
        coffeeStorage.put(0, new Coffee("Espresso Macchiato", "15 Calories, 0g Fat, 2g Carbs, 1g Protein", 2.2f));
        coffeeStorage.put(1, new Coffee("Frappuccino", "420 Calories, 15g Fat, 66g Carbs, 6g Protein", 3.5f));
        coffeeStorage.put(2, new Coffee("Iced Coffee Latte", "130 Calories, 4.5g Fat, 13g Carbs, 8g Protein", 2.5f));
        coffeeStorage.put(3, new Coffee("Espresso Shot", "10 Calories, 0g Fat, 3g Carbs, 1g Protein", 1.5f));
    }
    public static Coffee getCoffee(int id){
        Coffee coffee = null;
        if(coffeeStorage.containsKey(id)){
            coffee = coffeeStorage.get(id);
        }
        return coffee;
    }
    public static boolean addCoffee(Coffee coffee){
        if(coffeeStorage.containsKey(coffee.getId())){
        }else{
            coffeeStorage.put(coffee.getId(), coffee);
            return true;
        }
        return false;
    }
    public static HashSet<Coffee> getCoffeeList(){
        return new HashSet<Coffee>(coffeeStorage.values());
    }

}
