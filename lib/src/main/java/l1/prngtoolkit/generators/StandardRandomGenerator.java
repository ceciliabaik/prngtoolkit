package l1.prngtoolkit.generators;

import java.util.Random;

import l1.prngtoolkit.config.Configuration;

public class StandardRandomGenerator<T> extends PseudoRandomNumberGenerator<T>  {
  private final Random random;

  public StandardRandomGenerator() {
    this((Class<T>) null);
  }

  public StandardRandomGenerator(Class<T> dataType) {
    super(dataType);
    this.random = new Random(System.currentTimeMillis());
  }

  public StandardRandomGenerator(Class<T> dataType, long seed) {
    super(dataType, seed);
    this.random = new Random(seed);
  }

  public StandardRandomGenerator(Class<T> dataType, Configuration<T> config) {
    super(dataType, config);
    this.random = new Random(config.getSeed());
  }

  @Override
  protected T generateNextValue() {
    if (dataType == Integer.class) {
      return dataType.cast(random.nextInt());
    } else if (dataType == Double.class) {
      return dataType.cast(random.nextDouble());
    }
    throw new UnsupportedOperationException(UNSUPPORTED_TYPE_MESSAGE + dataType.getSimpleName());
  }
}
