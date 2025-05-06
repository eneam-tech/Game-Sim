package it.eneaminelli.weapons;

import it.eneaminelli.attacks.AttackStrategy;

public class BasicWeapon implements Weapon {
    
    private AttackStrategy strategy;

    public BasicWeapon(AttackStrategy strategy) {
        this.strategy = strategy;
    }

    @Override
    public void attack() {
        this.strategy.executeAttack();
    }
}
