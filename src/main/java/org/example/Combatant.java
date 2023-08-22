package org.example;

public interface Combatant {
    default CombatResult combat(Combatant other) {
        if (getXp() > other.getXp()) {
            return CombatResult.Won;
        }

        return CombatResult.Lost;
    }
    int getXp();
}
