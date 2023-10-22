package l1.prngtoolkit.factories;

import java.util.Random;

import l1.prngtoolkit.distributions.Distribution;
import l1.prngtoolkit.distributions.UniformDistribution;

public class DistributionFactory {

  public <T extends Comparable<T>> Distribution<T> createUniformDistribution(Random random) {
    return new UniformDistribution<>(random);
  }
}
