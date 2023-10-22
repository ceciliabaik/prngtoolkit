package l1.prngtoolkit.generators;

import java.util.Random;

public class CoinFlipGenerator {
  private static final int MAX_NUM_OF_FLIPS = 200;
  private final Random random;
  private int headsCount;
  private int tailsCount;

  public CoinFlipGenerator(Random random) {
    this.random = random;
  }

  /**
   * Simulates a coin flip with a 50-50 chance of heads or tails.
   */
  public boolean flipUnbiasedCoin() {
    return random.nextBoolean();
  }

  /**
   * Simulates a coin flip with a bias based on the provided probability of heads.
   */
  public boolean flipCoinWithBias(double probabilityOfHeads) {
    validateProbability(probabilityOfHeads);
    return random.nextDouble() < probabilityOfHeads;
  }

  /**
   * Simulates a series of coin flips with a bias based on the provided number of flips.
   */
  public void flipCoinsWithStatistics(int numOfFlips) {
    validateNumOfFlips(numOfFlips);
    resetCounters();

    int actualNumOfFlips = Math.min(numOfFlips, MAX_NUM_OF_FLIPS);
    simulateCoinFlips(actualNumOfFlips);
  }

  public int getHeadsCount() {
    return headsCount;
  }

  public int getTailsCount() {
    return tailsCount;
  }

  private void simulateCoinFlips(int actualNumOfFlips) {
    for (int i = 0; i < actualNumOfFlips; i++) {
      if (flipUnbiasedCoin()) {
        headsCount++;
      } else {
        tailsCount++;
      }
    }
  }

  private void resetCounters() {
    headsCount = 0;
    tailsCount = 0;
  }

  private void validateProbability(double probability) {
    if (probability < 0.0 || probability > 1.0) {
      throw new IllegalArgumentException("Probability of heads must be between 0.0 and 1.0");
    }
  }

  private void validateNumOfFlips(int numOfFlips) {
    if (numOfFlips < 0) {
      throw new IllegalArgumentException("Number of flips cannot be negative.");
    }
  }
}
