package cryptosystem.model.generator;

import java.math.BigInteger;

public class PrivateKey implements Key {
    private PublicKey publicKey;
    private BigInteger privateKey;

    private PrivateKey(BigInteger privateExponent) {
        super(modulus, phi);
        this.privateExponent = privateExponent;
        publicKey = new PublicKey();
    }

    public getPrivateKey() {
        return privateKey;
    }

    @Override
    public BigInteger computeExponent() {
        return BigInteger publicExponent.pow(publicExponent, -1) % phi; // extended eucledian algorithm
    }

    private BigInteger findGreatestCommonDivisor(primeOne, primeTwo) {
        greatestCommonDivisor = gcd(primeTwo, primeOne.mod(primeTwo);
        return primeTwo.equals(0) ? primeOne : greatestCommonDivsior);
    }

    private BigInteger findExtendedGreatestCommonDivisor() {
    }
}