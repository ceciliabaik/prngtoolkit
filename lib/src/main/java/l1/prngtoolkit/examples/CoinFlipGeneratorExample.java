package l1.prngtoolkit.examples;

import java.util.Random;

import l1.prngtoolkit.factories.GeneratorFactory;
import l1.prngtoolkit.generators.CoinFlipGenerator;

public class CoinFlipGeneratorExample {

  public static void main(String[] args) {
    // Create a random number generator.
    Random random = new Random();

    // Create a GeneratorFactory to create a CoinFlipGenerator.
    GeneratorFactory generatorFactory = new GeneratorFactory();

    // Create a CoinFlipGenerator using the factory.
    CoinFlipGenerator coinFlipGenerator = generatorFactory.createCoinFlipGenerator(random);

    // Simulate an equal probability coin flip (50% heads, 50% tails).
    boolean flipResult = coinFlipGenerator.simulateEqualProbabilityCoinFlip();
    System.out.println("Result of Equal Probability Coin Flip: " + (flipResult ? "Heads" : "Tails"));

    // Simulate coin flips with a specified probability of heads.

    // Set the maximum number of coin flips.
    int maxNumOfFlips = 100;
    coinFlipGenerator.setMaxNumOfFlips(maxNumOfFlips);

    int numOfFlips = 20;
    double probabilityOfHeads = 0.5;
    coinFlipGenerator.simulateCoinFlipsAndUpdateStatsWithProbability(numOfFlips, probabilityOfHeads);

    // Get the counts of heads and tails.
    int headsCount = coinFlipGenerator.getHeadsCount();
    int tailsCount = coinFlipGenerator.getTailsCount();

    // Display the results.
    System.out.println("Coin Flip Results (Equal Probability):");
    System.out.println("Number of Flips: " + numOfFlips);
    System.out.println("Heads Count: " + headsCount);
    System.out.println("Tails Count: " + tailsCount);
  }
}
