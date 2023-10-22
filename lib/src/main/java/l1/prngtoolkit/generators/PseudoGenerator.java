package l1.prngtoolkit.generators;

public interface PseudoGenerator {
  int nextInt();
  double nextDouble();
  int nextIntInRange(int minValue, int maxValue);
  double nextDoubleInRange(double minValue, double maxValue);
  int[] nextIntSequence(int count);
  double[] nextDoubleSequence(int count);
}
