package strategy.character;

import strategy.weapon.WeaponBehavior;

public class Queen extends Character {

    public Queen(WeaponBehavior weapon) {
        super(weapon);
    }

    @Override
    public void display() {
        System.out.println("Queen:");
    }
}
