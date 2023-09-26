package l1.rngtoolkit.factory;

import l1.rngtoolkit.distributions.UniformDistribution;
import l1.rngtoolkit.interfaces.RandomNumberDistribution;

public class DistributionFactory {

  public DistributionFactory() {}

  public <T extends Comparable<T>> RandomNumberDistribution<T> createUniformDistribution(Class<T> dataType) {
    return new UniformDistribution<>(dataType);
  }
}
