package org.example;

public enum CombatResult {
    Won,
    Lost;

    public String toString() {
        return (this == Won) ? "won" : "lost";
    }
}
