package org.example;

public interface Combatant extends Skillable {
    default CombatOutcome combat(Combatant other, int cost) {
        if (getXp() > other.getXp()) {
            other.loseXp(cost);
            return CombatOutcome.Won;
        }

        if (getXp() == other.getXp()) {
            return CombatOutcome.Draw;
        }

        loseXp(cost);
        return CombatOutcome.Lost;
    }
}
