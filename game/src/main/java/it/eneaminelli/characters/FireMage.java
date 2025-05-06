package it.eneaminelli.characters;

import it.eneaminelli.attacks.AttackStrategy;

public class FireMage extends Mage {

    public FireMage(String name, AttackStrategy attackStrategy) {
        super(name, attackStrategy);
    }

    //Overriding attack for fire mage
    @Override
    public void attack() {
        System.out.println(name + " conjures a fire spell attack.");
        attackStrategy.executeAttack();
    }

}


