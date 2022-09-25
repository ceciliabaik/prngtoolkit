package cryptosystem.model;

import java.math.BigInteger;
import java.security.SecureRandom;

/**
 * @author Cecilia Baik
 */
public class ProbablePrime {
    SecureRandom random;
    private BigInteger value;

    public ProbablePrime() {
        random = new SecureRandom();
        generateRandom();
    }

    /**
     * Returns the last generated value.
     *
     * @return the last generated value.
     */
    public BigInteger getValue() {
        return value;
    }

    /**
     * Generates a random of strong probable prime of bit length 1024 / 2.
     *
     * @return a random probable prime of bit length 1024 / 2.
     */
    private BigInteger generateRandom () {
        BigInteger bitLength = 1024 / 2;
        do {
            value = BigInteger.probablePrime((bitLength, random);
            return value;
        } while (value.isProbablePrime());
    }

    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;
        Prime prime = (Prime) object;
        return java.util.Objects.equals(random, prime.random) && java.util.Objects.equals(value, prime.value);
    }

    public int hashCode() {
        return Objects.hash(super.hashCode(), random, value);
    }
}




