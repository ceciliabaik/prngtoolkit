package cryptosystem.model.prime;

import java.math.BigInteger;
import java.security.SecureRandom;

/**
 * Represents a strong probable prime.
 *
 * @author Cecilia Baik
 */
public class ProbablePrime {
    private int bitLength;
    private BigInteger value;
    private final int MIN_BIT_LENGTH;

    public ProbablePrime() {
        bitLength = 1024 / 2;
        MIN_BIT_LENGTH = bitLength - (bitLength / 2);
    }

    public BigInteger generateRandomCandidate() throws ArithmeticException {
        SecureRandom random = new SecureRandom();
        value = BigInteger.probablePrime(bitLength, random);
        return value;
    }

    public boolean candidateToBeTestedForPrimality(BigInteger candidate) {
        int certainty = 100;
        return candidate.isProbablePrime(certainty);
    }

    public int getBitLength() {
        return bitLength;
    }

    public void setBitLength(int bitLength) {
        this.bitLength = Math.max(bitLength, MIN_BIT_LENGTH);
    }

    /**
     * Returns the last generated probable prime value.
     */
    public BigInteger getValue() {
        return value;
    }
}




