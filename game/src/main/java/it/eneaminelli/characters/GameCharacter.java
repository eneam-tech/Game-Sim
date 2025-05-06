package it.eneaminelli.characters;

import it.eneaminelli.GameEntity;
import it.eneaminelli.attacks.AttackStrategy;

public abstract class GameCharacter extends GameEntity {
    protected AttackStrategy attackStrategy;

    public GameCharacter(String name, AttackStrategy attackStrategy) {
        super(name);
        this.attackStrategy = attackStrategy;
    }

    //Template Method - finalò to preserve the algs structure
    public final void performTurn() {
        System.out.println(name + " starts turn.");
        move(); //Move - overloaded method example
        attack(); //delegates attack to the strategy
        defend(); // defend - hook method that can be overwritten
        System.out.println(name + " ends turn");
    }

    //Default move method (overloading example)
    public void move() {
        System.out.println(name + " moves at default speed");
    }

    //Overloaded move method with speed parameter
    public void move(int speed) {
        System.out.println(name + " moves at speed " + speed + ".");
    }

    //Delegates attack to the provided AttackStrategy
    public void attack() {
        System.out.println(name + " is attacking.");
        attackStrategy.executeAttack();
    }

    //Hook method that can be overridden by sybclass for custom defense behaviour
    public void defend() {
        System.out.println(name + " is defending from an attack");
    }
}
