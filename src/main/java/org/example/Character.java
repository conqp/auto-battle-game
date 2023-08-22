package org.example;
import static java.lang.Math.max;
import static java.lang.String.format;

public class Character implements Combatant {
    private final String name;
    private Integer xp;

    public Character(String name) {
        this.name = name;
        this.xp = 0;
    }

    public String getName() {
        return name;
    }

    @Override
    public int getXp() {
        return xp;
    }

    public void gainXp(int xp) {
        this.xp = max(this.xp + xp, 0);
    }

    public String toString() {
        return format("%s %s currently has %d XP", this.getClass().getSimpleName(), getName(), getXp());
    }
}
