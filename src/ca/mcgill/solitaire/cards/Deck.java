package ca.mcgill.solitaire.cards;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Represents a deck of 52 cards in a predetermined winnable order.
 *
 * The deck supports three predetermined configurations. Configuration 1 is
 * used by default.
 */
public class Deck {
    private static final int DEFAULT_CONFIGURATION = 1;
    private static final int NUMBER_OF_CONFIGURATIONS = 3;

    private final int aConfiguration;
    private CardStack aCards;

    public Deck() {
        this(DEFAULT_CONFIGURATION);
    }

    /**
     * @param pConfiguration configuration number, from 1 to 3
     * @pre pConfiguration >= 1 && pConfiguration <= 3
     */
    public Deck(int pConfiguration) {
        assert pConfiguration >= 1 && pConfiguration <= NUMBER_OF_CONFIGURATIONS;
        aConfiguration = pConfiguration;
        shuffle();
    }

    public void shuffle() {
        List<Card> cards;
        switch (aConfiguration) {
        case 1:
            cards = configurationOne();
            break;
        case 2:
            cards = configurationTwo();
            break;
        case 3:
            cards = configurationThree();
            break;
        default:
            throw new IllegalStateException("Invalid deck configuration");
        }

        // CardStack.pop() draws from the end, so reverse the desired draw order.
        Collections.reverse(cards);
        aCards = new CardStack(cards);
    }

    private static List<Card> configurationOne() {
        return new ArrayList<>(List.of(
                Card.get(Rank.JACK, Suit.CLUBS),
				Card.get(Rank.KING, Suit.CLUBS),
				Card.get(Rank.KING, Suit.HEARTS),
				Card.get(Rank.JACK, Suit.SPADES),
				Card.get(Rank.SIX, Suit.SPADES),
				Card.get(Rank.EIGHT, Suit.CLUBS),
				Card.get(Rank.QUEEN, Suit.HEARTS),
				Card.get(Rank.FIVE, Suit.SPADES),
				Card.get(Rank.SEVEN, Suit.HEARTS),
				Card.get(Rank.ACE, Suit.HEARTS),
				Card.get(Rank.SIX, Suit.HEARTS),
				Card.get(Rank.THREE, Suit.CLUBS),
				Card.get(Rank.TWO, Suit.DIAMONDS),
				Card.get(Rank.FIVE, Suit.HEARTS),
				Card.get(Rank.TEN, Suit.HEARTS),
				Card.get(Rank.FOUR, Suit.CLUBS),
				Card.get(Rank.FIVE, Suit.DIAMONDS),
				Card.get(Rank.KING, Suit.DIAMONDS),
				Card.get(Rank.FOUR, Suit.DIAMONDS),
				Card.get(Rank.NINE, Suit.HEARTS),
				Card.get(Rank.EIGHT, Suit.HEARTS),
				Card.get(Rank.EIGHT, Suit.DIAMONDS),
				Card.get(Rank.TEN, Suit.CLUBS),
				Card.get(Rank.THREE, Suit.DIAMONDS),
				Card.get(Rank.FOUR, Suit.HEARTS),
				Card.get(Rank.ACE, Suit.CLUBS),
				Card.get(Rank.TWO, Suit.HEARTS),
				Card.get(Rank.QUEEN, Suit.SPADES),
				Card.get(Rank.TWO, Suit.SPADES),
				Card.get(Rank.QUEEN, Suit.CLUBS),
				Card.get(Rank.TWO, Suit.CLUBS),
				Card.get(Rank.JACK, Suit.HEARTS),
				Card.get(Rank.NINE, Suit.DIAMONDS),
				Card.get(Rank.ACE, Suit.DIAMONDS),
				Card.get(Rank.QUEEN, Suit.DIAMONDS),
				Card.get(Rank.SEVEN, Suit.DIAMONDS),
				Card.get(Rank.SIX, Suit.DIAMONDS),
				Card.get(Rank.SIX, Suit.CLUBS),
				Card.get(Rank.EIGHT, Suit.SPADES),
				Card.get(Rank.KING, Suit.SPADES),
				Card.get(Rank.THREE, Suit.SPADES),
				Card.get(Rank.JACK, Suit.DIAMONDS),
				Card.get(Rank.THREE, Suit.HEARTS),
				Card.get(Rank.NINE, Suit.CLUBS),
				Card.get(Rank.FOUR, Suit.SPADES),
				Card.get(Rank.SEVEN, Suit.SPADES),
				Card.get(Rank.ACE, Suit.SPADES),
				Card.get(Rank.TEN, Suit.DIAMONDS),
				Card.get(Rank.NINE, Suit.SPADES),
				Card.get(Rank.FIVE, Suit.CLUBS),
				Card.get(Rank.SEVEN, Suit.CLUBS),
				Card.get(Rank.TEN, Suit.SPADES)));
    }

    private static List<Card> configurationTwo() {
        return new ArrayList<>(List.of(
                Card.get(Rank.SEVEN, Suit.HEARTS),
				Card.get(Rank.KING, Suit.DIAMONDS),
				Card.get(Rank.QUEEN, Suit.HEARTS),
				Card.get(Rank.TEN, Suit.DIAMONDS),
				Card.get(Rank.THREE, Suit.DIAMONDS),
				Card.get(Rank.SEVEN, Suit.CLUBS),
				Card.get(Rank.TEN, Suit.HEARTS),
				Card.get(Rank.QUEEN, Suit.DIAMONDS),
				Card.get(Rank.KING, Suit.SPADES),
				Card.get(Rank.NINE, Suit.DIAMONDS),
				Card.get(Rank.EIGHT, Suit.DIAMONDS),
				Card.get(Rank.SEVEN, Suit.SPADES),
				Card.get(Rank.QUEEN, Suit.SPADES),
				Card.get(Rank.JACK, Suit.HEARTS),
				Card.get(Rank.JACK, Suit.SPADES),
				Card.get(Rank.JACK, Suit.DIAMONDS),
				Card.get(Rank.NINE, Suit.HEARTS),
				Card.get(Rank.EIGHT, Suit.HEARTS),
				Card.get(Rank.FOUR, Suit.CLUBS),
				Card.get(Rank.FOUR, Suit.HEARTS),
				Card.get(Rank.ACE, Suit.SPADES),
				Card.get(Rank.TWO, Suit.DIAMONDS),
				Card.get(Rank.EIGHT, Suit.SPADES),
				Card.get(Rank.FIVE, Suit.HEARTS),
				Card.get(Rank.THREE, Suit.CLUBS),
				Card.get(Rank.SIX, Suit.SPADES),
				Card.get(Rank.SIX, Suit.CLUBS),
				Card.get(Rank.TWO, Suit.HEARTS),
				Card.get(Rank.JACK, Suit.CLUBS),
				Card.get(Rank.KING, Suit.HEARTS),
				Card.get(Rank.ACE, Suit.DIAMONDS),
				Card.get(Rank.TEN, Suit.SPADES),
				Card.get(Rank.QUEEN, Suit.CLUBS),
				Card.get(Rank.TWO, Suit.CLUBS),
				Card.get(Rank.ACE, Suit.CLUBS),
				Card.get(Rank.NINE, Suit.CLUBS),
				Card.get(Rank.SEVEN, Suit.DIAMONDS),
				Card.get(Rank.TWO, Suit.SPADES),
				Card.get(Rank.THREE, Suit.SPADES),
				Card.get(Rank.SIX, Suit.HEARTS),
				Card.get(Rank.FIVE, Suit.DIAMONDS),
				Card.get(Rank.FOUR, Suit.SPADES),
				Card.get(Rank.FIVE, Suit.CLUBS),
				Card.get(Rank.THREE, Suit.HEARTS),
				Card.get(Rank.FIVE, Suit.SPADES),
				Card.get(Rank.SIX, Suit.DIAMONDS),
				Card.get(Rank.EIGHT, Suit.CLUBS),
				Card.get(Rank.NINE, Suit.SPADES),
				Card.get(Rank.FOUR, Suit.DIAMONDS),
				Card.get(Rank.TEN, Suit.CLUBS),
				Card.get(Rank.KING, Suit.CLUBS),
				Card.get(Rank.ACE, Suit.HEARTS)));
    }

    private static List<Card> configurationThree() {
        return new ArrayList<>(List.of(
                Card.get(Rank.ACE, Suit.CLUBS),
				Card.get(Rank.TWO, Suit.HEARTS),
				Card.get(Rank.THREE, Suit.CLUBS),
				Card.get(Rank.TEN, Suit.SPADES),
				Card.get(Rank.SIX, Suit.CLUBS),
				Card.get(Rank.FIVE, Suit.CLUBS),
				Card.get(Rank.QUEEN, Suit.HEARTS),
				Card.get(Rank.JACK, Suit.CLUBS),
				Card.get(Rank.EIGHT, Suit.HEARTS),
				Card.get(Rank.FOUR, Suit.SPADES),
				Card.get(Rank.KING, Suit.DIAMONDS),
				Card.get(Rank.NINE, Suit.HEARTS),
				Card.get(Rank.QUEEN, Suit.CLUBS),
				Card.get(Rank.JACK, Suit.SPADES),
				Card.get(Rank.NINE, Suit.SPADES),
				Card.get(Rank.TEN, Suit.CLUBS),
				Card.get(Rank.JACK, Suit.HEARTS),
				Card.get(Rank.SEVEN, Suit.DIAMONDS),
				Card.get(Rank.NINE, Suit.DIAMONDS),
				Card.get(Rank.FOUR, Suit.DIAMONDS),
				Card.get(Rank.FOUR, Suit.CLUBS),
				Card.get(Rank.SEVEN, Suit.HEARTS),
				Card.get(Rank.SIX, Suit.DIAMONDS),
				Card.get(Rank.QUEEN, Suit.SPADES),
				Card.get(Rank.QUEEN, Suit.DIAMONDS),
				Card.get(Rank.FOUR, Suit.HEARTS),
				Card.get(Rank.THREE, Suit.HEARTS),
				Card.get(Rank.TWO, Suit.CLUBS),
				Card.get(Rank.EIGHT, Suit.SPADES),
				Card.get(Rank.TWO, Suit.SPADES),
				Card.get(Rank.SEVEN, Suit.CLUBS),
				Card.get(Rank.SEVEN, Suit.SPADES),
				Card.get(Rank.SIX, Suit.HEARTS),
				Card.get(Rank.ACE, Suit.DIAMONDS),
				Card.get(Rank.EIGHT, Suit.DIAMONDS),
				Card.get(Rank.ACE, Suit.SPADES),
				Card.get(Rank.TEN, Suit.HEARTS),
				Card.get(Rank.KING, Suit.CLUBS),
				Card.get(Rank.FIVE, Suit.HEARTS),
				Card.get(Rank.FIVE, Suit.SPADES),
				Card.get(Rank.KING, Suit.SPADES),
				Card.get(Rank.KING, Suit.HEARTS),
				Card.get(Rank.ACE, Suit.HEARTS),
				Card.get(Rank.THREE, Suit.DIAMONDS),
				Card.get(Rank.SIX, Suit.SPADES),
				Card.get(Rank.TEN, Suit.DIAMONDS),
				Card.get(Rank.EIGHT, Suit.CLUBS),
				Card.get(Rank.JACK, Suit.DIAMONDS),
				Card.get(Rank.TWO, Suit.DIAMONDS),
				Card.get(Rank.FIVE, Suit.DIAMONDS),
				Card.get(Rank.NINE, Suit.CLUBS),
				Card.get(Rank.THREE, Suit.SPADES)));
    }

    public void push(Card pCard) {
        assert pCard != null;
        aCards.push(pCard);
    }

    public Card draw() {
        assert !isEmpty();
        return aCards.pop();
    }

    public boolean isEmpty() {
        return aCards.isEmpty();
    }
}
