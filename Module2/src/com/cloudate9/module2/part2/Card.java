package com.cloudate9.module2.part2;

import java.util.Objects;

public class Card {
    private Suit suit;

    // Ace is '1'
    private String rank;
    private boolean isFaceCard;

    public Card(Suit suit, String rank) {
        this.suit = suit;
        this.rank = rank;
        this.isFaceCard = (rank.equals("K") || rank.equals("Q") || rank.equals("J"));
    }

    public Suit getSuit() {
        return suit;
    }

    public void setSuit(Suit suit) {
        this.suit = suit;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
        this.isFaceCard = (rank.equals("K") || rank.equals("Q") || rank.equals("J"));
    }

    public boolean isFaceCard() {
        return isFaceCard;
    }

    // No setting if it is a face card or not as it should be automatically determined


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return rank.equals(card.rank) && isFaceCard == card.isFaceCard && suit == card.suit;
    }

    @Override
    public int hashCode() {
        return Objects.hash(suit, rank, isFaceCard);
    }

    @Override
    public String toString() {
        return "Card{" +
                "suit=" + suit +
                ", rank=" + rank +
                ", isFaceCard=" + isFaceCard +
                '}';
    }
}
