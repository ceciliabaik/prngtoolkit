package l1.rngtoolkit.configs;

public interface ConfigOptions {
  long getSeed();
  void setSeed(Long seed);
  void setRange(int minValue, int maxValue);
  int getMin();
  int getMax();
}
