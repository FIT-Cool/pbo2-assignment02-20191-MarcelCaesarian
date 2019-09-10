package com.marcel.entity;

public class Item {
    private String Name;
    private double Price;
    private Category Category;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double price) {
        Price = price;
    }

    public com.marcel.entity.Category getCategory() {
        return Category;
    }

    public void setCategory(com.marcel.entity.Category category) {
        Category = category;
    }
}
