import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    /**
     * Represents the deck as a list of Card objects
     */
    private final ArrayList<Card> deck;

    /**
     * Constructor for the Deck class -- create an ArrayList of 52 Cards
     */
    public Deck() {
        this.deck = new ArrayList<>();

        for (Suit s : Suit.values()) {
            for (Rank r : Rank.values()) {
                deck.add(new Card(s, r));
            }
        }
    }

    /**
     * Deal a card from this Deck
     * @return the first Card in this Deck
     */
    public Card deal() {
        return this.deck.remove(0);

    }

    /**
     * Randomly permute the Cards in this Deck
     */
    public void shuffle() {
        Collections.shuffle(this.deck);
    }

    /**
     * Return a String representation of this Dec
     * @return a String listing all Cards in the Deck
     */
    @Override
    public String toString() {
        return this.deck.toString();
    }
}
