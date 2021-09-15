package com.company;

public class Main {

    public static void main(String[] args) {
    Magic magic = new Magic(40, 50);
    Medic medic = new Medic(30, 10);
    Warrior warrior = new Warrior(50, 60);

    Hero[] Heroes = {magic,warrior,medic};
        for (int i = 0; i < Heroes.length  ; i++) {
            Heroes[i].applySuperAbility("Огненный шар");
            Heroes[i].applySuperAbility("Крит урон");
            Heroes[i].applySuperAbility("Лечить");
            break;
        }
    }
}
