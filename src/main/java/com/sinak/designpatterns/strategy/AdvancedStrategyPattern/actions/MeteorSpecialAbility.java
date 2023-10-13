package com.sinak.designpatterns.strategy.AdvancedStrategyPattern.actions;

public class MeteorSpecialAbility implements SpecialAbilityAction {
    @Override
    public String performSpecialAbility() {
        return "A Meteor was dropped from the sky";
    }
}
