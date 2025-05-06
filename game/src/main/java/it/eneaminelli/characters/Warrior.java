package it.eneaminelli.characters;

import it.eneaminelli.attacks.AttackStrategy;

public class Warrior extends GameCharacter {
 
    public Warrior(String name, AttackStrategy attackStrategy) {
        super(name, attackStrategy);
    }

    //Overloading defend for warrior specific behaviour
    @Override
    public void defend(){
        System.out.println(name + "is defending with a shield");
    }
}
