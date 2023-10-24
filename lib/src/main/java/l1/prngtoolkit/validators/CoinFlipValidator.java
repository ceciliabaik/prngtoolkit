package l1.prngtoolkit.validators;

public class CoinFlipValidator {
  private static final double MIN_PROBABILITY_OF_HEADS = 0.0;
  private static final double MAX_PROBABILITY_OF_HEADS = 1.0;

  public void validateMaxNumOfFlips(int maxNumOfFlips) {
    if (maxNumOfFlips < 1) {
      throw new IllegalArgumentException("Maximum number of flips must be at least 1.");
    }
  }

  public void validateProbabilityOfHeads(double probabilityOfHeads) {
    if (probabilityOfHeads < MIN_PROBABILITY_OF_HEADS || probabilityOfHeads > MAX_PROBABILITY_OF_HEADS) {
      throw new IllegalArgumentException("Invalid probabilityOfHeads. It must be between " + MIN_PROBABILITY_OF_HEADS +
                                         " and " + MAX_PROBABILITY_OF_HEADS + ". Received: " + probabilityOfHeads);
    }
  }

  public void validateNumOfFlips(int numOfFlips) {
    if (numOfFlips < 0) {
      throw new IllegalArgumentException("Number of flips must be a non-negative integer.");
    }
  }
}
