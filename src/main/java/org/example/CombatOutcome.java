package org.example;

public enum CombatOutcome {
    Won,
    Draw,
    Lost;

    @org.jetbrains.annotations.NotNull
    @org.jetbrains.annotations.Contract(pure = true)
    public String toString() {
        if (this == Won) {
            return "won";
        }

        if (this == Draw) {
            return "drew";
        }

        return "lost";
    }
}
