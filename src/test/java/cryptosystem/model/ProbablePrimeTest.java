package cryptosystem.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ProbablePrimeTest {

    private final ProbablePrime prime = new ProbablePrime();

    @Test
    @DisplayName("Constructs a random probable prime of approximately 512 bits")
    void testProbablePrimeConstruction() {
        Assertions.assertEquals(512, prime.generateRandom());
    }

    @Test
    @DisplayName("Constructs a random probable prime of approximately 512 bits")
    void testProbablePrimeGetValue() {
        prime.generateRandom();
        Assertions.assertEquals(456, prime.getValue());
    }
}