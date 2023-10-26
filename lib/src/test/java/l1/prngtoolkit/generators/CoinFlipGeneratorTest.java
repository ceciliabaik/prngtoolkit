package l1.prngtoolkit.generators;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Random;

public class CoinFlipGeneratorTest {
  private CoinFlipGenerator generator;

  @BeforeEach
  public void setUp() {
    Random random = new Random();
    generator = new CoinFlipGenerator(random);
  }

  @Test
  public void testEqualProbabilityCoinFlip() {
    boolean result = generator.simulateEqualProbabilityCoinFlip();
    assertNotNull(result);
  }

  @Test
  public void testHeadsProbabilityCoinFlip() {
    double probabilityOfHeads = 0.7;
    boolean result = generator.simulateHeadsProbabilityCoinFlip(probabilityOfHeads);
    assertNotNull(result);
  }

  @Test
  public void testSimulateHeadsAndUpdateStats() {
    double probabilityOfHeads = 0.6;
    int numOfFlips = 1000;
    generator.simulateCoinFlipsAndUpdateStatsWithProbability(numOfFlips, probabilityOfHeads);

    assertTrue(generator.getHeadsCount() >= 0);
    assertTrue(generator.getTailsCount() >= 0);
    assertEquals(generator.getHeadsCount() + generator.getTailsCount(), Math.min(numOfFlips, generator.getMaxNumOfFlips()));
  }

  @Test
  public void testSetMaxNumOfFlips() {
    int newMaxNumOfFlips = 500;
    generator.setMaxNumOfFlips(newMaxNumOfFlips);
    assertEquals(newMaxNumOfFlips, generator.getMaxNumOfFlips());
  }

  @Test
  public void testInvalidProbabilityOfHeads() {
    double negativeInvalidProbability = -0.1;
    assertThrows(IllegalArgumentException.class, () -> generator.simulateHeadsProbabilityCoinFlip(negativeInvalidProbability));
  }

  @Test
  public void testInvalidNumOfFlips() {
    double probabilityOfHeads = 0.5;
    assertThrows(IllegalArgumentException.class, () -> generator.simulateCoinFlipsAndUpdateStatsWithProbability(-1, probabilityOfHeads));
  }
}
