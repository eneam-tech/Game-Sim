package it.eneaminelli.attacks;

public class RangedAttack implements AttackStrategy{
    
    @Override
    public void executeAttack() {
        System.out.println("Shoots a ranged projectile.");
    }
}
