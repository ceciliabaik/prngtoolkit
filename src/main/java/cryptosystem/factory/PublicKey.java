package cryptosystem.factory;

import java.math.BigInteger;

/**
 * @author Cecilia Baik
 */
public class PublicKey implements Key {
    private KeyComponent keyComponent;
    private final BigInteger type;

    public PublicKey (BigInteger exponent, BigInteger modulus) {
        type = new KeyComponent(exponent, modulus);
    }

    @Override
    public void createKey() {
        BigInteger exponent = keyComponent.getExponent();
        BigInteger modulus = keyComponent.getModulus();
        type = new KeyComponent(exponent, modulus);
    }

    @Override
    public BigInteger getType() {
        return type;
    }
}

