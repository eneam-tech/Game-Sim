package it.eneaminelli.characters;

import it.eneaminelli.attacks.AttackStrategy;

public class Mage extends GameCharacter {
    public Mage(String name, AttackStrategy attackStrategy) {
        super(name, attackStrategy);
    }

    //Overriding defence for mage
    @Override
    public void defend() {
        System.out.println(name + " defends with a spell.");
    }
}
