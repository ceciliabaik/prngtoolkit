package l1.prngtoolkit.generators;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Random;

public class DiceRollGeneratorTest {
  private DiceRollGenerator diceRollGenerator;

  @BeforeEach
  public void setUp() {
    Random random = new Random();
    diceRollGenerator = new DiceRollGenerator(random);
  }

  @Test
  public void testRollDieWithDefaultSides() {
    int rollResult = diceRollGenerator.rollDie();
    assertTrue(rollResult >= 1 && rollResult <= 6); // Assuming the default number of sides is 6.
  }

  @ParameterizedTest
  @ValueSource(ints = {4, 6, 8, 10, 12})
  public void testRollDieWithDifferentSides(int customNumOfSides) {
    Random random = new Random();
    DiceRollGenerator diceRollGenerator = new DiceRollGenerator(random, customNumOfSides);

    int rollResult = diceRollGenerator.rollDie();

    assertTrue(rollResult >= 1 && rollResult <= customNumOfSides);
  }

  @Test
  public void testInvalidNumberOfDice() {
    assertThrows(IllegalArgumentException.class, () -> diceRollGenerator.rollMultipleDice(0));
  }
}
