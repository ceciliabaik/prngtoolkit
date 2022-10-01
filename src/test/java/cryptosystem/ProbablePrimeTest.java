package cryptosystem.model;

import cryptosystem.model.ProbablePrime;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.math.BigInteger;

class ProbablePrimeTest {

    private final ProbablePrime prime = new ProbablePrime();

    @Test
    @DisplayName("Generates a random probable prime")
    void testGenerateRandomProbablePrime() {
        BigInteger probablePrime = prime.getRandomCandidateOfProbablePrime();
        System.out.println("Probable prime is: " + probablePrime);
    }
}