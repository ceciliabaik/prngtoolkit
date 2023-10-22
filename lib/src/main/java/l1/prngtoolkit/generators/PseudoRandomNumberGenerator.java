package l1.prngtoolkit.generators;

import l1.prngtoolkit.config.Configuration;
import l1.prngtoolkit.validators.ExceptionValidator;

public abstract class PseudoRandomNumberGenerator<T> implements PseudoGenerator {
  protected static final String UNSUPPORTED_TYPE_MESSAGE = "Unsupported data type: ";
  protected final ExceptionValidator exceptionValidator;
  protected Class<T> dataType;
  protected Configuration<T> config;
  protected long seed;

  /**
   * Default constructor using the default seed.
   * Used for creating instances with default settings.
   */
  protected PseudoRandomNumberGenerator() {
    // Calls the parameterized constructor with a null value for the data type.
    this(null);
  }

  /**
   * Constructor for creating instances using the
   * System.currentTimeMillis() as the default seed for randomness.
   */
  protected PseudoRandomNumberGenerator(Class<T> dataType) {
    this.exceptionValidator = new ExceptionValidator();
    exceptionValidator.validateSupportedDataType(dataType);
    this.dataType = dataType;
  }

  /**
   * Constructor for creating instances with a custom seed for randomness.
   */
  protected PseudoRandomNumberGenerator(Class<T> dataType, long seed) {
    this.exceptionValidator = new ExceptionValidator();
    exceptionValidator.validateSupportedDataType(dataType);
    exceptionValidator.validateSeed(seed);
    this.dataType = dataType;
    this.seed = seed;
  }

  /**
   * Constructor for creating instances using a seed provided in the configuration.
   */
  protected PseudoRandomNumberGenerator(Class<T> dataType, Configuration<T> config) {
    this.exceptionValidator = new ExceptionValidator();
    exceptionValidator.validateSupportedDataType(dataType);
    this.dataType = dataType;
    this.config = config;
  }

  @Override
  public int nextInt() {
    if (dataType != Integer.class) {
      throw new UnsupportedOperationException("nextInt is supported for Integer data type only.");
    }
    return (int) generateNextValue();
  }

  @Override
  public double nextDouble() {
    if (dataType != Double.class) {
      throw new UnsupportedOperationException("nextDouble is supported for Double data type only.");
    }
    return (double) generateNextValue();
  }

  @Override
  public int nextIntInRange(int minValue, int maxValue) {
    exceptionValidator.validateMinValue(minValue);
    exceptionValidator.validateMaxValue(maxValue);
    int rangeSize = maxValue - minValue + 1;
    return nextInt() % rangeSize + minValue;
  }

  @Override
  public double nextDoubleInRange(double minValue, double maxValue) {
    exceptionValidator.validateMinValue(minValue);
    exceptionValidator.validateMaxValue(maxValue);
    double rangeSize = maxValue - minValue;
    return nextDouble() * rangeSize + minValue;
  }

  @Override
  public int[] nextIntSequence(int count) {
    exceptionValidator.validateCount(count);

    int[] intSequence = new int[count];
    for (int i = 0; i < count; i++) {
      intSequence[i] = nextInt();
    }
    return intSequence;
  }

  @Override
  public double[] nextDoubleSequence(int count) {
    exceptionValidator.validateCount(count);

    double[] doubleSequence = new double[count];
    for (int i = 0; i < count; i++) {
      doubleSequence[i] = nextDouble();
    }
    return doubleSequence;
  }

  /**
   * Generates the next pseudo-random value based on the specified data type.
   */
  protected abstract T generateNextValue();
}
