package l1.prngtoolkit.distributions;

public interface Distribution<T extends Comparable<T>> {
  int getNextIntInEvenlyDivisibleRange(int minValue, int maxValue);
  double getNextDoubleInRangeRoundedDown(double minValue, double maxValue);
}
