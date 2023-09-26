package l1.rngtoolkit.generators;

import l1.rngtoolkit.configs.GeneratorConfig;
import l1.rngtoolkit.models.Range;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class IntegerGeneratorTest {

  @Test
  public void testGenerateRandomIntegerInRange() {
    GeneratorConfig config = new GeneratorConfig();
    config.setSeed(1454589L);
    IntegerGenerator generator = new IntegerGenerator(config);
    Range<Integer> range = new Range<>(1, 10);
    int randomInteger = generator.generateRandomIntegerInRange(range);
    assertTrue(randomInteger >= 1 && randomInteger <= 10, "Generated integer is within the specified range.");
  }
}
