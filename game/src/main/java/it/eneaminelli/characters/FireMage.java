package it.eneaminelli.characters;

public class FireMage extends Mage {

    public FireMage(String name) {
        super(name);
    }

    //Overriding attack for fire mage
    @Override
    public void attack() {
        System.out.println(name + " conjures a fire spell attack.");
        super.attack();
    }

}


