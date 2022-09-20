package cryptosystem.model.prime;

import java.math.BigInteger;
import java.util.Random;

public class Prime {
    private Random random;
    private BigInteger value;
}

public Prime() {
    random = new Random();
    generateRandomPrime();
}

public BigInteger getValue() {
    return value;
}

private BigInteger generateRandomPrime () {
    BigInteger bitLength = 100;
    value = BigInteger.probablePrime(bitLength, random);
    return value;
}




