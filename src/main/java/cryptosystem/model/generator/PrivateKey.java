package cryptosystem.generator;

public class PrivateKey implements Key {
    private BigInteger privateExponent;

    private PrivateKey(BigInteger privateExponent) {
        super(primeOne, primeTwo);
        this.privateExponent = privateExponent;
    }

    @Override
    public BigInteger getExponent() {
        return BigInteger publicExponent.pow(this.publicExponent, -1) % phi; // extended eucledian algorithm
    }

    private BigInteger findGreatestCommonDivisor(primeOne, primeTwo) {
        return primeTwo.equals(0) ? primeOne : gcd(primeTwo, primeOne.mod(primeTwo));
    }
}