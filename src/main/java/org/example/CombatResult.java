package org.example;

public enum CombatResult {
    Won,
    Lost;

    @org.jetbrains.annotations.NotNull
    @org.jetbrains.annotations.Contract(pure = true)
    public String toString() {
        return (this == Won) ? "won" : "lost";
    }
}
