package it.eneaminelli.attacks;

public class MeleeAttack implements AttackStrategy {
    @Override
    public void executeAttack(){
        System.out.println("Performs a powerful melee strike.");
    }
}
