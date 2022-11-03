package model.key;

import java.math.BigInteger;

public class KeyDirector extends KeyBuilder {

    private PublicKeyBuilder publicKey;
    private PrivateKeyBuilder privateKey;
    KeyBuilder keyBuilder;

    public KeyDirector() {
        publicKey = new PublicKeyBuilder(getPublicExponent(), getModulus());
        privateKey = new PrivateKeyBuilder(getPrivateExponent());
    }

    public construct(boolean isPrime) {
        keyBuilder.buildPrime();
        keyBuilder.buildModulus();
        keyBuilder.buildPhi();
        keyBuilder.buildExponent();
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

    public PublicKeyBuilder getPublicKey() {
        return publicKey;
    }

    public PrivateKeyBuilder getPrivateKey() {
        return privateKey;
    }

    @Override
    public Key getResult() {
        return null;
    }
}
