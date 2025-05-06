package it.eneaminelli.characters;

import it.eneaminelli.attacks.RangedAttack;
import it.eneaminelli.weapons.BasicWeapon;

public class Mage extends GameCharacter {
    public Mage(String name) {
        super(name);
        this.setWeapon(new BasicWeapon(new RangedAttack()));
    }

    //Overriding defence for mage
    @Override
    public void defend() {
        System.out.println(name + " defends with a spell.");
    }
}
