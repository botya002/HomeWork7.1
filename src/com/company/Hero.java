package com.company;

public abstract class Hero extends GameEntity implements HavingSuperAbility{

    public Hero(int hp, int damage) {
        super(hp, damage);
    }
}
