
package ca.mcgill.solitaire.cards;

import java.util.EnumMap;
import java.util.Map;

public final class CardLazy {
    private static final Map<Suit, Map<Rank, CardLazy>> CARDS =
            new EnumMap<>(Suit.class);

    private final Rank aRank;
    private final Suit aSuit;

    private CardLazy(Rank pRank, Suit pSuit) {
        aRank = pRank;
        aSuit = pSuit;
    }

    public static CardLazy get(Rank pRank, Suit pSuit) {
        assert pRank != null && pSuit != null;

        Map<Rank, CardLazy> innerMap =
                CARDS.computeIfAbsent(
                        pSuit, key -> new EnumMap<>(Rank.class));

        return innerMap.computeIfAbsent(
                pRank, key -> new CardLazy(pRank, pSuit));
    }

    public Rank rank() {
        return aRank;
    }

    public Suit suit() {
        return aSuit;
    }
}
