package l1.prngtoolkit.examples;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import l1.prngtoolkit.generators.DeckShuffleGenerator;

public class DeckShuffleGeneratorExample {

  public void displayDeck(List<String> deck) {
    for (String card : deck) {
      System.out.println(card);
    }
  }

  public static void main(String[] args) {
    // Create an instance of the DeckShuffleGeneratorExample class to use its method displayDeck().
    DeckShuffleGeneratorExample example = new DeckShuffleGeneratorExample();

    // Create a list of cards as an example deck.
    List<String> deck = new ArrayList<>();
    deck.add("Ace of Spades");
    deck.add("King of Hearts");
    deck.add("Queen of Diamonds");
    deck.add("Jack of Clubs");
    deck.add("10 of Spades");

    // Create a DeckShuffleGenerator with a random seed.
    Random random = new Random();
    DeckShuffleGenerator<String> shuffleGenerator = new DeckShuffleGenerator<>(random, deck);

    // Shuffle the deck and display it.
    System.out.println("Shuffled Deck:");
    List<String> shuffledDeck = shuffleGenerator.shuffleDeck();
    example.displayDeck(shuffledDeck);

    // Reset the deck and display the original order.
    shuffleGenerator.resetDeck();
    System.out.println("\nOriginal Deck:");
    example.displayDeck(shuffleGenerator.getShuffledDeck());
  }
}
