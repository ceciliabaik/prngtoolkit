package l1.rngtoolkit.validators;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ExceptionValidatorTest {
  private ExceptionValidator exceptionValidator;

  @BeforeEach
  public void setUp() {
    exceptionValidator = new ExceptionValidator();
  }

  @Test
  public void testValidateRange() {
    assertDoesNotThrow(() -> exceptionValidator.validateRange(1, 10));
  }

  @Test
  public void testValidateSeedValue() {
    assertDoesNotThrow(() -> exceptionValidator.validateSeedValue(13435));
  }

  @Test
  public void testValidateCount() {
    assertDoesNotThrow(() -> exceptionValidator.validateCount(6));
  }

  @Test
  public void testValidateMinValue() {
    assertDoesNotThrow(() -> exceptionValidator.validateMinValue(5));
  }

  @Test
  public void testValidateMaxValue() {
    assertDoesNotThrow(() -> exceptionValidator.validateMaxValue(13435));
  }
}
