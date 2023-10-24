package l1.prngtoolkit.examples;

import l1.prngtoolkit.config.Configuration;
import l1.prngtoolkit.factories.GeneratorFactory;
import l1.prngtoolkit.generators.MersenneTwisterGenerator;

public class MersenneTwisterGeneratorExample {

  public static void main(String[] args) {
    // Create a GeneratorFactory to create a MersenneTwisterGenerator.
    GeneratorFactory generatorFactory = new GeneratorFactory();

    // Specify the data type (e.g., Integer or Double)
    Class<Double> dataType = Double.class;

    // Example 1: Create a MersenneTwisterGenerator with the default seed (system current time).
    MersenneTwisterGenerator<Double> generatorWithDefaultSeed = generatorFactory.createMersenneTwisterGenerator(dataType, null, null);

    // Example 2: Create a MersenneTwisterGenerator with a provided seed.
    Long providedSeed = 12345L;
    MersenneTwisterGenerator<Double> generatorWithProvidedSeed = generatorFactory.createMersenneTwisterGenerator(dataType, providedSeed, null);

    // Example 3: Create a MersenneTwisterGenerator with the seed from the configuration.
    Long configSeed = 54321L;
    Configuration<Double> config = new Configuration<>();
    config.setSeed(configSeed);
    MersenneTwisterGenerator<Double> generatorWithConfigSeed = generatorFactory.createMersenneTwisterGenerator(dataType, null, config);

    // Generate random numbers using each generator.
    double randomDoubleDefaultSeed = generatorWithDefaultSeed.getNextDouble();
    double randomDoubleProvidedSeed = generatorWithProvidedSeed.getNextDouble();
    double randomDoubleConfigSeed = generatorWithConfigSeed.getNextDouble();

    // Display the generated random numbers.
    System.out.println("Random Double with Default Seed: " + randomDoubleDefaultSeed);
    System.out.println("Random Double with Provided Seed: " + randomDoubleProvidedSeed);
    System.out.println("Random Double with Config Seed: " + randomDoubleConfigSeed);

    // Generate a random double in the range [30.4, 60.5]
    double minValue = 30.4;
    double maxValue = 60.5;
    double randomDoubleInRange = generatorWithDefaultSeed.getNextDoubleInRange(minValue, maxValue);
    System.out.println("Random Double in Range: " + randomDoubleInRange);

    // Generate a sequence of 10 random doubles
    int count = 10;
    double[] randomDoubleSequence = generatorWithProvidedSeed.getNextDoubleSequence(count);
    System.out.println("Random Double Sequence:");
    for (double randomDouble : randomDoubleSequence) {
      System.out.println(randomDouble);
    }
  }
}
