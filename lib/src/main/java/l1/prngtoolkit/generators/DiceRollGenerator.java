package l1.prngtoolkit.generators;

import java.util.Random;

public class DiceRollGenerator {
  private static final int DEFAULT_NUM_OF_SIDES = 6;
  private static final int MAX_NUM_OF_SIDES = 20;
  private static final int MAX_NUM_OF_DICE = 10;
  private final Random random;
  private final int numOfSides;

  public DiceRollGenerator(Random random) {
    this(random, DEFAULT_NUM_OF_SIDES);
  }

  public DiceRollGenerator(Random random, int numOfSides) {
    if (numOfSides < 4 || numOfSides > MAX_NUM_OF_SIDES || numOfSides % 2 != 0) {
      throw new IllegalArgumentException("Invalid number of sides: must be an even integer between 4 and " + MAX_NUM_OF_SIDES + ".");
    }
    this.random = random;
    this.numOfSides = numOfSides;
  }

  public int rollDie() {
    return random.nextInt(numOfSides) + 1;
  }

  public int[] rollMultipleDice(int numOfDice) {
    validateNumOfDice(numOfDice);

    int[] diceRollResults = new int[numOfDice];
    for (int i = 0; i < numOfDice; i++) {
      diceRollResults[i] = random.nextInt(numOfSides) + 1;
    }
    return diceRollResults;
  }

  private void  validateNumOfDice(int numOfDice) {
    if (numOfDice < 1 || numOfDice > MAX_NUM_OF_DICE) {
      throw new IllegalArgumentException("Invalid number of dice: must be a positive integer between 1 and " + MAX_NUM_OF_DICE + ".");
    }
  }
}
