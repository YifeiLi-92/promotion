package com.example.promotion;

import java.util.Arrays;
import java.util.List;

public class PromotionApplication {
    public static void main(String[] args) {
        List<Item> items = Arrays.asList(
                new Item(10, 20, "DISCOUNT_8"),
                new Item(15, 10, "DISCOUNT_5"),
                new Item(15, 10, "NO_DISCOUNT"),
                new Item(15, 10, "RETURN_300_100"),
                new Item(15, 30, "RETURN_300_100")
        );

        items.forEach(item -> {
            CashContext cashContext = new CashContext(item.type);
            double sum = cashContext.getPrice(item.price * item.count);
            System.out.println("单价：" + item.price + "， 数量：" + item.count + ", 促销方式：" + item.type + ", 总价：" + sum);
        });
    }
}
