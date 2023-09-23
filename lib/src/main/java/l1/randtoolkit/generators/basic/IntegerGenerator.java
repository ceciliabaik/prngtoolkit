package l1.randtoolkit.generators.basic;

import l1.randtoolkit.generators.ConfigBase;
import l1.randtoolkit.generators.Range;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class IntegerGenerator extends ConfigBase<Integer> {
  private static final int MAX_INT_VALUE = Integer.MAX_VALUE;
  private final Random random;
  private Set<Integer> generatedUniqueIntegers;
  private List<Integer> randomIntegersList;

  public IntegerGenerator() {
    super();
    random = new Random();
    initializeLists();
  }

  public IntegerGenerator(long seed) {
    super(seed);
    random = new Random(seed);
    initializeLists();
  }

  private void initializeLists() {
    generatedUniqueIntegers= new HashSet<>();
    randomIntegersList = new ArrayList<>();
  }

  @Override
  public Integer generateRandomNumber(Range range) {
    if (isInRange) {
      return generateIntegerInRange(range.getMinValue(), range.getMaxValue());
    } else if (isUnique) {
      return generateUniqueInteger();
    } else  {
      return generateIntegerUpToMaximum();
    }
  }

  private int generateIntegerInRange(int minValue, int maxValue) {
    exceptionValidator.validateRange(minValue, maxValue);
    int rangeSize = maxValue - minValue + 1;
    return random.nextInt(rangeSize) + minValue;
  }

  public int generateIntegerUpToMaximum() {
    return random.nextInt(MAX_INT_VALUE);
  }

  private int generateUniqueInteger() {
    int uniqueInteger;
    do {
      uniqueInteger = Math.abs(random.nextInt(MAX_INT_VALUE + 1));
    } while (generatedUniqueIntegers.contains(uniqueInteger));
    generatedUniqueIntegers.add(uniqueInteger);
    return uniqueInteger;
  }

  @Override
  public Integer[] generateRandomNumbers(Range range, int count) {
    int minValue = range.getMinValue();
    int maxValue = range.getMaxValue();

    if (isInRange) {
      return generateIntegersInRangeWithCount(minValue, maxValue, count);
    } else if (isUnique) {
      Collection<Integer> uniqueIntegers = generateUniqueIntegersWithCount(count);
      return uniqueIntegers.toArray(new Integer[0]);
    } else {
      return generateIntegersUpToMaximumWithCount(maxValue, count);
    }
  }

  private Integer[] generateIntegersInRangeWithCount(int minValue, int maxValue, int count) {
    exceptionValidator.validateRange(minValue, maxValue);
    exceptionValidator.validatePositiveInteger(count);

    randomIntegersList.clear();
    while (randomIntegersList.size() < count) {
      int randomInteger = generateIntegerInRange(minValue, maxValue);
       randomIntegersList.add(randomInteger);
    }
    return  randomIntegersList.toArray(new Integer[0]);
  }

  private Collection<Integer> generateUniqueIntegersWithCount(int count) {
    exceptionValidator.validatePositiveInteger(count);
    exceptionValidator.validateCount(count);

    while (generatedUniqueIntegers.size() < count) {
      int uniqueInteger = generateUniqueInteger();
      generatedUniqueIntegers.add(uniqueInteger);
    }
    return generatedUniqueIntegers;
  }

  private Integer[] generateIntegersUpToMaximumWithCount(int maxValue, int count) {
    exceptionValidator.validatePositiveInteger(count);
    exceptionValidator.validateCount(count);

    randomIntegersList.clear();
    while (randomIntegersList.size() < count) {
      int randomInteger = generateIntegerUpToMaximum() + 1;
      randomIntegersList.add(randomInteger);
    }
    return randomIntegersList.toArray(new Integer[0]);
  }
}
