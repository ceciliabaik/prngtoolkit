package l1.rngtoolkit.interfaces;

import l1.rngtoolkit.models.Range;

public interface RandomByteGenerator {
  byte generateRandomByteInRange(Range<Byte> range);
  byte[] generateRandomBytesInRangeAndCount(Range<Byte> range, int count);
}
