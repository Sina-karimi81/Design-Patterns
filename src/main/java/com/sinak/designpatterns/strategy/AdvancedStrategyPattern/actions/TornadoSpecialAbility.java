package com.sinak.designpatterns.strategy.AdvancedStrategyPattern.actions;

public class TornadoSpecialAbility implements SpecialAbilityAction {
    @Override
    public String performSpecialAbility() {
        return "A massive tornado was summoned";
    }
}
