package l1.prngtoolkit.generators;

import org.apache.commons.math3.random.MersenneTwister;
import org.apache.commons.math3.random.RandomGenerator;

import l1.prngtoolkit.config.Configuration;

public class MersenneTwisterGenerator<T extends Comparable<T>> extends PseudoRandomNumberGenerator<T> {
  private final RandomGenerator randomGenerator;

  public MersenneTwisterGenerator(Class<T> dataType, Long seed, Configuration<T> config) {
    super(dataType, seed, config);
    this.randomGenerator = new MersenneTwister(getCustomSeed(seed, config));
  }

  @Override
  protected int generateNextIntOfDataType() {
    if (dataType == Integer.class) {
      return randomGenerator.nextInt();
    }
    throw new UnsupportedOperationException("Unsupported data type: " + dataType.getSimpleName());
  }

  @Override
  protected double generateNextDoubleOfDataType() {
    if (dataType == Double.class) {
      return randomGenerator.nextDouble();
    }
    throw new UnsupportedOperationException("Unsupported data type: " + dataType.getSimpleName());
  }
}
