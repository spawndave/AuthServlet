package com.itacademy.model.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class User {
    private String login;
    private String password;
    private String name;

}
