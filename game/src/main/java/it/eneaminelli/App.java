package it.eneaminelli;

import it.eneaminelli.attacks.LegacyAttackAdapter;
import it.eneaminelli.attacks.LegacySwordAttack;
import it.eneaminelli.characters.Mage;
import it.eneaminelli.characters.Warrior;
import it.eneaminelli.weapons.BasicWeapon;

public class App {
    
    public static void main(String[] args) {
        //Create a warrior with melee attack
        Warrior warrior = new Warrior("Conan");
        warrior.performTurn();

        //Create a mage with a ranged attack
        Mage mage = new Mage("Gandalf");
        mage.performTurn();

        //Create a warrior that uses legacy methods
        Warrior legacyWarrior = new Warrior("Legacy War");
        legacyWarrior.setWeapon(new BasicWeapon(new LegacyAttackAdapter(new LegacySwordAttack())));
        legacyWarrior.performTurn();
    }
}
