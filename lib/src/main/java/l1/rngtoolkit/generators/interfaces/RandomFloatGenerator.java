package l1.rngtoolkit.generators.interfaces;

import l1.rngtoolkit.models.Range;

public interface RandomFloatGenerator {
  float generateRandomFloatInRange(Range<Float> range);
  float[] generateRandomFloatsInRangeAndCount(Range<Float> range, int count);
}
