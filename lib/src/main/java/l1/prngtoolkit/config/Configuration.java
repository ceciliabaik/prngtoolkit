package l1.prngtoolkit.config;

import l1.prngtoolkit.validators.ExceptionValidator;

public class Configuration<T extends Comparable<T>> {
  private final ExceptionValidator exceptionValidator;
  private Long seed;
  private T minValue;
  private T maxValue;
  public boolean useThreadSafety;

  public Configuration() {
    this.seed = System.currentTimeMillis();
    this.exceptionValidator= new ExceptionValidator();
  }

  public Long getSeed() {
    return seed;
  }

  public void setSeed(Long seed) {
    exceptionValidator.validateSeed(seed);
    this.seed = seed;
  }

  public T getMinValue() {
    return minValue;
  }

  public void setMinValue(T minValue) {
    exceptionValidator.validateMinValue(minValue);
    this.minValue = minValue;
  }

  public T getMaxValue() {
    return maxValue;
  }

  public void setMaxValue(T maxValue) {
    exceptionValidator.validateMaxValue(maxValue);
    this.maxValue = maxValue;
  }

  public boolean isUseThreadSafety() {
    return useThreadSafety;
  }

  public void setUseThreadSafety(boolean useThreadSafety) {
    this.useThreadSafety = useThreadSafety;
  }

  @Override
  public String toString() {
    return "Configuration{" +
           "Seed=" + seed +
           ", minValue=" + minValue +
           ", maxValue=" + maxValue +
           ", useThreadSafety=" + useThreadSafety +
           "}";
  }
}
