package it.eneaminelli;

import it.eneaminelli.attacks.LegacyAttackAdapter;
import it.eneaminelli.attacks.LegacySwordAttack;
import it.eneaminelli.attacks.MeleeAttack;
import it.eneaminelli.attacks.RangedAttack;
import it.eneaminelli.characters.Mage;
import it.eneaminelli.characters.Warrior;

public class App {
    
    public static void main(String[] args) {
        //Create a warrior with melee attack
        Warrior warrior = new Warrior("Conan", new MeleeAttack());
        warrior.performTurn();

        //Create a mage with a ranged attack
        Mage mage = new Mage("Gandalf",new RangedAttack());
        mage.performTurn();

        //Create a warrior that uses legacy methods
        Warrior legacyWarrior = new Warrior("Legacy War", new LegacyAttackAdapter(new LegacySwordAttack()));
        legacyWarrior.performTurn();
    }
}
