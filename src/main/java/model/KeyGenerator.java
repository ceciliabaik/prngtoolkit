package controller;

import model.Prime;

import java.math.BigInteger;

public class KeyGenerator {
    private final Prime prime1;
    private final Prime prime2;

    public KeyGenerator() {
        prime1 = new Prime();
        prime2 = new Prime();
        while (!isPrimeEven()) {
            this.computeKeyLengthForModulus();
            this.computeCoprimeRangeForPhi();
            getPublicExponent();
            getPrivateExponent();
        }
    }

    private boolean isPrimeEven() {
        return prime1.getValue().equals(prime2.getValue());
    }

    private BigInteger computeKeyLengthForModulus() throws ArithmeticException {
        return prime1.getValue().multiply(prime2.getValue());
    }

    private BigInteger computeCoprimeRangeForPhi() throws ArithmeticException {
        BigInteger subtractedPrime1 = prime1.getValue().subtract(BigInteger.ONE);
        BigInteger subtractedPrime2 = prime2.getValue().subtract(BigInteger.ONE);
        phi = (subtractedPrime1).multiply(subtractedPrime2);
        return phi;
    }

    public BigInteger getPublicExponent() {
        return publicKey.calcExponent();
    }

    public BigInteger getPrivateExponent() {
        return privateKey.calcExponent();
    }
}
