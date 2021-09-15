package com.company;

public class Warrior extends Hero{
    public Warrior(int hp, int damage) {
        super(hp, damage);
    }

    @Override
    public void applySuperAbility(String superAbilityType) {
        System.out.println(superAbilityType);

    }
}
