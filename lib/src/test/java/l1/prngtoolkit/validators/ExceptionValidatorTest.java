package l1.prngtoolkit.validators;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ExceptionValidatorTest {
  private ExceptionValidator exceptionValidator;

  @BeforeEach
  public void setUp() {
    exceptionValidator = new ExceptionValidator();
  }

  @Test
  public void testValidMinValueOfInt() {
    Integer minValue = 0;
    exceptionValidator.validateMinValue(minValue);
  }

  @Test
  public void testMinValueNWithNullInt() {
    Integer minValue = null;
    assertThrows(IllegalArgumentException.class, () -> exceptionValidator.validateMinValue(minValue));
  }

  @Test
  public void testValidMaxValueOfDouble() {
    Double maxValue = 10.0;
    exceptionValidator.validateMaxValue(maxValue);
  }

  @Test
  public void testMaxValueWithNullDouble() {
    Double maxValue = null;
    assertThrows(IllegalArgumentException.class, () -> exceptionValidator.validateMaxValue(maxValue));
  }

  @Test
  public void testValidMinLessThanOrEqualMax() {
    Integer minValue = 0;
    Integer maxValue = 10;
    exceptionValidator.validateMinLessThanOrEqualMax(minValue, maxValue);
  }

  @Test
  public void testInvalidateMinLessThanOrEqualMax() {
    Integer minValue = 10;
    Integer maxValue = 0;
    assertThrows(IllegalArgumentException.class, () -> exceptionValidator.validateMinLessThanOrEqualMax(minValue, maxValue));
  }

  @Test
  public void testValidPositiveSeed() {
    Long seed = 12345L;
    exceptionValidator.validateSeed(seed);
  }

  @Test
  public void testInvalidNegativeSeed() {
    Long seed = -1L;
    assertThrows(IllegalArgumentException.class, () -> exceptionValidator.validateSeed(seed));
  }

  @Test
  public void testValidPositiveCount() {
    Integer count = 5;
    exceptionValidator.validateCount(count);
  }

  @Test
  public void testInvalidNegativeCount() {
    Integer count = -1;
    assertThrows(IllegalArgumentException.class, () -> exceptionValidator.validateCount(count));
  }

  @Test
  public void testValidSupportedDataType() {
    Class<Integer> dataType = Integer.class;
    exceptionValidator.validateSupportedDataType(dataType);
  }

  @Test
  public void testInvalidSupportedDataType() {
    Class<?> dataType = Double.class;
    assertThrows(IllegalArgumentException.class, () -> {
        exceptionValidator.validateSupportedDataType(dataType);
    });
  }
}
