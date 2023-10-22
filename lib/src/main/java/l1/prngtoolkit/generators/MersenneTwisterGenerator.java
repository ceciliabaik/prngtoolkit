package l1.prngtoolkit.generators;

import org.apache.commons.math3.random.MersenneTwister;
import org.apache.commons.math3.random.RandomGenerator;

import l1.prngtoolkit.config.Configuration;

public class MersenneTwisterGenerator<T> extends PseudoRandomNumberGenerator<T> {
  private final RandomGenerator randomGenerator;

  public MersenneTwisterGenerator(Class<T> dataType, Long seed, Configuration<T> config) {
    super(dataType, seed, config);
    this.randomGenerator = new MersenneTwister(seed != null ? seed : config.getSeed());
  }

  @Override
  protected T generateNextOfDataType() {
    if (dataType == Integer.class) {
      return dataType.cast(randomGenerator.nextInt());
    } else if (dataType == Double.class) {
      return dataType.cast(randomGenerator.nextDouble());
    }
    throw new UnsupportedOperationException("Unsupported data type: " + dataType.getSimpleName());
  }
}
