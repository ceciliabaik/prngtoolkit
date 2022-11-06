package model;

import java.math.BigInteger;

public class PublicKey {
    private BigInteger publicExponent;
    private BigInteger modulus;
    private BigInteger phi;

    public PublicKey() {
        publicExponent = BigInteger.valueOf(65537);
    }

    public BigInteger calcExponent() {
        while (!isCoprimeToPhi()) {
            publicExponent = publicExponent.add(BigInteger.ONE);
        }
        return publicExponent;
    }

    public boolean isCoprimeToPhi() {
        if (isGcdEqualOne() && isLessThanPhi()) {
            return true;
        }
        return false;
    }

    private boolean isGcdEqualOne() {
        return phi.gcd(publicExponent).compareTo(BigInteger.ONE) == 0;
    }

    private boolean isLessThanPhi() {
        return (publicExponent.compareTo(phi) < 0 && publicExponent.compareTo(BigInteger.ONE) > 0);
    }

    public BigInteger calcKeyLengthFoModulus(Prime prime1, Prime prime2) {
        modulus = prime1.getValue().multiply(prime2.getValue());
        return modulus;
    }

    public BigInteger calcCoprimeRangeForPhi(Prime prime1, Prime prime2) {
        BigInteger subtractedPrime1 = prime1.getValue().subtract(BigInteger.ONE);
        BigInteger subtractedPrime2 = prime2.getValue().subtract(BigInteger.ONE);
        phi = (subtractedPrime1).multiply(subtractedPrime2);
        return phi;
    }

    public BigInteger getPublicExponent() {
        return publicExponent;
    }

    public BigInteger getModulus() {
        return modulus;
    }

    public BigInteger getPhi() {
        return phi;
    }
}
