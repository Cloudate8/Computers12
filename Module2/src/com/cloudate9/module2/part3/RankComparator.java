package com.cloudate9.module2.part3;

import java.util.Comparator;

/**
 * Since Ace isn't a face card, for simplicity, it will be treated as 1 and will thus be smaller than all other cards
 */
public class RankComparator implements Comparator<Card> {

    @Override
    public int compare(Card o1, Card o2) {
        char rank1 = o1.getRank();
        char rank2 = o2.getRank();

        if (rank1 == rank2) return 0;
        if (o1.isFaceCard()) {
            if (!o2.isFaceCard()) return -1;
            switch (rank1) {
                case 'K' -> {
                    return -1;
                }
                case 'Q' -> {
                    if (rank2 == 'K') return 1;
                    return -1;
                }
                case 'J' -> {
                    if (rank2 == 'K' || rank2 == 'Q') return 1;
                    return -1;
                }
            }
        } else if (o2.isFaceCard()) {
            // Any face card will be bigger than a non-face card
            return 1;
        }
        // Neither are face cards, so we can just compare the ranks
        return rank1 > rank2 ? -1 : 1;
    }
}
