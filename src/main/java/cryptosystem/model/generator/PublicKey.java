package cryptosystem.model.generator;

import java.math.BigInteger;

public class PublicKey implements Key {
    private KeyPairGenerator keyPair;
    private BigInteger publicExponent;
    private BigInteger publicKey;

    public PublicKey (BigInteger publicExponent) {
        super(modulus, phi);
        this.publicExponent = publicExponent;
    }

    public BigInteger getPublicKey() {
        return publicKey;
    }

    public BigInteger getPublicExponent() {
        return publicExponent;
    }

    @Override
    public BigInteger computeExponent() {
        phi = keypPair.getPhi();
        greatestCommonDivisor = gcd(publicExponent, phi) == 1;
        for (publicExponent = 2; publicExponent < phi; publicExponent++) {
            if (greatestCommonDivisor) {
                return publicExponent;
            }
        }
    }
}