package l1.prngtoolkit.factories;

import java.util.List;
import java.util.Random;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import l1.prngtoolkit.generators.StandardRandomGenerator;
import l1.prngtoolkit.generators.MersenneTwisterGenerator;
import l1.prngtoolkit.generators.CoinFlipGenerator;
import l1.prngtoolkit.generators.DeckShuffleGenerator;
import l1.prngtoolkit.generators.DiceRollGenerator;

public class GeneratorFactoryTest {
  private GeneratorFactory generatorFactory;
  private Random random;

  @BeforeEach
  public void setUp() {
    generatorFactory = new GeneratorFactory();
    random = new Random();
  }

  @Test
  public void testCreateStandardRandomGenerator() {
    StandardRandomGenerator<Integer> intGenerator = generatorFactory.createStandardRandomGenerator(Integer.class, null, null);
    assertNotNull(intGenerator);

    StandardRandomGenerator<Double> doubleGenerator = generatorFactory.createStandardRandomGenerator(Double.class, null, null);
    assertNotNull(doubleGenerator);
  }

  @Test
  public void testCreateMersenneTwisterGenerator() {
    MersenneTwisterGenerator<Integer> intGenerator = generatorFactory.createMersenneTwisterGenerator(Integer.class, null, null);
    assertNotNull(intGenerator);

    MersenneTwisterGenerator<Double> doubleGenerator = generatorFactory.createMersenneTwisterGenerator(Double.class, null, null);
    assertNotNull(doubleGenerator);
  }

  @Test
  public void testCreateCoinFlipGenerator() {
    CoinFlipGenerator coinFlipGenerator = generatorFactory.createCoinFlipGenerator(random);
    assertNotNull(coinFlipGenerator);
  }

  @Test
  public void testCreateDeckShuffleGenerator() {
    List<Integer> deck = List.of(1, 2, 3, 4, 5);
    DeckShuffleGenerator<Integer> deckShuffleGenerator = generatorFactory.createDeckShuffleGenerator(random, deck);
    assertNotNull(deckShuffleGenerator);
  }

  @Test
  public void testCreateDiceRollGenerator() {
    DiceRollGenerator diceRollGenerator = generatorFactory.createDiceRollGenerator(random);
    assertNotNull(diceRollGenerator);
  }

  @Test
  public void testCreateDiceRollGeneratorWithCustomSides() {
    int numOfSides = 6;
    DiceRollGenerator diceRollGenerator = generatorFactory.createDiceRollGeneratorWithCustomSides(random, numOfSides);
    assertNotNull(diceRollGenerator);
  }
}
