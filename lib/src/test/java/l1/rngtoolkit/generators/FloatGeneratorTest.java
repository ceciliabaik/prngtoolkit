package l1.rngtoolkit.generators;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import l1.rngtoolkit.configs.GeneratorConfig;
import l1.rngtoolkit.models.Range;

public class FloatGeneratorTest {

  @Test
  public void testGenerateRandomIntegerInRange() {
    GeneratorConfig config = new GeneratorConfig();
    config.setSeed(45346L);
    FloatGenerator generator = new FloatGenerator(config);
    Range<Float> range = new Range<>(1.54f, 10.33f);
    float randomFloat = generator.generateRandomFloatInRange(range);
    assertTrue(randomFloat >= 1.54f && randomFloat <= 10.33f, "Generated float is within the specified range.");
  }
}
