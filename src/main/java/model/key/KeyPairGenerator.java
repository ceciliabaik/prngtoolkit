package model.key;

import java.math.BigInteger;

public class KeyPairGenerator {

    private PublicKey publicKey;
    private PrivateKey privateKey;

    public KeyPairGenerator() {
        publicKey = new PublicKey(getPublicExponent(), getModulus());
        privateKey = new PrivateKey(getPrivateExponent());
    }

    public BigInteger getModulus() {
        return publicKey.calcKeyLengthForModulus();
    }

    public BigInteger getPublicExponent() {
        return publicKey.calcExponent();
    }

    public BigInteger getPrivateExponent() {
        return privateKey.calcExponent();
    }

    public PublicKey getPublicKey() {
        return publicKey;
    }

    public PrivateKey getPrivateKey() {
        return privateKey;
    }
}
