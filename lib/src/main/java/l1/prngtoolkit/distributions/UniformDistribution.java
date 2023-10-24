package l1.prngtoolkit.distributions;

import java.util.Random;

import l1.prngtoolkit.validators.ExceptionValidator;

public class UniformDistribution<T extends Comparable<T>> implements Distribution<T> {
  private final ExceptionValidator exceptionValidator;
  private final Random random;

  public UniformDistribution(Random random) {
    this.exceptionValidator = new ExceptionValidator();
    this.random = random;
  }

  @Override
  public int getNextIntInEvenlyDivisibleRange(int minValue, int maxValue) {
    exceptionValidator.validateMinValue(minValue);
    exceptionValidator.validateMaxValue(maxValue);
    exceptionValidator.validateMinLessThanOrEqualMax(minValue, maxValue);

    int rangeSize = maxValue - minValue + 1;
    int evenlyDivisibleRange = rangeSize - (rangeSize % 2);
    return minValue + random.nextInt(evenlyDivisibleRange);
  }

  @Override
  public double getNextDoubleInRangeRoundedDown(double minValue, double maxValue) {
    exceptionValidator.validateMinValue(minValue);
    exceptionValidator.validateMaxValue(maxValue);
    exceptionValidator.validateMinLessThanOrEqualMax(minValue, maxValue);

    double rangeSize = maxValue - minValue + 1;
    double randomDouble = random.nextDouble() * (rangeSize) + minValue;
    return Math.floor(randomDouble);
  }
}
