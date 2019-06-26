package com.example.promotion;

public class CashContext {
    private CashSuper cashSuper;

    public CashContext(String type) {
        switch (type) {
            case "DISCOUNT_5", "DISCOUNT_8" -> cashSuper = new CashRebate(RebatePromotion.valueOf(type).getDiscount());
            case "RETURN_300_100" -> cashSuper = new CashReturn(ReturnPromotion.valueOf(type).getCondition(), ReturnPromotion.valueOf(type).getReturnCash());
            default -> cashSuper = new CashNormal();
        };
    }

    public double getPrice(double price) {
        return cashSuper.acceptCash(price);
    }
}
