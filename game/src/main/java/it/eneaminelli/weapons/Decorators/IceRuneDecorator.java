package it.eneaminelli.weapons.Decorators;

import it.eneaminelli.weapons.Weapon;

public class IceRuneDecorator extends WeaponDecorator {

    public IceRuneDecorator(Weapon decoratedWeapon) {
        super(decoratedWeapon);

    }

    @Override
    public void attack() {
        System.out.println("The weapon glows with a icy aura.");
        decoratedWeapon.attack();
        System.out.println("The attack freezes enemy with ice.");
    }
    
}
