package org.example;

public interface Combatant {
    default CombatOutcome combat(Combatant other) {
        if (getXp() > other.getXp()) {
            return CombatOutcome.Won;
        }

        return CombatOutcome.Lost;
    }

    int getXp();
}
