package l1.rngtoolkit.distributions;

import java.util.List;

import l1.rngtoolkit.models.Range;

public interface RandomNumberDistribution<T extends Comparable<T>> {
  T generateSingleRandomNumber(Range<T> range);
  List<T> generateMultipleRandomNumbers(Range<T> range, int count);
}
