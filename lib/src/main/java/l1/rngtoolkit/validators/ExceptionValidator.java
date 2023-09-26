package l1.rngtoolkit.validators;

public class ExceptionValidator {

  public <T extends Comparable<T>> void validateRange(T min, T max) {
    if (min.compareTo(max) >= 0) {
      throw new IllegalArgumentException("Invalid range: min value must be less than max value.");
    }
  }

  public <T extends Comparable<T>> void validateMin(T min) {
    if (min == null) {
      throw new IllegalArgumentException("Invalid min value: min value must not be null.");
    }
  }

  public <T extends Comparable<T>> void validateMax(T max) {
    if (max == null) {
      throw new IllegalArgumentException("Invalid max value: max value must not be null.");
    }
  }

  public <T> void validateSeed(Number seed) {
    if (seed == null || seed.doubleValue() < 0) {
      throw new IllegalArgumentException("Invalid seed: seed value must be non-negative.");
    }
  }

  public <T> void validateCount(Number count) {
    if (count == null || count.intValue() <= 0) {
      throw new IllegalArgumentException("Invalid count: count must be a positive integer.");
    }
  }
}
