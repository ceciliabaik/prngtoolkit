package l1.prngtoolkit.generators;

import org.apache.commons.math3.random.MersenneTwister;
import org.apache.commons.math3.random.RandomGenerator;

import l1.prngtoolkit.config.Configuration;

public class MersenneTwisterGenerator<T> extends PseudoRandomNumberGenerator<T> {
  private final RandomGenerator randomGenerator;

  public MersenneTwisterGenerator() {
    this((Class<T>) null);
  }

  public MersenneTwisterGenerator(Class<T> dataType) {
    super(dataType);
    this.randomGenerator = new MersenneTwister(System.currentTimeMillis());
  }

  public MersenneTwisterGenerator(Class<T> dataType, long seed) {
    super(dataType, seed);
    this.randomGenerator = new MersenneTwister(seed);
  }

  public MersenneTwisterGenerator(Class<T> dataType, Configuration<T> config) {
    super(dataType, config);
    this.randomGenerator = new MersenneTwister(config.getSeed());
  }

  @Override
  protected T generateNextValue() {
    if (dataType == Integer.class) {
      return dataType.cast(randomGenerator.nextInt());
    } else if (dataType == Double.class) {
      return dataType.cast(randomGenerator.nextDouble());
    }
    throw new UnsupportedOperationException(UNSUPPORTED_TYPE_MESSAGE + dataType.getSimpleName());
  }
}
