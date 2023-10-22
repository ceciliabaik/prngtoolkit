package l1.prngtoolkit.generators;

import java.util.Random;

public class CoinFlipGenerator {
  private static final double MIN_PROBABILITY_OF_HEADS = 0.0;
  private static final double MAX_PROBABILITY_OF_HEADS = 1.0;
  private static final int DEFAULT_MAX_NUM_FLIPS = 200;
  private int maxNumOfFlips = DEFAULT_MAX_NUM_FLIPS;
  private final Random random;
  private int headsCount;
  private int tailsCount;

  public CoinFlipGenerator(Random random) {
    this.random = random;
    this.headsCount = 0;
    this.tailsCount = 0;
  }

  public int getMaxNumOfFlips() {
    return maxNumOfFlips;
  }

  public void setMaxNumOfFlips(int maxNumOfFlips) {
    if (maxNumOfFlips < 1) {
      throw new IllegalArgumentException("Maximum number of flips must be at least 1.");
    }
    this.maxNumOfFlips = maxNumOfFlips;
  }

  public int getHeadsCount() {
    return headsCount;
  }

  public int getTailsCount() {
    return tailsCount;
  }

  /**
   * Simulates a coin flip with equal probability (50%) of heads or tails.
   *
   * @return `true` for heads, `false` for tails.
   */
  public boolean simulateEqualProbabilityCoinFlip() {
    return random.nextBoolean();
  }

  /**
   * Simulates a coin flip with a bias based on the provided probability of heads.
   *
   * @param probabilityOfHeads The probability of getting heads (between 0.0 and 1.0, inclusive).
   * @return `true` for heads based on the provided probability, `false` for tails.
   */
  public boolean simulateHeadsProbabilityCoinFlip(double probabilityOfHeads) {
    if (probabilityOfHeads < MIN_PROBABILITY_OF_HEADS || probabilityOfHeads > MAX_PROBABILITY_OF_HEADS) {
      throw new IllegalArgumentException("Invalid probabilityOfHeads. It must be between " + MIN_PROBABILITY_OF_HEADS +
                                         " and " + MAX_PROBABILITY_OF_HEADS + "Received: " + probabilityOfHeads);
    }
    return random.nextDouble() < probabilityOfHeads;
  }

  public void simulateHeadsProbabilityAndUpdateStatistics(int numOfFlips, double probabilityOfHeads) {
    validateNumOfFlips(numOfFlips);
    resetCounters();

    int actualNumOfFlips = Math.min(numOfFlips, maxNumOfFlips);
    countHeadsFlips(actualNumOfFlips, probabilityOfHeads);
  }

  private void validateNumOfFlips(int numOfFlips) {
    if (numOfFlips < 0) {
      throw new IllegalArgumentException("Number of flips must be a non-negative integer. Received: " + numOfFlips);
    }
  }

  private void resetCounters() {
    headsCount = 0;
    tailsCount = 0;
  }

  /**
   * Counts the number of heads (true outcomes) in a series of coin flips with a specified probability of heads.
   *
   * @param actualNumOfFlips The number of coin flips to simulate.
   * @param probabilityOfHeads The probability of getting heads (between 0.0 and 1.0).
   */
  private void countHeadsFlips(int actualNumOfFlips, double probabilityOfHeads) {
    for (int i = 0; i < actualNumOfFlips; i++) {
      if (simulateHeadsProbabilityCoinFlip(probabilityOfHeads)) {
        headsCount++;
      }
    }
    tailsCount = actualNumOfFlips - headsCount;
  }
}
