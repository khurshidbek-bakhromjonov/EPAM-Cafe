package com.company.models;

import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

@Getter
public class Basket {

    private static final int MAX_BASKET_VOLUME = 10;

    private Map<Item, Integer> basket;
    private double basketPrice;
    private int basketVolume;

    public Basket() {
        basket = new HashMap<>(MAX_BASKET_VOLUME);
        basketVolume = 0;
    }

    public void setBasket(Item item) {
        if (basket.containsKey(item)) {
            int amount = basket.get(item);
            basket.put(item, amount + 1);
        } else
            basket.put(item, 1);

        basketVolume += 1;
        basketPrice = basketPrice + item.getPrice();
    }
}
