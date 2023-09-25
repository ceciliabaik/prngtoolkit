package l1.rngtoolkit.generators;

import java.util.Random;

import l1.rngtoolkit.configs.ConfigBase;
import l1.rngtoolkit.configs.GeneratorConfig;
import l1.rngtoolkit.interfaces.RandomByteGenerator;
import l1.rngtoolkit.models.Range;

public class ByteGenerator extends ConfigBase<Byte> implements RandomByteGenerator {
  private final Random random;
  private GeneratorConfig config;

  public ByteGenerator() {
    this.random = new Random(config.getSeed());
  }

  public ByteGenerator(GeneratorConfig config) {
    this.config = config;
    this.random = new Random(config.getSeed());
  }

  @Override
  public synchronized byte generateRandomByteInRange(Range<Byte> range) {
    byte minValue = range.getMinValue();
    byte maxValue = range.getMaxValue();

    exceptionValidator.validateRange(minValue, maxValue);

    int rangeSize =  maxValue - minValue + 1;
    return (byte) (random.nextInt(rangeSize) + minValue);
  }

  @Override
  public synchronized byte[] generateRandomBytesInRangeAndCount(Range<Byte> range, int count) {
    exceptionValidator.validateRange(range.getMinValue(), range.getMaxValue());
    exceptionValidator.validateCount(count);

    byte[] randomBytes = new byte[count];
    for (int i = 0; i < count; i++) {
      randomBytes[i] = generateRandomByteInRange(range);
    }
    return randomBytes;
  }
}
