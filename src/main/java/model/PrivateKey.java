package model;

import java.math.BigInteger;

public class PrivateKey extends PublicKey {
    private BigInteger privateExponent;

    public BigInteger calcExponent(PublicKey publicKey) {
        privateExponent = publicKey.getPublicExponent().modInverse(publicKey.getPhi());
        return privateExponent;
   }

    public BigInteger getPrivateExponent() {
        return privateExponent;
    }
}
