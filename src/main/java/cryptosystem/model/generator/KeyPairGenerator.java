package cryptosystem.model.generator;

import java.math.BigInteger;

public class KeyPairGenerator {
    private Prime primeOne;
    private Prime primeTwo;
    private BigInteger modulus;
    private BigInteger phi;

    public KeyPairGenerator() {
        primeOne = new Prime();
        primeTwo = new Prime();
    }

    public BigInteger getModulus() {
        return modulus;
    }

    public BigInteger getPhi() {
        return phi;
    }

    private void generateKeyPair() {
        do {
            primeOne.getValue();
            primeTwo.getValue();
            getKeyLengthForModulus();
            getCoprimeRangeForPhi();
        } while (BigInteger.isProbablePrime());
    }

    // required bit length of 1024 bits
    private BigInteger getKeyLengthForModulus() {
        modulus = (primeOne).multiply(primeTwo);
        return modulus;
    }

    private BigInteger getCoprimeRangeForPhi() {
        phi = (primeOne - 1).multiply((primeTwo - 1));
        return phi;
    }
}
