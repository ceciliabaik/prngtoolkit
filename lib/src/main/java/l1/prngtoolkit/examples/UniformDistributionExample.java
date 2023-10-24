package l1.prngtoolkit.examples;

import java.util.Random;

import l1.prngtoolkit.factories.DistributionFactory;
import l1.prngtoolkit.distributions.Distribution;

public class UniformDistributionExample {

  public static void main(String[] args) {
    // Create a random number generator.
    Random random = new Random();

    // Create a DistributionFactory to create a UniformDistribution.
    DistributionFactory distributionFactory = new DistributionFactory();

    // Create a UniformDistribution using the factory.
    Distribution<Integer> uniformDistribution = distributionFactory.createUniformDistribution(random);

    // Generate a random integer in an evenly divisible range [10, 50].
    int minValue1 = 10;
    int maxValue1 = 50;
    int randomIntEvenlyDivisible = uniformDistribution.getNextIntInEvenlyDivisibleRange(minValue1, maxValue1);
    System.out.println("Random Integer in Evenly Divisible Range: " + randomIntEvenlyDivisible);

    // Generate a random double rounded down to the nearest integer in a range [5.5, 15.5].
    double minValue2 = 5.5;
    double maxValue2 = 15.5;
    double randomDoubleRoundedDown = uniformDistribution.getNextDoubleInRangeRoundedDown(minValue2, maxValue2);
    System.out.println("Random Double Rounded Down in Range: " + randomDoubleRoundedDown);
  }
}
