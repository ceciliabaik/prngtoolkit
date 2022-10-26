package model.prime;

import model.Prime;
import org.junit.jupiter.api.Test;

import java.math.BigInteger;

class ProbablePrimeTest {

    private final Prime prime = new Prime();

    @Test
    void testProbablePrime1Construction() {
        System.out.println("Probable prime1 is: " + prime.getValue());
    }

    @Test
    void testForPrimality() {
        BigInteger candidate = prime.getValue();
        boolean prime2 = prime.primalityTestForCandidate(candidate);
        System.out.println("Probable prime2 is: " + prime2 + prime.getValue());
    }

    // @Test
    // void testBitLength() {
        // prime.generateRandomCandidate();
    // }
}