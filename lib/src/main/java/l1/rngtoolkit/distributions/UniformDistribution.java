package l1.rngtoolkit.distributions;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import l1.rngtoolkit.models.Range;

public class UniformDistribution<T extends Comparable<T>> implements RandomNumberDistribution<T> {
  private final Class<T> dataType;
  private final Random random;
  private List<T> resultList;

  public UniformDistribution(Class<T> dataType) {
    this.dataType = dataType;
    random = new Random();
    resultList = new ArrayList<>();
  }

  @Override
  public T generateSingleRandomNumber(Range<T> range) {
    return generateRandomNumber(range);
  }

  private T generateRandomNumber(Range<T> range) {
    if (dataType == Integer.class) {
        return getCastedRandomIntegerInRange(range);
    } else if (dataType == Float.class) {
        return getCastedRandomFloatÍnRange(range);
    } else if (dataType == Long.class) {
        return getCastedRandomLongInRange(range);
    } else if (dataType == Byte.class) {
        return getCastedRandomByteInRange(range);
    } else {
        throw new IllegalArgumentException("Unsupported data type.");
    }
  }

  private T getCastedRandomIntegerInRange(Range<T> range) {
    int minValue = (Integer) range.getMinValue();
    int maxValue = (Integer) range.getMaxValue();
    int rangeSize = maxValue - minValue + 1;
    return castToDataType(random.nextInt(rangeSize) + minValue);
  }

  private T getCastedRandomFloatÍnRange(Range<T> range) {
    float minValue = (Float) range.getMinValue();
    float maxValue = (Float) range.getMaxValue();
    float rangeSize = maxValue + minValue;
    return castToDataType(random.nextFloat() * rangeSize);
  }

  private T getCastedRandomLongInRange(Range<T> range) {
    long minValue = (Long) range.getMinValue();
    long maxValue = (Long) range.getMaxValue();
    long rangeSize = maxValue - minValue + 1;
    return castToDataType(random.nextLong() * rangeSize + minValue);
  }

  private T getCastedRandomByteInRange(Range<T> range) {
    byte minValue = (Byte) range.getMinValue();
    byte maxValue = (Byte) range.getMaxValue();
    int rangeSize = maxValue - minValue + 1;
    return castToDataType((byte) (random.nextInt(rangeSize) + minValue));
  }

  private T castToDataType(Object value) {
    return dataType.cast(value);
  }

  @Override
  public List<T> generateMultipleRandomNumbers(Range<T> range, int count) {
    resultList = new ArrayList<>(count);
    for (int i = 0; i < count; i++) {
      resultList.add(generateRandomNumber(range));
    }
    return resultList;
  }
}
