package l1.rngtoolkit.configs;

import l1.rngtoolkit.validators.ExceptionValidator;

public class GeneratorConfig {
  private long seed;
  private int minValue;
  private int maxValue;
  private final ExceptionValidator exceptionValidator = new ExceptionValidator();

  public long getSeed() {
    return seed;
  }

  public void setSeed(long seed) {
    exceptionValidator.validateSeed(seed);
    this.seed = seed;
  }

  public int getMin() {
    return minValue;
  }

  public void setMin(int minValue) {
    exceptionValidator.validateMin(minValue);
    this.minValue = minValue;
  }

  public int getMax() {
    return maxValue;
  }

  public void setMax(int maxValue) {
    exceptionValidator.validateMax(maxValue);
    this.maxValue = maxValue;
  }
}
