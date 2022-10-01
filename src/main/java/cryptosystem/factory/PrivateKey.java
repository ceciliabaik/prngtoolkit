package cryptosystem.factory;

import java.math.BigInteger;

/**
 * @author Cecilia Baik
 */
public class PrivateKey implements Key {
    private KeyComponent keyComponent;
    private final BigInteger type;

    public PrivateKey(BigInteger type) {
        this.type = type;
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


