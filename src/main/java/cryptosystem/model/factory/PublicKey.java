package cryptosystem.model.factory;

import java.math.BigInteger;

/**
 * @author Cecilia Baik
 */
public class PublicKey implements Key {
    private BigInteger publicExponent;

    public PublicKey () { }

    public BigInteger getPublicExponent() {
        return publicExponent;
    }
}