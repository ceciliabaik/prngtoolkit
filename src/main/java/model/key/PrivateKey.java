package model.key;

import java.math.BigInteger;

public class PrivateKeyBuilder implements Key {

    private BigInteger privateExponent;
    protected PublicKeyBuilder publicKey;

    public PrivateKeyBuilder(BigInteger privateExponent) {
        this.privateExponent = privateExponent;
    }

    @Override
    public BigInteger calcExponent() {
        return publicKey.calcExponent().modInverse(publicKey.calcCoprimeRangeForPhi());
    }
}


