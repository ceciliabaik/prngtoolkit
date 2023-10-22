package l1.rngtoolkit.generators;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;


import l1.prngtoolkit.generators.DeckShuffleGenerator;

public class DeckShuffleGeneratorTest {
    private DeckShuffleGenerator<String> deckShuffleGenerator;
    private List<String> originalDeck;

    @BeforeEach
    public void setUp() {
        Random random = new Random();
        originalDeck = new ArrayList<>();
        originalDeck.add("Card 1");
        originalDeck.add("Card 2");
        originalDeck.add("Card 3");
        deckShuffleGenerator = new DeckShuffleGenerator<>(random, originalDeck);
    }

    @Test
    public void testShuffleDeck() {
        List<String> shuffledDeck1 = deckShuffleGenerator.shuffleDeck();
        List<String> shuffledDeck2 = deckShuffleGenerator.shuffleDeck();

        // The shuffled decks should not be the same.
        assertNotEquals(originalDeck, shuffledDeck1);
        assertNotEquals(originalDeck, shuffledDeck2);

        // The order of cards in the shuffled decks can be different, so we're only checking the size.
        assertEquals(originalDeck.size(), shuffledDeck1.size());
        assertEquals(originalDeck.size(), shuffledDeck2.size());
    }

    @Test
    public void testGetShuffledDeck() {
        List<String> shuffledDeck = deckShuffleGenerator.shuffleDeck();
        List<String> retrievedShuffledDeck = deckShuffleGenerator.getShuffledDeck();

        // The retrieved shuffled deck should be the same as the previously shuffled one.
        assertEquals(shuffledDeck, retrievedShuffledDeck);
    }

    @Test
    public void testResetDeck() {
        List<String> shuffledDeck1 = deckShuffleGenerator.shuffleDeck();

        deckShuffleGenerator.resetDeck();
        List<String> resetDeck = deckShuffleGenerator.getShuffledDeck();

        // After resetting the deck, it should be the same as the original deck.
        assertEquals(originalDeck, resetDeck);

        // The shuffled deck should be different from the reset deck.
        assertNotEquals(shuffledDeck1, resetDeck);
    }
}
