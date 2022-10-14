package cryptosystem.model.key;

import java.math.BigInteger;

public abstract class Key {
    private BigInteger exponent;
    private BigInteger modulus;

    public Key(BigInteger exponent, BigInteger modulus) {
        setExponent(exponent);
        setModulus(modulus);
    }

    public abstract BigInteger generate();

    public BigInteger getExponent() {
        return exponent;
    }

    public void setExponent(BigInteger exponent) {
        this.exponent = exponent;
    }

    public BigInteger getModulus() {
        return modulus;
    }

    public void setModulus(BigInteger modulus) {
        this.modulus = modulus;
    }

    @Override
    public String toString() {
        return "Key{" +
                "exponent=" + exponent +
                ", modulus=" + modulus +
                '}';
    }
}
