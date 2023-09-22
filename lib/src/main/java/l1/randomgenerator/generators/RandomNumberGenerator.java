package l1.randomgenerator.generators;

import java.util.Collection;

public interface RandomNumberGenerator<T> {
  T generateANumber();
  T[] generateMultipleNumbers(int count);
  T generateANumberInRange(T min, T max);
  T[] generateMultipleNumbersInRange(T min, T max, int count);
  Collection<T> generateUniqueNumbers(int count);
}
