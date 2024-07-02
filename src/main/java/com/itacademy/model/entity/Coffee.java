package com.itacademy.model.entity;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class Coffee {
    private static int counter = 0;
    private final int id = counter++;
    private final String title;
    private final String description;
    private final float price;
}
