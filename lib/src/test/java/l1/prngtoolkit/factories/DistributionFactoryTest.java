package l1.prngtoolkit.factories;

import java.util.Random;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import l1.prngtoolkit.distributions.Distribution;

public class DistributionFactoryTest {
  private DistributionFactory distributionFactory;
  private Random random;

  @BeforeEach
  public void setUp() {
    distributionFactory = new DistributionFactory();
    random = new Random();
  }

  @Test
  public void testCreateIntUniformDistribution() {
    Distribution<Integer> intUniformDistribution = distributionFactory.createUniformDistribution(random);
    assertNotNull(intUniformDistribution);
  }

  @Test
  public void testCreateDoubleUniformDistribution() {
    Distribution<Double> doubleUniformDistribution = distributionFactory.createUniformDistribution(random);
    assertNotNull(doubleUniformDistribution);
  }
}
