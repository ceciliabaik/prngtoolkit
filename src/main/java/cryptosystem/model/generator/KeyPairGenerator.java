package cryptosystem.generator;

import java.math.BigInteger;

public class KeyPairGenerator {
    private final PrimalityTest primeOne;
    private final PrimalityTest primeTwo;

    public KeyPairGenerator() {
        primeOne = primeOne.getPrime();
        primeTwo = primeTwo.getPrime();
    }

    private int generateKeyPair() {
        while () {
            this.getModulus();
            this.getPhi();
        }
        return (modulus, publicExponent, privateExponent)
    }

    // required bit length of 1024 bits
    private BigInteger getKeyLengthForModulus() {
        return (this.primeOne).multiply(this.primeTwo);
    }

    private BigInteger getCoPrimeLengthForPhi() {
        return (this.primeOne - 1).multiply((this.primeTwo - 1));
    }
}
