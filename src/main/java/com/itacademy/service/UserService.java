package com.itacademy.service;

import com.itacademy.model.dao.UserDao;
import com.itacademy.model.User;

public class UserService {
    public static User login(String login, String password){
        return UserDao.getInstance().login(login, password);
    }
    public static boolean register(User user){
        return UserDao.getInstance().register(user);
    }
}
