package com.company;

public class Medic extends Hero{
    public Medic(int hp, int damage) {
        super(hp, damage);
    }

    @Override
    public void applySuperAbility(String superAbilityType) {
        System.out.println(superAbilityType);
    }
}
