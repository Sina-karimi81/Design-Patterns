package com.sinak.designpatterns.strategy.AdvancedStrategyPattern.actions;

public class IceWallDefence implements DefenceAction {
    @Override
    public String performDefence() {
        return "Ice wall was conjured";
    }
}
