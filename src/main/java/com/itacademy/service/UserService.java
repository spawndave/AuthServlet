package com.itacademy.service;

import com.itacademy.model.dao.UserDao;
import com.itacademy.model.entity.User;

public class UserService {
    public User login(String login, String password){
        return UserDao.getInstance().login(login, password);
    }
    public boolean register(User user){
        return UserDao.getInstance().register(user);
    }
}
