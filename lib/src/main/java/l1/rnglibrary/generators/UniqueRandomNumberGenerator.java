package l1.rnglibrary.generators;

import java.util.Collection;

public interface UniqueRandomNumberGenerator<T> {
  T generateUniqueRandomNumber();
  Collection<T> generateUniqueRandomNumbers(int count);
  T generateUniqueRandomNumberInRange(T min, T max);
  Collection<T> generateUniqueRandomNumbersInRange(T min, T max, int count);
}
