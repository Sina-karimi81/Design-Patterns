package com.sinak.designpatterns.strategy.AdvancedStrategyPattern;

import com.sinak.designpatterns.strategy.AdvancedStrategyPattern.actions.AttackAction;
import com.sinak.designpatterns.strategy.AdvancedStrategyPattern.actions.DefenceAction;
import com.sinak.designpatterns.strategy.AdvancedStrategyPattern.actions.SpecialAbilityAction;
import lombok.AllArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@Setter
public class Character {

    private double characterLevel;
    private AttackAction attackAction;
    private DefenceAction defenceAction;
    private SpecialAbilityAction specialAbilityAction;

    public String attack() {
        return attackAction.performAttack();
    }

    public String defend() {
        return defenceAction.performDefence();
    }

    public String doSpecialAbility() {
        return specialAbilityAction.performSpecialAbility();
    }

    @Override
    public String toString() {
        return "Character{" +
                "characterLevel=" + characterLevel +
                ", attackAction=" + attackAction +
                ", defenceAction=" + defenceAction +
                ", specialAbilityAction=" + specialAbilityAction +
                '}';
    }
}
