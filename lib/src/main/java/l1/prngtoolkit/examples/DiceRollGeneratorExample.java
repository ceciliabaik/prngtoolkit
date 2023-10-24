package l1.prngtoolkit.examples;

import java.util.Random;
import l1.prngtoolkit.factories.GeneratorFactory;
import l1.prngtoolkit.generators.DiceRollGenerator;

public class DiceRollGeneratorExample {

  public static void main(String[] args) {
    // Create a random number generator.
    Random random = new Random();

    // Create a GeneratorFactory to create the DiceRollGenerator.
    GeneratorFactory generatorFactory = new GeneratorFactory();

    // Create a DiceRollGenerator with the default number of sides (6).
    DiceRollGenerator diceRollGenerator = generatorFactory.createDiceRollGenerator(random);

    // Roll a single die and display the result.
    int rollResult = diceRollGenerator.rollDie();
    System.out.println("Rolled a single die: " + rollResult);

    // Roll multiple dice (in this case, 3 dice) and display the results.
    int numOfDice = 3;
    int[] diceResults = diceRollGenerator.rollMultipleDice(numOfDice);
    System.out.println("Rolled " + numOfDice + " dice:");
    for (int i = 0; i < numOfDice; i++) {
      System.out.println("Die " + (i + 1) + ": " + diceResults[i]);
    }

    // Create a DiceRollGenerator with a custom number of sides (e.g., 10 sides).
    int customNumOfSides = 10;
    DiceRollGenerator customDiceRollGenerator = generatorFactory.createDiceRollGeneratorWithCustomSides(random, customNumOfSides);

    // Roll a single die with custom sides and display the result.
    int customRollResult = customDiceRollGenerator.rollDie();
    System.out.println("Rolled a single die with custom sides: " + customRollResult);
  }
}
