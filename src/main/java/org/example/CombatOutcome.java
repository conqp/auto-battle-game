package org.example;

public enum CombatOutcome {
    Won,
    Lost;

    @org.jetbrains.annotations.NotNull
    @org.jetbrains.annotations.Contract(pure = true)
    public String toString() {
        return (this == Won) ? "won" : "lost";
    }
}
