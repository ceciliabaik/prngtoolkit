package l1.prngtoolkit.distributions;

import java.util.Random;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UniformDistributionTest {
  private UniformDistribution<Double> doubleUniformDistribution;
  private UniformDistribution<Integer> intUniformDistribution;
  private Random random;

  @BeforeEach
  public void setUp() {
    random = new Random();
    doubleUniformDistribution = new UniformDistribution<>(random);
    intUniformDistribution = new UniformDistribution<>(random);
  }

  @Test
  public void testGetNextIntInEvenlyDivisibleRange() {
    int minValue = 1;
    int maxValue = 10;
    int randomInt = intUniformDistribution.getNextIntInEvenlyDivisibleRange(minValue, maxValue);
    assertTrue(randomInt >= minValue && randomInt <= maxValue);
    assertTrue(randomInt % 2 == 0); // Should be even.
  }

  @Test
  public void testGetNextDoubleInRangeRoundedDown() {
    double minValue = 1.0;
    double maxValue = 10.0;
    double randomDouble = doubleUniformDistribution.getNextDoubleInRangeRoundedDown(minValue, maxValue);
    assertTrue(randomDouble >= minValue && randomDouble <= maxValue);
    assertEquals(randomDouble, Math.floor(randomDouble), 0.0); // Should be rounded down.
  }
}
