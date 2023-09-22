package l1.rng.generators.basic;

import l1.rng.generators.Seed;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class RandomIntGenerator extends Seed<Integer> {
  private static final int MAX_INT_VALUE = Integer.MAX_VALUE;
  private final Random random;

  public RandomIntGenerator() {
    super();
    random = new Random();
  }

  public RandomIntGenerator(long seed) {
    super(seed);
    random = new Random(seed);
  }

  @Override
  public Integer generateANumber() {
    return generateRandomInt(MAX_INT_VALUE);
  }

  private Integer generateRandomInt(int range) {
    return random.nextInt(range);
  }

  @Override
  public Integer[] generateMultipleNumbers(int count) {
    exceptionValidator.validatePositiveInt(count);

    Integer[] randomInts = new Integer[count];
    for (int i = 0; i < count; i++) {
      randomInts[i] = generateRandomInt(MAX_INT_VALUE);
    }
    return randomInts;
  }

  @Override
  public Integer generateANumberInRange(Integer min, Integer max) {
    exceptionValidator.validateRange(min, max);
    int range = max - min + 1;
    return  generateRandomInt(range) + min;
  }

  @Override
  public Integer[] generateMultipleNumbersInRange(Integer min, Integer max, int count) {
    exceptionValidator.validateRange(min, max);
    exceptionValidator.validatePositiveInt(count);

    int range = max - min + 1;
    Integer[] randomInts = new Integer[count];
    for (int i = 0; i < count; i++) {
      randomInts[i] = generateRandomInt(range) + min;
    }
    return randomInts;
  }

  @Override
  public Collection<Integer> generateUniqueNumbers(int count) {
    exceptionValidator.validatePositiveInt(count);
    exceptionValidator.validateCount(count);

    Set<Integer> uniqueNumbers = new HashSet<>();
    while (uniqueNumbers.size() < count) {
      uniqueNumbers.add(Math.abs(generateRandomInt(MAX_INT_VALUE)));
    }
    return new ArrayList<>(uniqueNumbers);
  }
}
