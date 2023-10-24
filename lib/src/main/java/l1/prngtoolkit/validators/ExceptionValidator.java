package l1.prngtoolkit.validators;

public class ExceptionValidator {

  public <T extends Comparable<T>> void validateMinValue(T minValue) {
    if (minValue == null) {
      throw new IllegalArgumentException("Invalid min value: min value must not be null.");
    }
  }

  public <T extends Comparable<T>> void validateMaxValue(T maxValue) {
    if (maxValue == null) {
      throw new IllegalArgumentException("Invalid max value: max value must not be null.");
    }
  }

  public <T extends Comparable<T>> void validateMinLessThanOrEqualMax(T minValue, T maxValue) {
    if (minValue == null || maxValue == null || minValue.compareTo(maxValue) > 0) {
      throw new IllegalArgumentException("Invalid range: min value must be less than or equal to max value.");
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

  public <T> void validateSupportedDataType(Class<T> dataType) {
    if (dataType == null || (dataType != Integer.class && dataType != Double.class)) {
      throw new IllegalArgumentException("Unsupported type: " + (dataType != null ? dataType.getSimpleName() : "null"));
    }
  }
}
