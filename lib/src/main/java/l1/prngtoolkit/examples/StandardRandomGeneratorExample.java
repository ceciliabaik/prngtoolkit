package l1.prngtoolkit.examples;

import l1.prngtoolkit.config.Configuration;
import l1.prngtoolkit.factories.GeneratorFactory;
import l1.prngtoolkit.generators.StandardRandomGenerator;

public class StandardRandomGeneratorExample {

  public static void main(String[] args) {
    // Create a GeneratorFactory to create a StandardRandomGenerator.
    GeneratorFactory generatorFactory = new GeneratorFactory();

    // Specify the data type (e.g., Integer or Double)
    Class<Integer> dataType = Integer.class;

    // Example 1: Create a StandardRandomGenerator with the default seed (system current time).
    StandardRandomGenerator<Integer> generatorWithDefaultSeed = generatorFactory.createStandardRandomGenerator(dataType, null, null);

    // Example 2: Create a StandardRandomGenerator with a provided seed.
    Long providedSeed = 12345L;
    StandardRandomGenerator<Integer> generatorWithProvidedSeed = generatorFactory.createStandardRandomGenerator(dataType, providedSeed, null);

    // Example 3: Create a StandardRandomGenerator with the seed from the configuration.
    Long configSeed = 54321L;
    Configuration<Integer> config = new Configuration<>();
    config.setSeed(configSeed);
    StandardRandomGenerator<Integer> generatorWithConfigSeed = generatorFactory.createStandardRandomGenerator(dataType, null, config);

    // Generate random numbers using each generator.
    int randomIntDefaultSeed = generatorWithDefaultSeed.getNextInt();
    int randomIntProvidedSeed = generatorWithProvidedSeed.getNextInt();
    int randomIntConfigSeed = generatorWithConfigSeed.getNextInt();

    // Display the generated random numbers.
    System.out.println("Random Integer with Default Seed: " + randomIntDefaultSeed);
    System.out.println("Random Integer with Provided Seed: " + randomIntProvidedSeed);
    System.out.println("Random Integer with Config Seed: " + randomIntConfigSeed);

    // Generate a random integer in the range [10, 20].
    int minValue = 10;
    int maxValue = 20;
    int randomIntInRange = generatorWithDefaultSeed.getNextIntInRange(minValue, maxValue);
    System.out.println("Random Integer in Range: " + randomIntInRange);

    // Generate a sequence of 5 random integers.
    int count = 5;
    int[] randomIntSequence = generatorWithDefaultSeed.getNextIntSequence(count);
    System.out.println("Random Integer Sequence:");
    for (int randomInt : randomIntSequence) {
      System.out.println(randomInt);
    }
  }
}
