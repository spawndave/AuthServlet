package com.itacademy.model.dao;

import com.itacademy.model.User;

import java.util.TreeMap;

public class UserDao {
    private static volatile UserDao instance;
    private final TreeMap<String, User> userStorage = new TreeMap<>();

    UserDao(){
        if (instance != null) {
            throw new IllegalStateException("Already initialized.");
        }
        create();
    }
    public static UserDao getInstance() {

        UserDao result = instance;
        if (result == null) {
            synchronized (UserDao.class) {
                result = instance;
                if (result == null) {
                    result = new UserDao();
                    instance = result;
                }
            }
        }
        return result;
    }

    private void create(){
        userStorage.put("admin", new User("admin", "admin","Admin"));
    }
    public  User login(String login, String password){
        User user = userStorage.get(login);
        if(user!= null && user.getPassword().equals(password)){
            return user;
        }
        return null;
    }
    public boolean register(User user){
        if(userStorage.containsKey(user.getLogin())
                && userStorage.get(user.getLogin()).getPassword().equals(user.getPassword()) ){
            return false;
        }else{
            userStorage.put(user.getLogin(), user);
            return true;
        }
    }

}
