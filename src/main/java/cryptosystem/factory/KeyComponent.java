package cryptosystem.factory;

import java.math.BigInteger;

/**
 * @author Cecilia Baik
 */
public class KeyComponent {
    private final BigInteger exponent;
    private final BigInteger modulus;

    public KeyComponent(BigInteger exponent, BigInteger modulus) {
        this.exponent = exponent;
        this.modulus = modulus;
    }

    public BigInteger getExponent() {
        return exponent;
    }

    public BigInteger getModulus() {
        return modulus;
    }
}
