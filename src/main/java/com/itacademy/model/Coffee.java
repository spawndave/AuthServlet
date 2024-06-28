package com.itacademy.model;

public class Coffee {
    private static int counter = 0;
    private final int id = counter++;
    private final String title;
    private final String description;
    private final float price;

    public Coffee(String title, String description, float price) {
        this.title = title;
        this.description = description;
        this.price = price;
    }


    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public float getPrice() {
        return price;
    }
}
