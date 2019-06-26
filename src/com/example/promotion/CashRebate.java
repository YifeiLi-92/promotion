package com.example.promotion;

public class CashRebate extends CashSuper {
    private double rebate;

    public CashRebate(double rebate) {
        this.rebate = rebate;
    }

    @Override
    public double acceptCash(double price) {
        return price * rebate;
    }
}
