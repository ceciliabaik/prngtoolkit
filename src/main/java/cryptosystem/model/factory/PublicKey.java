package cryptosystem.model.factory;

import java.math.BigInteger;

/**
 * @author Cecilia Baik
 */
public class PublicKey extends Key {
    private BigInteger publicKey;
    private BigInteger modulus;
    private BigInteger publicExponent;

    public PublicKey(BigInteger modulus, BigInteger publicExponent, BigInteger publicKey) {
        super();
        this.modulus = modulus;
        this. publicExponent = publicExponent;
        this.publicKey = publicKey;
        construct();
    }

    public PublicKey() {}

    public BigInteger getPublicKey() {
        return publicKey;
    }

    @Override
    protected void construct() {
    }

    public void setModulus(BigInteger modulus) {
        this.modulus = modulus;
    }

    public BigInteger getModulus() {
        return modulus;
    }

    public void setPublicExponent(BigInteger publicExponent) {
        this.publicExponent = publicExponent;
    }

    public BigInteger getPublicExponent() {
        return publicExponent;
    }
}

