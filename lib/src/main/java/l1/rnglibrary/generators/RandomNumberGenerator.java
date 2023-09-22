package l1.rnglibrary.generators;

public interface RandomNumberGenerator<T> {
  T generateRandomNumber();
  T[] generateRandomNumbers(int count);
  T generateRandomNumberInRange(T min, T max);
  T[] generateRandomNumbersInRange(T min, T max, int count);
}
