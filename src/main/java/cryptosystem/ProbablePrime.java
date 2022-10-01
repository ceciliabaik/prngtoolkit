package cryptosystem;

import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.Objects;

/**
 * This class generates strong probable prime numbers.
 *
 * @author Cecilia Baik
 */
public class ProbablePrime extends BigInteger {
    private final SecureRandom random;
    private final int bitLength;
    private final int certainty;

    public ProbablePrime() {
        super("0");
        random = new SecureRandom();
        bitLength = 512;
        certainty = 1;
    }

    public BigInteger getRandomCandidateOfProbablePrime() throws ArithmeticException {
        return BigInteger.probablePrime(bitLength, random);
    }

    private boolean candidateToBeTestedForPrimality(BigInteger candidate) {
        return candidate.isProbablePrime(certainty);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ProbablePrime that = (ProbablePrime) o;
        return bitLength == that.bitLength && certainty == that.certainty && Objects.equals(random, that.random);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), random, bitLength, certainty);
    }
}




