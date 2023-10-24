package l1.prngtoolkit.generators;

import java.util.Random;

import l1.prngtoolkit.validators.CoinFlipValidator;

public class CoinFlipGenerator {
  private static final int DEFAULT_MAX_NUM_FLIPS = 200;
  private static final double EQUAL_PROBABILITY_THRESHOLD = 0.5;

  private int maxNumOfFlips = DEFAULT_MAX_NUM_FLIPS;
  private final CoinFlipValidator coinFlipValidator;
  private final Random random;
  private int headsCount;
  private int tailsCount;

  public CoinFlipGenerator(Random random) {
    this.coinFlipValidator = new CoinFlipValidator();
    this.random = random;
    this.headsCount = 0;
    this.tailsCount = 0;
  }

  public int getMaxNumOfFlips() {
    return maxNumOfFlips;
  }

  public void setMaxNumOfFlips(int maxNumOfFlips) {
    coinFlipValidator.validateMaxNumOfFlips(maxNumOfFlips);
    this.maxNumOfFlips = maxNumOfFlips;
  }

  public int getHeadsCount() {
    return headsCount;
  }

  public int getTailsCount() {
    return tailsCount;
  }

  /**
   * Simulates a coin flip with equal probability of heads or tails (50% each).
   *
   * @return `true` for heads, `false` for tails.
   */
  public boolean simulateEqualProbabilityCoinFlip() {
    return random.nextDouble() < EQUAL_PROBABILITY_THRESHOLD;
  }

  /**
   * Simulates a coin flip with a preference based on the provided probability of heads.
   *
   * @param probabilityOfHeads The probability of getting heads (between 0.0 and 1.0, inclusive).
   * @return `true` for heads based on the provided probability, `false` for tails.
   */
  public boolean simulateHeadsProbabilityCoinFlip(double probabilityOfHeads) {
    coinFlipValidator.validateProbabilityOfHeads(probabilityOfHeads);
    return random.nextDouble() < probabilityOfHeads;
  }

  /**
   * Simulates a series of coin flips with a specified probability of heads and updates statistics.
   *
   * @param numOfFlips The number of coin flips to simulate.
   * @param probabilityOfHeads The probability of getting heads (between 0.0 and 1.0).
   */
  public void simulateCoinFlipsAndUpdateStatsWithProbability(int numOfFlips, double probabilityOfHeads) {
    coinFlipValidator.validateNumOfFlips(numOfFlips);
    resetCounters();

    int actualNumOfFlips = Math.min(numOfFlips, maxNumOfFlips);
    countHeadsFlips(actualNumOfFlips, probabilityOfHeads);
  }

  private void resetCounters() {
    headsCount = 0;
    tailsCount = 0;
  }

  /**
   * Counts the number of heads (true outcomes) in a series of coin flips with a specified probability of heads.
   *
   * @param actualNumOfFlips The actual number of coin flips to simulate.
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
