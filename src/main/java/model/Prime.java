package model;

import java.math.BigInteger;
import java.security.SecureRandom;

public class ProbablePrime {
    private int bitLength;
    private BigInteger value;
    private final int MIN_BIT_LENGTH;
    private final int certainty;
    private final SecureRandom random;

    public ProbablePrime() {
        bitLength = 2048 / 2;
        MIN_BIT_LENGTH = bitLength - (bitLength / 2);
        certainty = 100;
        random = new SecureRandom();
    }

    public BigInteger generateRandomCandidate() throws ArithmeticException {
        value = BigInteger.probablePrime(this.getBitLength(), random);
        return value;
    }

    public boolean primalityTestForCandidate(BigInteger candidate) {
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




