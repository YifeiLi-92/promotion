package com.example.promotion;

public class Item {
    public int count;
    public double price;
    public PromotionType type;

    Item(int count, double price, PromotionType type) {
        this.count = count;
        this.price = price;
        this.type = type;
    }
}
