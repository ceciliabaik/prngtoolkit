package l1.prngtoolkit.examples;

import l1.prngtoolkit.config.Configuration;

public class ConfigurationExample {

  public static void main(String[] args) {
    // Create a Configuration instance.
    Configuration<Integer> config = new Configuration<>();

    // Set the seed for the pseudo random number generator.
    long seed = 12345L;
    config.setSeed(seed);

    // Set the minimum and maximum values for the random numbers.
    int minValue = 1;
    int maxValue = 100;
    config.setMinValue(minValue);
    config.setMaxValue(maxValue);

    // Enable thread safety for the pseudo random number generator (if supported).
    config.setUseThreadSafety(true);

    // Display the configuration settings.
    System.out.println("Configuration Settings:");
    System.out.println("Seed: " + config.getSeed());
    System.out.println("Min Value: " + config.getMinValue());
    System.out.println("Max Value: " + config.getMaxValue());
    System.out.println("Use Thread Safety: " + config.isUseThreadSafety());
  }
}
