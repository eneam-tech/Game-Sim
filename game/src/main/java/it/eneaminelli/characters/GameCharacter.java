package it.eneaminelli.characters;

import it.eneaminelli.GameEntity;
import it.eneaminelli.backpack.Backpack;
import it.eneaminelli.weapons.Weapon;

public abstract class GameCharacter extends GameEntity {

    protected Weapon weapon;
    protected Backpack backpack;

    //Getter for backpack
    public Backpack getBackpack() {
        return backpack;
    }

    public void showBackpackContent(){
        this.backpack.display();
    }

    //Getter and setter for weapon
    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        System.out.println("Changing weapon with a new " + weapon);
        this.weapon = weapon;
    }


    // ---------------------------------------------- Game Character constructor
    public GameCharacter(String name) {
        super(name);
        this.backpack = new Backpack();
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
        if (this.weapon != null){
            this.weapon.attack();
        }
        else{
            System.err.println("No weapon equipped, can't attack.");
        }
    }

    //Hook method that can be overridden by sybclass for custom defense behaviour
    public void defend() {
        System.out.println(name + " is defending from an attack");
    }

}
