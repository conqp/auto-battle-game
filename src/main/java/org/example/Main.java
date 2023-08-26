package org.example;

import static java.util.concurrent.ThreadLocalRandom.current;

public class Main {
    public static void main(String[] args) {
        Character link = new Character("Link", current().nextInt(0, 100));
        System.out.println(link);
        Character acheman = new Character("Acheman", current().nextInt(0, 100));
        System.out.println(acheman);
        link.gainXp(current().nextInt(0, 100));
        System.out.println(link);
        CombatResult result = link.combat(acheman);
        System.out.printf("%s %s %s %s\n", link.getName(), result, "against", acheman.getName());
    }
}
