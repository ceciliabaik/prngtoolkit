package l1.rngtoolkit.generators;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import l1.rngtoolkit.configs.GeneratorConfig;
import l1.rngtoolkit.models.Range;

public class LongGeneratorTest {

  @Test
  public void testGenerateRandomLongInRange() {
    GeneratorConfig config = new GeneratorConfig();
    config.setSeed(12345L);
    LongGenerator generator = new LongGenerator(config);
    Range<Long> range = new Range<>(1L, 10L);
    long randomLong = generator.generateRandomLongInRange(range);
    assertTrue(randomLong >= 1L && randomLong <= 10L, "Generated long is within the specified range.");
  }
}
