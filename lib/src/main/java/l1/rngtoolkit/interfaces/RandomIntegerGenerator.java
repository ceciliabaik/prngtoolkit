package l1.rngtoolkit.interfaces;

import l1.rngtoolkit.models.Range;

public interface RandomIntegerGenerator {
  int generateRandomIntegerInRange(Range<Integer> range);
  int[] generateRandomIntegersInRangeAndCount(Range<Integer> range, int count);
}
