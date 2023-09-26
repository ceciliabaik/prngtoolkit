package l1.rngtoolkit.models;

public class Range<T extends Comparable<T>> {
  private T minValue;
  private T maxValue;

  public Range(T minValue, T maxValue) {
    this.minValue = minValue;
    this.maxValue = maxValue;
  }

  public T getMinValue() {
    return minValue;
  }

  public T getMaxValue() {
    return maxValue;
  }
}
