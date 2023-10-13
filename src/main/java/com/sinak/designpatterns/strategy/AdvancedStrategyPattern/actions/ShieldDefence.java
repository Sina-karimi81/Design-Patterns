package com.sinak.designpatterns.strategy.AdvancedStrategyPattern.actions;

public class ShieldDefence implements DefenceAction{
    @Override
    public String performDefence() {
        return "defended with a shield";
    }
}
