package com.example.promotion;

public enum PromotionType {
    DISCOUNT_8(0.8), DISCOUNT_5(0.5), NO_DISCOUNT(1);

    private double discount;

    PromotionType(double discount) {
        this.discount = discount;
    }

    public double getDiscount() {
        return discount;
    }
}
