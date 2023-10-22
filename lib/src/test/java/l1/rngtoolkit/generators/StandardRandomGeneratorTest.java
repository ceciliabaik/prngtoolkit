package l1.rngtoolkit.generators;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import l1.prngtoolkit.generators.StandardRandomGenerator;

public class StandardRandomGeneratorTest {
  private StandardRandomGenerator<Integer> intGenerator;
  private StandardRandomGenerator<Double> doubleGenerator;

  @BeforeEach
  public void setup() {
    intGenerator = new StandardRandomGenerator<>(Integer.class);
    doubleGenerator = new StandardRandomGenerator<>(Double.class);
  }

  @Test
  public void testNextInt() {
    Integer value = intGenerator.nextInt();
    assertNotNull(value);
    assertTrue(value instanceof Integer);
  }

  @Test
  public void testNextDouble() {
    Double value = doubleGenerator.nextDouble();
    assertNotNull(value);
    assertTrue(value instanceof Double);
  }

  @Test
  public void testNextIntInRange() {
    int minValue = 1;
    int maxValue = 10;
    int value = intGenerator.nextIntInRange(minValue, maxValue);
    assertTrue(value >= minValue && value <= maxValue);
  }

  @Test
  public void testNextDoubleInRange() {
    double minValue = 1.0;
    double maxValue = 10.0;
    Double value = doubleGenerator.nextDoubleInRange(minValue, maxValue);
    assertTrue(value >= minValue && value <= maxValue);
  }

  @Test
  public void testIntSequence() {
    int count = 10;
    int[] sequence = intGenerator.nextIntSequence(count);
    assertEquals(count, sequence.length);
    for (Integer value : sequence) {
        assertTrue(value instanceof Integer);
    }
  }

  @Test
  public void testDoubleSequence() {
    int count = 10;
    double[] sequence = doubleGenerator.nextDoubleSequence(count);
    assertEquals(count, sequence.length);
    for (Double value : sequence) {
        assertTrue(value instanceof Double);
    }
  }
}
