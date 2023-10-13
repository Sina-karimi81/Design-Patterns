package com.sinak.designpatterns.strategy.AdvancedStrategyPattern;

import com.sinak.designpatterns.strategy.AdvancedStrategyPattern.actions.*;

public class GameDemo {

    public static void main(String[] args) {

        var knight = new Character(1 , new MeleeAttack() , new ShieldDefence() , null);
        var wizard = new Character(1 , new FireAttack() , new IceWallDefence(), null);

        System.out.println("character properties: ");
        System.out.println("knight = " + knight);
        System.out.println("wizard = " + wizard);

        System.out.println("knight = " + knight.attack());
        System.out.println("--------------------------------");
        System.out.println("wizard.attack() = " + wizard.attack());
        System.out.println("knight.defend() = " + knight.defend());
        System.out.println("--------------------------------");
        System.out.println("knight was injured but he leveled up and unlocked a special ability");
        knight.setCharacterLevel(2);
        knight.setSpecialAbilityAction(new MeteorSpecialAbility());

        System.out.println("knight = " + knight.doSpecialAbility());
        System.out.println("wizard.defend() = " + wizard.defend());

        System.out.println("the wizard was defeated!!!!!");

    }

}
