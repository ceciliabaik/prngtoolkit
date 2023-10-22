// package l1.rngtoolkit.generators;

// import org.junit.jupiter.api.BeforeEach;
// import org.junit.jupiter.api.Test;
// import static org.junit.jupiter.api.Assertions.*;
// import l1.prngtoolkit.generators.MersenneTwisterGenerator;

// public class MersenneTwisterGeneratorTest {
//   private MersenneTwisterGenerator<Integer> intGenerator;
//   private MersenneTwisterGenerator<Double> doubleGenerator;

//   @BeforeEach
//   public void setup() {
//     intGenerator = new MersenneTwisterGenerator<>(Integer.class);
//     doubleGenerator = new MersenneTwisterGenerator<>(Double.class);
//   }

//   @Test
//   public void testGenerateNextValueForInteger() {
//     Integer value = intGenerator.nextInt();
//     assertNotNull(value);
//     assertTrue(value instanceof Integer);
//   }

//   @Test
//   public void testGenerateNextValueForDouble() {
//     Double value = doubleGenerator.nextDouble();
//     assertNotNull(value);
//     assertTrue(value instanceof Double);
//   }

//   @Test
//   public void testGenerateNextValueUnsupportedDataType() {
//     // Attempt to generate for an unsupported data type (String in this case)
//     MersenneTwisterGenerator<String> stringGenerator = new MersenneTwisterGenerator<>(String.class);
//     assertThrows(UnsupportedOperationException.class, stringGenerator::generateNextValue);
//   }

//   @Test
//   public void testGenerateNextValueWithSeedForInteger() {
//     long seed = 12345L;
//     MersenneTwisterGenerator<Integer> generator = new MersenneTwisterGenerator<>(Integer.class, seed);
//     Integer value = generator.generateNextValue();
//     assertNotNull(value);
//   }

//   @Test
//   public void testGenerateNextValueWithSeedForDouble() {
//     long seed = 54321L;
//     MersenneTwisterGenerator<Double> generator = new MersenneTwisterGenerator<>(Double.class, seed);
//     Double value = generator.generateNextValue();
//     assertNotNull(value);
//   }

//   @Test
//   public void testGenerateNextValueWithInvalidSeed() {
//     long invalidSeed = -1L;
//     assertThrows(IllegalArgumentException.class, () -> new MersenneTwisterGenerator<>(Integer.class, invalidSeed));
//   }
// }
