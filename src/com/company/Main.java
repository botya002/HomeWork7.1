package com.company;

public class Main {

    public static void main(String[] args) {
    Magic magic = new Magic(40, 50);
    Medic medic = new Medic(30, 10);
    Warrior warrior = new Warrior(50, 60);

    Hero[] Heroes = {magic,warrior,medic};
        for (int i = 0; i < 1  ; i++) {
            Heroes[0].applySuperAbility("Огненный шар");
            Heroes[1].applySuperAbility("Крит урон");
            Heroes[2].applySuperAbility("Лечить");
            break;
        }
    }
}
