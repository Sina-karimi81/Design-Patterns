package com.sinak.designpatterns.strategy.DynamicStrategySelection;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class DiscountPricing implements PricingStrategy {

    private double discountPercent;

    @Override
    public double calculate(double price) {

        return price - (price * discountPercent / 100);
    }
}
