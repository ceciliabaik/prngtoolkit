package l1.rngtoolkit.generators;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Random;
import l1.prngtoolkit.generators.DiceRollGenerator;

public class DiceRollGeneratorTest {
  private DiceRollGenerator generator;

  @BeforeEach
  public void setup() {
    generator = new DiceRollGenerator(new Random(12345L));
  }

  @Test
  public void testRollDie() {
    int result = generator.rollDie();
    assertTrue(result >= 1 && result <= 6);
  }

  @Test
  public void testRollMultipleDice() {
    int numOfDice = 5;
    int[] results = generator.rollMultipleDice(numOfDice);
    assertEquals(numOfDice, results.length);
    for (int result : results) {
      assertTrue(result >= 1 && result <= 6);
    }
  }

  @Test
  public void testCustomNumberOfSides() {
    int customSides = 8;
    DiceRollGenerator customGenerator = new DiceRollGenerator(new Random(54321L), customSides);

    int result = customGenerator.rollDie();
    assertTrue(result >= 1 && result <= customSides);
  }

  @Test
  public void testInvalidNumberOfSides() {
    int invalidSides = 3; // Less than the minimum allowed.
    DiceRollGenerator invalidGenerator = new DiceRollGenerator(new Random(98765L), invalidSides);

    invalidGenerator.rollDie();
  }

  @Test
  public void testInvalidNumberOfDice() {
    int invalidNumOfDice = 11; // Exceeds the maximum allowed.
    generator.rollMultipleDice(invalidNumOfDice);
  }
}
