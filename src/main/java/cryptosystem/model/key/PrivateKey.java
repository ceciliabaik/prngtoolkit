package cryptosystem.model.key;

import java.math.BigInteger;

/**
 * @author Cecilia Baik
 */
public class PrivateKey extends Key {

    public PrivateKey(BigInteger exponent, BigInteger modulus) {
        super(exponent, modulus);
    }

    @Override
    public BigInteger getExponent() {
        return super.getExponent();
    }
}


