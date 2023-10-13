package com.sinak.designpatterns.strategy.DynamicStrategySelection;

public class DynamicStrategy {

    public static void main(String[] args) {
        var regularPricing = new RegularPricing();
        var discountPricing = new DiscountPricing(60);
        var specialOfferPricing = new SpecialOfferPricing();

        var laptop = new Item("lapTop" , 500 , regularPricing);
        var ps5 = new Item("ps5" , 300 , specialOfferPricing);
        var phone = new Item("phone" , 700 , discountPricing);

        var cart = new ShoppingCart();
        cart.addItem(laptop);
        cart.addItem(ps5);
        cart.addItem(phone);

        for (var item : cart.getItemList()) {
            System.out.println("item.calculatePrice() = " + item.calculatePrice());
        }

        System.out.println("cart.calculateTotalPrice() = " + cart.calculateTotalPrice());

        cart.changePricingStrategyForAnItem(laptop , specialOfferPricing);
        cart.changePricingStrategyForAnItem(ps5 , regularPricing);

        for (var item : cart.getItemList()) {
            System.out.println("item.calculatePrice() = " + item.calculatePrice());
        }

        System.out.println("cart.calculateTotalPrice() = " + cart.calculateTotalPrice());

    }

}
