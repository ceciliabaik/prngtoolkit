package l1.rngtoolkit.configs;

import l1.rngtoolkit.validators.ExceptionValidator;

public abstract class ConfigBase<T> {
  protected final ExceptionValidator exceptionValidator = new ExceptionValidator();
  protected final GeneratorConfig config = new GeneratorConfig();

  protected ConfigBase() {
    setSeed(System.currentTimeMillis());
  }

  protected ConfigBase(long seed) {
    setSeed(seed);
  }

  protected long getSeed() {
    return config.getSeed();
  }

  protected void setSeed(long seed) {
    config.setSeed(seed);
  }

  protected Integer getMin() {
    return config.getMin();
  }

  protected Integer getMax() {
    return config.getMax();
  }
}
