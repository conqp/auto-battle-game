package org.example;

public class Main {
    public static void main(String[] args) {
        Character link = new Character("Link");
        System.out.println(link);
        Character acheman = new Character("Acheman");
        System.out.println(acheman);
        link.gainXp(42);
        System.out.println(link);
        CombatResult result = link.combat(acheman);
        System.out.printf("%s %s %s %s%n", link.getName(), (result == CombatResult.Won) ? "won" : "lost", "against", acheman.getName());
    }
}
