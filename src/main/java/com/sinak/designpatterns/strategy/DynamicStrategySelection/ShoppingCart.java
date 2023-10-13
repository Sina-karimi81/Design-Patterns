package com.sinak.designpatterns.strategy.DynamicStrategySelection;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class ShoppingCart {

    private List<Item> itemList = new ArrayList<>();

    public void addItem(Item item) {
        itemList.add(item);
    }

    public void removeItem(Item item) {
        itemList.remove(item);
    }

    public double calculateTotalPrice() {
        double sum = 0;
        for (Item item: itemList) {
            sum += item.calculatePrice();
        }

        return sum;
    }

    public void changePricingStrategyForAnItem(Item item , PricingStrategy pricingStrategy) {
        if(itemList.contains(item)) {
            var itm = itemList.stream().filter(fi -> fi.getName().equals(item.getName())).findFirst().orElse(null);
            if(itm != null) {
                itm.setPricingStrategy(pricingStrategy);
            }

        } else {
            item.setPricingStrategy(pricingStrategy);
            itemList.add(item);
        }
    }

}
