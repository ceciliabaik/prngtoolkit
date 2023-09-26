package l1.rngtoolkit.generators;

import java.util.Random;

import l1.rngtoolkit.configs.ConfigBase;
import l1.rngtoolkit.configs.GeneratorConfig;
import l1.rngtoolkit.interfaces.RandomFloatGenerator;
import l1.rngtoolkit.models.Range;

public class FloatGenerator extends ConfigBase<Float> implements RandomFloatGenerator {
  private final Random random;

  public FloatGenerator() {
    this.random = new Random();
  }

  public FloatGenerator(long seed) {
    this.random = new Random(seed);
  }

  public FloatGenerator(GeneratorConfig config) {
    this.random = new Random(config.getSeed());
  }

  @Override
  public synchronized float generateRandomFloatInRange(Range<Float> range) {
    float minValue = range.getMinValue();
    float maxValue = range.getMaxValue();

    exceptionValidator.validateRange(minValue, maxValue);

    float rangeSize =  maxValue - minValue;
    return random.nextFloat() * rangeSize + minValue;
  }

  @Override
  public synchronized float[] generateRandomFloatsInRangeAndCount(Range<Float> range, int count) {
    exceptionValidator.validateRange(range.getMinValue(), range.getMaxValue());
    exceptionValidator.validateCount(count);

    float[] randomFloats = new float[count];
    for (int i = 0; i < count; i++) {
      randomFloats[i] = generateRandomFloatInRange(range);
    }
    return randomFloats;
  }
}
