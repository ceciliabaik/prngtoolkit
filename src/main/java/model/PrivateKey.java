package model.key;

import java.math.BigInteger;

public class PrivateKey extends Key {
    private final PublicKey publicKey;

    public PrivateKey(BigInteger exponent, BigInteger modulus, PublicKey publicKey) {
        super(exponent, modulus);
        this.publicKey = publicKey;
        setExponent(BigInteger.valueOf(0));
        setModulus(BigInteger.valueOf(0));
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
        modulus = publicKey.getModulus();
        super.setModulus(modulus);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}


