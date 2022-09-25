package cryptosystem.model.factory;

import java.math.BigInteger;

/**
 * @author Cecilia Baik
 */
public class PrivateKey implements Key {
    private BigInteger privateExponent;

    public PrivateKey() {}

    public BigInteger getPrivateExponent() {
        return privateExponent;
    }
}