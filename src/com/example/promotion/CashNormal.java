package com.example.promotion;

public class CashNormal extends CashSuper {
    @Override
    public double acceptCash(double price) {
        return price;
    }
}
