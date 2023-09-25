package l1.rngtoolkit.generators;

import java.util.Random;

import l1.rngtoolkit.configs.ConfigBase;
import l1.rngtoolkit.configs.GeneratorConfig;
import l1.rngtoolkit.interfaces.RandomLongGenerator;
import l1.rngtoolkit.models.Range;

public class LongGenerator extends ConfigBase<Long> implements RandomLongGenerator {
  private final Random random;
  private GeneratorConfig config;

  public LongGenerator() {
    this.random = new Random(config.getSeed());
  }

  public LongGenerator(GeneratorConfig config) {
    this.config = config;
    this.random = new Random(config.getSeed());
  }

  @Override
  public synchronized long generateRandomLongInRange(Range<Long> range) {
    long minValue = range.getMinValue();
    long maxValue = range.getMaxValue();

    exceptionValidator.validateRange(minValue, maxValue);

    long rangeSize = maxValue - minValue + 1;
    return (long) (random.nextDouble() * rangeSize) + minValue;
  }

  @Override
  public synchronized long[] generateRandomLongsInRangeAndCount(Range<Long> range, int count) {
    exceptionValidator.validateRange(range.getMinValue(), range.getMaxValue());
    exceptionValidator.validateCount(count);

    long[] randomLongs = new long[count];
    for (int i = 0; i < count; i++) {
      randomLongs[i] = generateRandomLongInRange(range);
    }
    return randomLongs;
  }
}
