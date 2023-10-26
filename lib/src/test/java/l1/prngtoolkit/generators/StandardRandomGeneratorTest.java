package l1.prngtoolkit.generators;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StandardRandomGeneratorTest {
  private StandardRandomGenerator<Integer> intGenerator;
  private StandardRandomGenerator<Double> doubleGenerator;

  @BeforeEach
  public void setUp() {
    intGenerator = new StandardRandomGenerator<>(Integer.class, null, null);
    doubleGenerator = new StandardRandomGenerator<>(Double.class, null, null);
  }

  @Test
  public void testGenerateNextInt() {
    int randomInt = intGenerator.getNextInt();
    assertTrue(randomInt >= Integer.MIN_VALUE && randomInt <= Integer.MAX_VALUE);
  }

  @Test
  public void testGenerateNextDouble() {
    double randomDouble = doubleGenerator.getNextDouble();
    assertTrue(randomDouble >= 0.0 && randomDouble <= 1.0);
  }

  @Test
  public void testGenerateNextIntInRange() {
    int minValue = 1;
    int maxValue = 10;
    int randomIntInRange = intGenerator.getNextIntInRange(minValue, maxValue);
    assertTrue(randomIntInRange >= minValue && randomIntInRange <= maxValue);
  }

  @Test
  public void testGenerateNextDoubleInRange() {
    double minValue = 1.0;
    double maxValue = 10.0;
    double randomDoubleInRange = doubleGenerator.getNextDoubleInRange(minValue, maxValue);
    assertTrue(randomDoubleInRange >= minValue && randomDoubleInRange <= maxValue);
  }

  @Test
  public void testGenerateNextIntSequence() {
    int count = 10;
    int[] intSequence = intGenerator.getNextIntSequence(count);
    assertEquals(count, intSequence.length);
  }

  @Test
  public void testGenerateNextDoubleSequence() {
    int count = 10;
    double[] doubleSequence = doubleGenerator.getNextDoubleSequence(count);
    assertEquals(count, doubleSequence.length);
  }
}
