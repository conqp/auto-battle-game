package org.example;

public class Main {
    public static void main(String[] args) {
        Character link = new Character("Link");
        System.out.println(link);
        link.gainXp(42);
        System.out.println(link);
    }
}