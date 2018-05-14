package com.sda.observerobservable.Zadanie2;

/**
 * Stwórz aplikacje (model) ChatRoom'u
 * Stwórz klasę ChatUser która posiada:
 * private int id;
 * private String nick;
 * private List<String> messages;
 * private boolean isAdmin;
 * <p>
 * Stwórz klasę chatRoom która posiada:
 * - mapę zalogowanych użytkowników (id -> user)
 * - String roomName;
 * - z góry zdefiniowaną listę nicków dla userów którzy są adminami. ( stwórz listę i dodaj od razu np. nick
 * "admin" "administrator", jeśli user zaloguje się z takim nickiem to jest adminem)
 * <p>
 * metody:
 * void userLogin(String nick) - loguje użytkownika (dodaje go do kolekcji) --- > Dodatkowe, Później(tutaj będzie podpięcie mechanizmu observer-observable)
 * void sendMessage(int user, String message); - rozsyła wiadomości do wszystkich użytkowników
 * void kickUser(int id_kickowanego, int id_kickującego); - weryfikuje czy kickujący jest adminem i wyrzuca kickowanego.
 * <p>
 * <p>
 * Spróbuj wykonać aplikację tak, aby wykorzystywała mechanizm observer i observable.
 * Można to zrobić na dwa sposoby:
 * 1. Observable jest server, wysyłamy wiadomość wywołując metodę send a on rozsyła (notify) (observerem są userzy)
 * 2. Observable i observer to userzy. Wysyłając wiadomość wszyscy są informowani o rozesłaniu -> UWAGA! każdy użytkownik jest Observerem oraz Observable.
 * <p>
 * https://bitbucket.org/nordeagda2/designpatternobserverobservablechatroom
 */
public class Main {
}
