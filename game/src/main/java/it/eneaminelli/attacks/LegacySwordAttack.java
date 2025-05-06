package it.eneaminelli.attacks;

public class LegacySwordAttack implements LegacyAttack {
    @Override
    public void doAttack(){
        System.out.println("Swinging a sword [[LEGACY]].");
    }
}
