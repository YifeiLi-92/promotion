package com.example.promotion;

public class CashReturn extends CashSuper {
    private double condition;
    private double returnCash;

    public CashReturn(double condition, double returnCash) {
        this.condition = condition;
        this.returnCash = returnCash;
    }

    @Override
    public double acceptCash(double price) {
        return price - Math.floor(price / condition) * this.returnCash;
    }
}
