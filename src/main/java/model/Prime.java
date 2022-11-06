package model;

import java.math.BigInteger;
import java.security.SecureRandom;

public class Prime {
    private BigInteger value;
    private Bit bit;

    public Prime() {
        generateLargePrime();
    }

    private BigInteger generateLargePrime() {
        value = BigInteger.probablePrime(bit.getBitLength() / 2, new SecureRandom());
        return value;
    }

    /**
     * Returns the last generated probable prime value.
     *
     * @return The probable prime value.
     */
    public BigInteger getValue() {
        return value;
    }
}




