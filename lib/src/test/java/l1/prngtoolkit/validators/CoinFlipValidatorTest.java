package l1.prngtoolkit.validators;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class CoinFlipValidatorTest {
  private CoinFlipValidator coinFlipValidator;

  @BeforeEach
  public void setUp() {
    coinFlipValidator = new CoinFlipValidator();
  }

  @Test
  public void testValidMaxNumOfFlips() {
    int maxNumOfFlips = 5;
    coinFlipValidator.validateMaxNumOfFlips(maxNumOfFlips);
  }

  @Test
  public void testInvalidMaxNumOfFlips() {
    int maxNumOfFlips = 0;
    assertThrows(IllegalArgumentException.class, () -> coinFlipValidator.validateMaxNumOfFlips(maxNumOfFlips));
  }

  @Test
  public void testValidProbabilityOfHeads() {
    double probabilityOfHeads = 0.5;
    coinFlipValidator.validateProbabilityOfHeads(probabilityOfHeads);
  }

  @Test
  public void testInvalidProbabilityOfHeadsLow() {
    double probabilityOfHeads = -0.1;
    assertThrows(IllegalArgumentException.class, () -> coinFlipValidator.validateProbabilityOfHeads(probabilityOfHeads));
  }

  @Test
  public void testInvalidProbabilityOfHeadsHigh() {
    double probabilityOfHeads = 1.1;
    assertThrows(IllegalArgumentException.class, () -> coinFlipValidator.validateProbabilityOfHeads(probabilityOfHeads));
  }

  @Test
  public void testValidNumOfFlips() {
    int numOfFlips = 10;
    coinFlipValidator.validateNumOfFlips(numOfFlips);
  }

  @Test
  public void testValidNumOfFlipsZero() {
    int numOfFlips = 0;
    coinFlipValidator.validateNumOfFlips(numOfFlips);
  }

  @Test
  public void testInvalidNumOfFlipsNegative() {
    int numOfFlips = -5;
    assertThrows(IllegalArgumentException.class, () -> coinFlipValidator.validateNumOfFlips(numOfFlips));
  }
}
