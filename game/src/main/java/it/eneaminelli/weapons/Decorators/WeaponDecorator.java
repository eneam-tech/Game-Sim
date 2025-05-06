package it.eneaminelli.weapons.Decorators;

import it.eneaminelli.weapons.Weapon;

public abstract class WeaponDecorator implements Weapon{
    protected Weapon decoratedWeapon;

    public WeaponDecorator(Weapon decoratedWeapon) {
        this.decoratedWeapon = decoratedWeapon;
    }

    @Override
    public void attack(){
        decoratedWeapon.attack();
    }

    @Override
    public String toString(){
        return super.toString() + "(" + this.getClass().getSimpleName() +")";
    }

}
