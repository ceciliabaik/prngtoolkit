package l1.prngtoolkit.generators;

public interface PseudoGenerator {
  int getNextInt();
  double getNextDouble();
  int getNextIntInclusive(int minValue, int maxValue);
  double getNextDoubleInclusive(double minValue, double maxValue);
  int[] getNextIntSequence(int count);
  double[] getNextDoubleSequence(int count);
}
