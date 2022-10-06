package cryptosystem.model.key;

import java.math.BigInteger;

/**
 * @author Cecilia Baik
 */
public class PublicKey extends Key {

    public PublicKey(BigInteger exponent, BigInteger modulus) {
        super(exponent, modulus);
    }

    @Override
    public BigInteger getExponent() {
        return super.getExponent();
    }

    @Override
    public BigInteger getModulus() {
        return super.getModulus();
    }

    @Override
    public void setModulus(BigInteger modulus) {
        super.setModulus(modulus);
    }
}

