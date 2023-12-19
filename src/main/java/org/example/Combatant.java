package org.example;

public interface Combatant {
    default CombatOutcome combat(Combatant other) {
        if (getXp() > other.getXp()) {
            return CombatOutcome.Won;
        }

        if (getXp() == other.getXp()) {
            return CombatOutcome.Draw;
        }

        return CombatOutcome.Lost;
    }

    int getXp();
}
