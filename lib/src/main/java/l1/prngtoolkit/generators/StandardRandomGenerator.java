package l1.prngtoolkit.generators;

import java.util.Random;

import l1.prngtoolkit.config.Configuration;

public class StandardRandomGenerator<T extends Comparable<T>> extends PseudoRandomNumberGenerator<T>  {
  private final Random random;

  public StandardRandomGenerator(Class<T> dataType, Long seed, Configuration<T> config) {
    super(dataType, seed, config);
    this.random = new Random(getCustomSeed(seed, config));
  }

  @Override
  protected int generateNextIntOfDataType() {
    if (dataType == Integer.class) {
      return random.nextInt();
    }
    throw new UnsupportedOperationException("Unsupported data type: " + dataType.getSimpleName());
  }

  @Override
  protected double generateNextDoubleOfDataType() {
    if (dataType == Double.class) {
      return random.nextDouble();
    }
    throw new UnsupportedOperationException("Unsupported data type: " + dataType.getSimpleName());
  }
}
