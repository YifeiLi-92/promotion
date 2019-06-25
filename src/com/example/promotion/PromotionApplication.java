package com.example.promotion;

import java.util.Arrays;
import java.util.List;

import static com.example.promotion.PromotionType.DISCOUNT_5;
import static com.example.promotion.PromotionType.DISCOUNT_8;
import static com.example.promotion.PromotionType.NO_DISCOUNT;

public class PromotionApplication {
    public static void main(String[] args) {
        List<Item> items = Arrays.asList(
                new Item(10, 20, DISCOUNT_8),
                new Item(15, 10, DISCOUNT_5),
                new Item(15, 10, NO_DISCOUNT)
        );

        items.forEach(item -> {
            Double sum = calculate(item.count, item.price, item.type);
            System.out.println("单价：" + item.price + "， 数量：" + item.count + ", 促销方式：" + item.type + ", 总价：" + sum);
        });
    }

    private static Double calculate(int count, double price, PromotionType type) {
        return switch (type) {
            case DISCOUNT_5, DISCOUNT_8 -> count * price * type.getDiscount();
            default -> count * price;
        };
    }
}
