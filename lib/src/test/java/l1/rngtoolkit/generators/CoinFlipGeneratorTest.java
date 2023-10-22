package l1.rngtoolkit.generators;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertTrue;

import l1.prngtoolkit.generators.CoinFlipGenerator;

public class CoinFlipGeneratorTest {
  private CoinFlipGenerator coinFlipGenerator;
  private Random random;

  @BeforeEach
  public void setUp() {
    random = new Random();
    coinFlipGenerator = new CoinFlipGenerator(random);
  }

  @Test
  public void testFlipUnbiasedCoin() {
    int numFlips = 1000;
    int headsCount = 0;
    int tailsCount = 0;

    for (int i = 0; i < numFlips; i++) {
      boolean result = coinFlipGenerator.flipUnbiasedCoin();
      if (result) {
        headsCount++;
      } else {
        tailsCount++;
      }
    }

        // Check if the number of heads and tails is roughly equal, allowing for a margin of error.
        int marginOfError = numFlips / 10; // 10% margin of error
        assertTrue(Math.abs(headsCount - tailsCount) <= marginOfError);
    }

    @Test
    public void testFlipCoinWithBias() {
        double probabilityOfHeads = 0.7; // 70% probability of heads
        int numFlips = 1000;
        int headsCount = 0;

        for (int i = 0; i < numFlips; i++) {
            boolean result = coinFlipGenerator.flipCoinWithBias(probabilityOfHeads);
            if (result) {
                headsCount++;
            }
        }

        // Check if the number of heads aligns with the expected bias.
        int expectedHeadsCount = (int) (numFlips * probabilityOfHeads);
        int marginOfError = numFlips / 10; // 10% margin of error
        assertTrue(Math.abs(headsCount - expectedHeadsCount) <= marginOfError);
    }
}
