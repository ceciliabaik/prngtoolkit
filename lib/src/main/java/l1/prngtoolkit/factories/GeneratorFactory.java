package l1.prngtoolkit.factories;

import java.util.List;
import java.util.Random;

import l1.prngtoolkit.config.Configuration;
import l1.prngtoolkit.generators.*;

public class GeneratorFactory {

  public <T extends Comparable<T>> StandardRandomGenerator<T> createStandardRandomGenerator(
    Class<T> dataType, Long seed, Configuration<T> config) {
    return new StandardRandomGenerator<>(dataType, seed, config);
  }

  public <T extends Comparable<T>> MersenneTwisterGenerator<T> createMersenneTwisterGenerator(
    Class<T> dataType, Long seed, Configuration<T> config) {
    return new MersenneTwisterGenerator<>(dataType, seed, config);
  }

  public CoinFlipGenerator createCoinFlipGenerator(Random random) {
    return new CoinFlipGenerator(random);
  }

  public <T> DeckShuffleGenerator<T> createDeckShuffleGenerator(Random random, List<T> deck) {
    return new DeckShuffleGenerator<>(random, deck);
  }

  public DiceRollGenerator createDiceRollGenerator(Random random) {
    return new DiceRollGenerator(random);
  }

  public DiceRollGenerator createDiceRollGeneratorWithCustomSides(Random random, int numOfSides) {
    return new DiceRollGenerator(random, numOfSides);
  }
}
