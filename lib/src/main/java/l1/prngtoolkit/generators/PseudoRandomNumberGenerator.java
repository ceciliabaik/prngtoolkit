package l1.prngtoolkit.generators;

import l1.prngtoolkit.config.Configuration;
import l1.prngtoolkit.validators.ExceptionValidator;

public abstract class PseudoRandomNumberGenerator<T extends Comparable<T>> implements PseudoGenerator {
  protected final ExceptionValidator exceptionValidator;
  protected Class<T> dataType;
  protected Configuration<T> config;
  protected Long seed;

  protected PseudoRandomNumberGenerator(Class<T> dataType, Long seed, Configuration<T> config) {
    this.exceptionValidator = new ExceptionValidator();
    exceptionValidator.validateSupportedDataType(dataType);
    this.dataType = dataType;
    this.config = config;
    setSeed(seed, config);
  }

  protected void setSeed(Long seed, Configuration<T> config) {
    if (seed != null) {
      this.seed = seed;
    } else if (config != null) {
      this.seed = config.getSeed();
    } else {
      this.seed = System.currentTimeMillis();
    }
  }

  protected long getCustomSeed(Long seed, Configuration<T> config) {
    return (seed != null) ? seed : (config != null ? config.getSeed() : System.currentTimeMillis());
  }

  @Override
  public int getNextInt() {
    if (!dataType.equals(Integer.class)) {
      throw new UnsupportedOperationException(
      "Unsupported operation in getNextInt. It is supported for Integer data type only."
      );
    }
    return generateNextIntOfDataType();
  }

  @Override
  public double getNextDouble() {
    if (!dataType.equals(Double.class)) {
      throw new UnsupportedOperationException(
      "Unsupported operation in getNextDouble. It is supported for Double data type only."
      );
    }
    return generateNextDoubleOfDataType();
  }

  @Override
  public int getNextIntInRange(int minValue, int maxValue) {
    exceptionValidator.validateMinValue(minValue);
    exceptionValidator.validateMaxValue(maxValue);
    exceptionValidator.validateMinLessThanOrEqualMax(minValue, maxValue);

    int rangeSize = maxValue - minValue + 1;
    return getNextInt() % rangeSize + minValue;
  }

  @Override
  public double getNextDoubleInRange(double minValue, double maxValue) {
    exceptionValidator.validateMinValue(minValue);
    exceptionValidator.validateMaxValue(maxValue);
    exceptionValidator.validateMinLessThanOrEqualMax(minValue, maxValue);

    double rangeSize = maxValue - minValue;
    return getNextDouble() * rangeSize + minValue;
  }

  @Override
  public int[] getNextIntSequence(int count) {
    exceptionValidator.validateCount(count);

    int[] intSequence = new int[count];
    for (int i = 0; i < count; i++) {
      intSequence[i] = getNextInt();
    }
    return intSequence;
  }

  @Override
  public double[] getNextDoubleSequence(int count) {
    exceptionValidator.validateCount(count);

    double[] doubleSequence = new double[count];
    for (int i = 0; i < count; i++) {
      doubleSequence[i] = getNextDouble();
    }
    return doubleSequence;
  }

  protected abstract int generateNextIntOfDataType();

  protected abstract double generateNextDoubleOfDataType();
}