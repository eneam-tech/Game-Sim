package it.eneaminelli.attacks;

public class LegacyAttackAdapter implements AttackStrategy {
    private LegacyAttack legacyAttack;

    public LegacyAttackAdapter(LegacyAttack legacyAttack) {
        this.legacyAttack = legacyAttack;
    }

    @Override
    public void executeAttack() {
        //Adapts legacy method to call the new interface
        legacyAttack.doAttack();
    }
}
