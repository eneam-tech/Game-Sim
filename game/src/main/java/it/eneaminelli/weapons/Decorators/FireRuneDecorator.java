package it.eneaminelli.weapons.Decorators;

import it.eneaminelli.weapons.Weapon;

public class FireRuneDecorator extends WeaponDecorator {

    public FireRuneDecorator(Weapon decoratedWeapon) {
        super(decoratedWeapon);

    }

    @Override
    public void attack() {
        System.out.println("The weapon glows with a fiery aura.");
        decoratedWeapon.attack();
        System.out.println("The attack burns enemy with fire.");
    }
    
    @Override
    public String toString(){
        return this.decoratedWeapon.toString() + "("+ this.getClass().getSimpleName() +")";
    }
}
