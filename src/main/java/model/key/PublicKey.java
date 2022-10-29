package model;

import java.math.BigInteger;

public class PublicKey extends Key implements Modulus {
    private BigInteger exponent;

    public PublicKey(BigInteger exponent) {
        super(exponent);
    }

    @Override
    protected BigInteger calculateExponent() {
        while (isGreatestCommonDivisor() && isLessThanPhiAndGreaterThanOne()) {
            exponent = BigInteger.valueOf(65537);
        }
        return exponent;
    }

    @Override
    public BigInteger calculateKeyLengthForModulus() {
        return prime1.getValue().multiply(prime2.getValue());
    }

    @Override
    public boolean isGreatestCommonDivisor() {
        return phi.gcd(calcExponent()).compareTo(BigInteger.ONE) > 0;
    }

    @Override
    public boolean isLessThanPhiAndGreaterThanOne() {
        return this.getExponent().compareTo(BigInteger.ONE) > 0;
    }
}

