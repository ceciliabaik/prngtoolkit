package model;

import java.math.BigInteger;

public class PrivateKey extends Key {

    public PrivateKey(BigInteger exponent) {
        super(exponent);
    }

    @Override
    protected BigInteger calculateExponent() {
        BigInteger publicKey = BigInteger.valueOf(65537);
        return publicKey.modInverse(phi);
    }
}


