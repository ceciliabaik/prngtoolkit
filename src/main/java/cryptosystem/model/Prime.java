package cryptosystem.model.prime;

import java.math.BigInteger;
import java.security.SecureRandom;

public class Prime {
    private BigInteger value;

    public Prime() {
        generateRandom();
    }

    public BigInteger getValue() {
        return value;
    }

    private void generateRandom () {
        BigInteger bitLength = 1024;
        value = BigInteger.probablePrime(bitLength, new SecureRandom());
    }
}




