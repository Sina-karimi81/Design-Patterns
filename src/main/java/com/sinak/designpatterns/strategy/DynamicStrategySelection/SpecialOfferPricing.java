package com.sinak.designpatterns.strategy.DynamicStrategySelection;

public class SpecialOfferPricing implements PricingStrategy {
    @Override
    public double calculate(double price) {
        return price - (price * 0.2);
    }
}
