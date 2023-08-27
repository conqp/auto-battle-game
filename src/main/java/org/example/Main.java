package org.example;

import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        ThreadLocalRandom random = ThreadLocalRandom.current();
        Character link = new Character("Link", random.nextInt(0, 100));
        System.out.println(link);
        Character acheman = new Character("Acheman", random.nextInt(0, 100));
        System.out.println(acheman);
        link.gainXp(random.nextInt(0, 100));
        System.out.println(link);
        CombatResult result = link.combat(acheman);
        System.out.printf("%s %s %s %s\n", link.getName(), result, "against", acheman.getName());
    }
}
