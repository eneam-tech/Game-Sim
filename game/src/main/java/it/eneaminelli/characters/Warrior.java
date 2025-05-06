package it.eneaminelli.characters;

import it.eneaminelli.attacks.MeleeAttack;
import it.eneaminelli.weapons.BasicWeapon;

public class Warrior extends GameCharacter {
 
    public Warrior(String name) {
        super(name);
        this.setWeapon(new BasicWeapon(new MeleeAttack()));
    }

    //Overloading defend for warrior specific behaviour
    @Override
    public void defend(){
        System.out.println(name + " is defending with a shield");
    }
}
