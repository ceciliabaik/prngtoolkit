package cryptosystem.model.factory;

import java.math.BigInteger;

/**
 * @author Cecilia Baik
 */
public class PrivateKey extends Key {
    private BigInteger privateKey;
    private BigInteger privateExponent;

    public PrivateKey(KeyType modulus, BigInteger privateExponent, BigInteger privateKey) {
        super(modulus);
        this.privateExponent = privateExponent;
        this.privateKey = privateKey;
    }

    public PrivateKey() {}

    public BigInteger getPrivateKey() {
        return privateKey;
    }

    @Override
    protected void construct() {
    }

    public BigInteger getPrivateExponent() {
        return privateExponent;
    }

    public void setPrivateExponent(BigInteger privateExponent) {
        this.privateExponent = privateExponent;
    }
}


