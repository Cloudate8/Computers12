package com.cloudate9.module2.part3;

import java.util.*;

/**
 * The instructions ask me to "put [the cards] into a linked list and simulate a stack using a method that
 * creates a deck of cards" and to "try polling a hand of seven cards stored in another list."
 * <p>
 * Given the use of the word "simulate," I am assuming that we are not to use the Stack class,
 * and that we should instead use a LinkedList to represent a stack of cards. This is further backed up by the use of the
 * word "polling" in the second part of the instructions, which does not exist in the Stack class.
 */
public class Deck {

    private final LinkedList<Card> cards;

    public Deck() {
        LinkedList<Card> unShuffledCards = createDeck();
        cards = shuffle(unShuffledCards);
    }

    private LinkedList<Card> createDeck() {
        LinkedList<Card> unShuffledCards = new LinkedList<>();
        for (Suit suit : Suit.values()) {
            for (int rank = 1; rank <= 10; rank++) {
                unShuffledCards.add(new Card(suit, String.valueOf(rank)));
            }
            unShuffledCards.add(new Card(suit, "K"));
            unShuffledCards.add(new Card(suit, "Q"));
            unShuffledCards.add(new Card(suit, "J"));
        }
        return unShuffledCards;
    }

    private LinkedList<Card> shuffle(LinkedList<Card> unShuffledCards) {
        Random random = new Random();
        LinkedList<Card> shuffledCards = new LinkedList<>();

        while (!unShuffledCards.isEmpty()) {
            int randomIndex = random.nextInt(unShuffledCards.size());
            shuffledCards.push(unShuffledCards.remove(randomIndex));
        }
        return shuffledCards;
    }

    public List<Card> pollSeven() {
        List<Card> polledCards = new ArrayList<>();
        for (int i = 0; i < 7; i++) {
            polledCards.add(cards.poll());
        }
        return polledCards;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Deck deck = (Deck) o;
        return Objects.equals(cards, deck.cards);
    }

    @Override
    public int hashCode() {
        return cards.hashCode();
    }

    @Override
    public String toString() {
        return "Deck{" +
                "cards=" + cards +
                '}';
    }
}
