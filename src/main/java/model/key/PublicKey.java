package model.key;

import model.Prime;

import java.math.BigInteger;

public class PublicKeyBuilder implements Key {

    private BigInteger publicExponent;
    private BigInteger modulus;
    protected Prime prime1;
    protected Prime prime2;

    public PublicKeyBuilder(BigInteger publicExponent, BigInteger modulus) {
        this.publicExponent = publicExponent;
        this.modulus = modulus;
        init();
    }

    private void init () {
        while (!isPrimeEven()) {
            prime1 = new Prime();
            prime2 = new Prime();
        }
    }

    private boolean isPrimeEven() {
        if (prime1.getValue().equals(prime2.getValue())) {
            return true;
        }
        return false;
    }

    @Override
    public BigInteger calcExponent() {
        return BigInteger.valueOf(65537);
    }

    public boolean isGreatestCommonDivisor() {
        return calcCoprimeRangeForPhi().gcd(calcExponent()).compareTo(BigInteger.ONE) > 0;
    }

    public boolean isLessThanPhiAndGreaterThanOne() {
        return calcExponent().compareTo(BigInteger.ONE) > 0;
    }

    public BigInteger calcKeyLengthForModulus() {
        return prime1.getValue().multiply(prime2.getValue());
    }

    public BigInteger calcCoprimeRangeForPhi() {
        BigInteger subtractedPrime1 = prime1.getValue().subtract(BigInteger.ONE);
        BigInteger subtractedPrime2 = prime2.getValue().subtract(BigInteger.ONE);
        return (subtractedPrime1).multiply(subtractedPrime2);
    }
}

