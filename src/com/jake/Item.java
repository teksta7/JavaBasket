package com.jake;

public class Item {
    float price;
    int quantity;
    String name;

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Item()
    {
        price = 0;
        quantity = 0;
        name = "Unknown";
    }
}
