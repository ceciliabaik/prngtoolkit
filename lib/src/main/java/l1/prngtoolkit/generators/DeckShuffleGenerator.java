package l1.prngtoolkit.generators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class DeckShuffleGenerator<T> {
  private final Random random;
  private List<T> deck;

  public DeckShuffleGenerator(Random random, List<T> newDeck) {
    if (newDeck == null || newDeck.isEmpty()) {
      throw new IllegalArgumentException("Deck must not be null or empty.");
    }
    this.random = random;
    this.deck = new ArrayList<>(newDeck);
  }

  public List<T> shuffleDeck() {
    Collections.shuffle(deck, random);
    return deck;
  }

  public List<T> getShuffledDeck() {
    return deck;
  }

  public void resetDeck() {
    deck = new ArrayList<>(deck);
  }
}
