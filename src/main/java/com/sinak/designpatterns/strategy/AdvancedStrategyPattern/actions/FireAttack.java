package com.sinak.designpatterns.strategy.AdvancedStrategyPattern.actions;

public class FireAttack implements AttackAction {
    @Override
    public String performAttack() {
        return "Fire ball was thrown at enemy";
    }
}
