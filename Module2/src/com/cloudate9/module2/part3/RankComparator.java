package com.cloudate9.module2.part3;

import java.util.Comparator;

/**
 * Since Ace isn't a face card, for simplicity, it will be treated as 1 and will thus be smaller than all other cards
 */
public class RankComparator implements Comparator<Card> {

    @Override
    public int compare(Card o1, Card o2) {
        String rank1 = o1.getRank();
        String rank2 = o2.getRank();

        if (rank1.equals(rank2)) return 0;
        if (o1.isFaceCard()) {
            if (!o2.isFaceCard()) return -1;
            switch (rank1) {
                case "K" -> {
                    return -1;
                }
                case "Q" -> {
                    if (rank2.equals("K")) return 1;
                    return -1;
                }
                case "J" -> {
                    if (rank2.equals("K") || rank2.equals("Q")) return 1;
                    return -1;
                }
            }
        } else if (o2.isFaceCard()) {
            // Any face card will be bigger than a non-face card
            return 1;
        }
        // Neither are face cards, so we can just compare the ranks
        return Integer.parseInt(rank1) > Integer.parseInt(rank2) ? -1 : 1;
    }
}
