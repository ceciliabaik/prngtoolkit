package l1.rngtoolkit.interfaces;

import l1.rngtoolkit.models.Range;

public interface RandomLongGenerator {
  long generateRandomLongInRange(Range<Long> range);
  long[] generateRandomLongsInRangeAndCount(Range<Long> range, int count);
}
