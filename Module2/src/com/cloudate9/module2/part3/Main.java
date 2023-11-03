package com.cloudate9.module2.part3;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Deck deck = new Deck();
        List<Card> hand = deck.pollSeven();
        for (Card card : hand) {
            System.out.println(card);
        }
        hand.sort(new SuitComparator());
        System.out.println("After sorting by suit");
        for (Card card : hand) {
            System.out.println(card);
        }
        hand.sort(new RankComparator());
        System.out.println("After sorting by rank");
        for (Card card : hand) {
            System.out.println(card);
        }
    }

}
