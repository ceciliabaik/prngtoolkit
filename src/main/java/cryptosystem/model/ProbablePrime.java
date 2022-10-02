package cryptosystem.model;

import java.math.BigInteger;
import java.security.SecureRandom;

/**
 * @author Cecilia Baik
 */
public class ProbablePrime {
    private int bitLength;
    private BigInteger value;
    private final int MIN_BIT_LENGTH;

    public ProbablePrime() {
        bitLength = 2014 / 2; // Generate random bit length.
        MIN_BIT_LENGTH = (bitLength * 2) - bitLength;
    }

    public BigInteger getRandomCandidate() throws ArithmeticException {
        SecureRandom random = new SecureRandom();
        value = BigInteger.probablePrime(getBitLength() , random);
        return value;
    }

    private boolean candidateToBeTestedForPrimality(BigInteger candidate) {
        int certainty = 1;
        return candidate.isProbablePrime(certainty);
    }

    /**
     * Returns the last generated prime value.
     */
    public BigInteger getValue() {
        return value;
    }

    public int getBitLength() {
        return bitLength;
    }

    public void setBitLength(int bitLength) {
        this.bitLength = Math.max(bitLength, MIN_BIT_LENGTH);
    }
}




