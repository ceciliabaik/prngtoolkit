package l1.prngtoolkit.generators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class DeckShuffleGenerator<T> {
  private final Random random;
  private final List<T> originalDeck;
  private List<T> currentDeck;

  public DeckShuffleGenerator(Random random, List<T> deck) {
    if (deck == null || deck.isEmpty()) {
      throw new IllegalArgumentException("Deck must not be null or empty.");
    }
    this.random = random;
    this.originalDeck = new ArrayList<>(deck);
    this.currentDeck = new ArrayList<>(deck);
    }

  public List<T> shuffleDeck() {
    Collections.shuffle(currentDeck, random);
    return currentDeck;
  }

  public List<T> getShuffledDeck() {
    return currentDeck;
  }

  public void resetDeck() {
    currentDeck = new ArrayList<>(originalDeck);
  }
}
