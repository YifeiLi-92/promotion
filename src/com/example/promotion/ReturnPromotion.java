package com.example.promotion;

public enum ReturnPromotion {
    RETURN_300_100(300, 100);

    private double condition;

    private double returnCash;

    ReturnPromotion(double condition, double returnCash) {
        this.condition = condition;
        this.returnCash = returnCash;
    }

    public double getCondition() {
        return this.condition;
    }

    public double getReturnCash() {
        return this.returnCash;
    }
}
