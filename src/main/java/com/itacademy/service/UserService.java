package com.itacademy.service;

import com.itacademy.dao.UserDao;
import com.itacademy.model.User;

public class UserService {
    public static User getUser(String login, String password){
        return UserDao.getUser(login, password);
    }
    public static boolean addUser(User user){
        return UserDao.addNewUser(user);
    }
}
