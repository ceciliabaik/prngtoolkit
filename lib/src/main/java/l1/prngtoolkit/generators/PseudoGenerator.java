package l1.prngtoolkit.generators;

public interface PseudoGenerator {
  int getNextInt();
  double getNextDouble();
  int getNextIntInRange(int minValue, int maxValue);
  double getNextDoubleInRange(double minValue, double maxValue);
  int[] getNextIntSequence(int count);
  double[] getNextDoubleSequence(int count);
}
