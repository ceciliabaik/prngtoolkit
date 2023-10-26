package l1.prngtoolkit.generators;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class DeckShuffleGeneratorTest {
  private DeckShuffleGenerator<String> generator;

  @BeforeEach
  public void setUp() {
    List<String> deck = new ArrayList<>(Arrays.asList("Card1", "Card2", "Card3", "Card4"));
    Random random = new Random(12345L); // Seed for consistent shuffling
    generator = new DeckShuffleGenerator<>(random, deck);
  }

  @Test
  public void testShuffleDeck() {
    List<String> originalDeck = new ArrayList<>(generator.getShuffledDeck());
    List<String> shuffledDeck = generator.shuffleDeck();

    // Verify that the shuffled deck is not equal to the original deck.
    assertNotEquals(originalDeck, shuffledDeck);

    // Verify that the shuffled deck has the same elements as the original deck.
    assertTrue(originalDeck.containsAll(shuffledDeck) && shuffledDeck.containsAll(originalDeck));
  }

  @Test
  public void testGetShuffledDeck() {
    List<String> shuffledDeck = generator.shuffleDeck();
    assertEquals(shuffledDeck, generator.getShuffledDeck());
  }

  @Test
  public void testResetDeck() {
    List<String> originalDeck = new ArrayList<>(generator.getShuffledDeck());
    generator.shuffleDeck();
    generator.resetDeck();
    assertEquals(originalDeck, generator.getShuffledDeck());
  }

  @Test
  public void testInvalidDeck() {
    // Attempt to create a generator with an empty deck.
    List<String> deck = new ArrayList<>();
    Random random = new Random();
    assertThrows(IllegalArgumentException.class, () -> new DeckShuffleGenerator<>(random, deck));
  }
}
