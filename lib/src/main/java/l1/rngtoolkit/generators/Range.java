package l1.rngtoolkit.generators;

public class Range {
  private int minValue;
  private int maxValue;

  public Range(int minValue, int maxValue) {
    this.minValue = minValue;
    this.maxValue = maxValue;
  }

  public int getMinValue() {
    return minValue;
  }

  public int getMaxValue() {
    return maxValue;
  }
}
