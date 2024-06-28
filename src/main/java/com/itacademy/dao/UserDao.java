package com.itacademy.dao;

import com.itacademy.model.Coffee;
import com.itacademy.model.User;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class UserDao {
    private static TreeMap<String, User> userStorage = new TreeMap<>();
    private static List<Coffee> drinkedCoffee = new ArrayList<>();
    static{
        userStorage.put("admin", new User("admin", "admin","Admin"));
    }
    public static User getUser(String login, String password){
        User user = null;
        if(userStorage.containsKey(login) && userStorage.get(login).getPassword().equals(password)){
            user = userStorage.get(login);
        }
        return user;
    }
    public static boolean addNewUser(User user){
        if(userStorage.containsKey(user.getLogin())){
        }else{
            userStorage.put(user.getLogin(), user);
            return true;
        }
        return false;
    }
    public static List<Coffee> getDrinkedCoffeeList(){
        return drinkedCoffee;
    }

}
