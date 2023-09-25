package l1.rngtoolkit.generators;

import java.util.Random;

import l1.rngtoolkit.configs.ConfigBase;
import l1.rngtoolkit.configs.GeneratorConfig;
import l1.rngtoolkit.interfaces.RandomIntegerGenerator;
import l1.rngtoolkit.models.Range;

public class IntegerGenerator extends ConfigBase<Integer> implements RandomIntegerGenerator {
  private final Random random;
  private GeneratorConfig config;

  public IntegerGenerator() {
    this.random = new Random(config.getSeed());
  }

  public IntegerGenerator(GeneratorConfig config) {
    this.config = config;
    this.random = new Random(config.getSeed());
  }

  @Override
  public synchronized int generateRandomIntegerInRange(Range<Integer> range) {
    int minValue = range.getMinValue();
    int maxValue = range.getMaxValue();

    exceptionValidator.validateRange(minValue, maxValue);

    int rangeSize =  maxValue - minValue + 1;
    return random.nextInt(rangeSize) + minValue;
  }

  @Override
  public synchronized int[] generateRandomIntegersInRangeAndCount(Range<Integer> range, int count) {
    exceptionValidator.validateRange(range.getMinValue(), range.getMaxValue());
    exceptionValidator.validateCount(count);

    int[] randomIntegers = new int[count];
    for (int i = 0; i < count; i++) {
      randomIntegers[i] = generateRandomIntegerInRange(range);
    }
    return randomIntegers;
  }
}
