package com.sinak.designpatterns.strategy.DynamicStrategySelection;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Item {

    private String name;
    private double price;
    private PricingStrategy pricingStrategy;

    public double calculatePrice() {
        return pricingStrategy.calculate(price);
    }

    public void setPricingStrategy(PricingStrategy pricingStrategy) {
        this.pricingStrategy = pricingStrategy;
    }

}
