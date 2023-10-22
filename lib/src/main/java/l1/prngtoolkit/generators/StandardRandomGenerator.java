package l1.prngtoolkit.generators;

import java.util.Random;

import l1.prngtoolkit.config.Configuration;

public class StandardRandomGenerator<T> extends PseudoRandomNumberGenerator<T>  {
  private final Random random;

  public StandardRandomGenerator(Class<T> dataType, Long seed, Configuration<T> config) {
    super(dataType, seed, config);
    this.random = new Random(seed != null ? seed : config.getSeed());
  }

  @Override
  protected T generateNextOfDataType() {
    if (dataType == Integer.class) {
      return dataType.cast(random.nextInt());
    } else if (dataType == Double.class) {
      return dataType.cast(random.nextDouble());
    }
    throw new UnsupportedOperationException("Unsupported data type: " + dataType.getSimpleName());
  }
}
