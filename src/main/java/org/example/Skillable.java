package org.example;

public interface Skillable {
    int getXp();

    void gainXp(int xp);

    default void loseXp(int xp) {
        gainXp(-xp);
    }
}
