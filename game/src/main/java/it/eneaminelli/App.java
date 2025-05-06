package it.eneaminelli;

import it.eneaminelli.attacks.LegacyAttackAdapter;
import it.eneaminelli.attacks.LegacySwordAttack;
import it.eneaminelli.attacks.RangedAttack;
import it.eneaminelli.backpack.Item;
import it.eneaminelli.backpack.Package;
import it.eneaminelli.characters.Mage;
import it.eneaminelli.characters.Warrior;
import it.eneaminelli.weapons.BasicWeapon;
import it.eneaminelli.weapons.Decorators.FireRuneDecorator;
import it.eneaminelli.weapons.Decorators.IceRuneDecorator;
import it.eneaminelli.weapons.Weapon;

public class App {
    
    public static void main(String[] args) {

        //Create a warrior with melee attack
        System.out.println("_____________Warrior turn___________");
        Warrior warrior = new Warrior("Conan");
        warrior.getBackpack().addItem(new Item("Health Potion"));
        Package treasureChest = new Package("Treasure Chest");
        treasureChest.addItem(new Item("Gold Coin"));
        treasureChest.addItem(new Item("Silver Ring"));
        warrior.getBackpack().addItem(treasureChest);
        warrior.showBackpackContent();
        warrior.performTurn();

        //Create a mage with a ranged attack
        System.out.println("_____________Mage turn___________");
        Mage mage = new Mage("Gandalf");
        Weapon staff = new BasicWeapon(new RangedAttack());
        staff = new IceRuneDecorator(staff);
        staff = new FireRuneDecorator(staff);
        mage.setWeapon(staff);
        mage.showBackpackContent();
        mage.performTurn();

        //Create a warrior that uses legacy methods
        System.out.println("_____________Legacy Warrior turn___________");
        Warrior legacyWarrior = new Warrior("Legacy War");
        legacyWarrior.setWeapon(new BasicWeapon(new LegacyAttackAdapter(new LegacySwordAttack())));
        legacyWarrior.performTurn();
    }
}
