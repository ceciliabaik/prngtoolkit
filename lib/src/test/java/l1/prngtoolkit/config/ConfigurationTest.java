package l1.prngtoolkit.config;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ConfigurationTest {
  private Configuration<Double> doubleConfig;
  private Configuration<Integer> intConfig;

  @BeforeEach
  public void setUp() {
    doubleConfig = new Configuration<>();
    intConfig = new Configuration<>();
  }

  @Test
  public void testDefaultSeed() {
    Long seed = doubleConfig.getSeed();
    assertNotNull(seed);
  }

  @Test
  public void testSetSeed() {
    Long newSeed = 12345L;
    intConfig.setSeed(newSeed);
    assertEquals(newSeed, intConfig.getSeed());
  }

  @Test
  public void testSetMinValue() {
    Double minValue = 0.0;
    doubleConfig.setMinValue(minValue);
    assertEquals(minValue, doubleConfig.getMinValue());
   }

  @Test
  public void testSetMaxValue() {
    int maxValue = 100;
    intConfig.setMaxValue(maxValue);
    assertEquals(maxValue, intConfig.getMaxValue());
  }

  @Test
  public void testThreadSafety() {
    intConfig.setUseThreadSafety(true);
    assertTrue(intConfig.isUseThreadSafety());
  }
}
