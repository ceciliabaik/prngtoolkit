package cryptosystem.model.key;

import java.math.BigInteger;

public class PrivateKey extends Key {

    public PrivateKey(BigInteger exponent, BigInteger modulus) {
        super(exponent, modulus);
    }

    @Override
    public BigInteger generate() {
        return super.getExponent().mod(super.getModulus());
    }

    @Override
    public BigInteger getExponent() {
        return super.getExponent();
    }

    @Override
    public void setExponent(BigInteger exponent) {
        super.setExponent(exponent);
    }

    @Override
    public BigInteger getModulus() {
        return super.getModulus();
    }

    @Override
    public void setModulus(BigInteger modulus) {
        super.setModulus(modulus);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}


