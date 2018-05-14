package com.sda.builder.Zadanie1;

import java.util.ArrayList;
import java.util.List;

/**
 * Stwórz aplikację a w niej klasę GameCharacter która jest postacią w grze. Postać powinna mieć pola:
 * <p>
 * name,
 * health,
 * mana,
 * number of points
 * <p>
 * Stwórz w niej buildera.
 * W mainie stwórz kolekcję postaci (listę lub set) i dodaj do niej kilka takich samych postaci,
 * oraz kilka postaci odrobinę zmodyfikowanych (punktami lub mana i życiem).
 */
public class Main {
    public static void main(String[] args) {

        GameCharacter.Builder builder = new GameCharacter.Builder();
        List<GameCharacter> gameCharacters = new ArrayList<>();

        GameCharacter bohater1 = builder.setHealth(10).setMana(20).setName("Bob").setNumberOfPoints(10).createGameCharacter();
        GameCharacter bohater2 = builder.createGameCharacter();
        GameCharacter bohater3 = builder.createGameCharacter();
        GameCharacter bohater4 = builder.createGameCharacter();
        GameCharacter bohater5 = builder.setHealth(10).setMana(15).createGameCharacter();
        GameCharacter bohater6 = builder.setHealth(2).setMana(9).createGameCharacter();
        GameCharacter bohater7 = builder.setHealth(10).setMana(1).createGameCharacter();

        gameCharacters.add(bohater1);
        gameCharacters.add(bohater2);
        gameCharacters.add(bohater3);
        gameCharacters.add(bohater4);
        gameCharacters.add(bohater5);
        gameCharacters.add(bohater6);
        gameCharacters.add(bohater7);

        System.out.println(gameCharacters);
    }
}
