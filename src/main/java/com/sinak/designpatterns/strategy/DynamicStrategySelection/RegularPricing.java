package com.sinak.designpatterns.strategy.DynamicStrategySelection;

public class RegularPricing implements PricingStrategy {
    @Override
    public double calculate(double price) {
        return price;
    }
}
