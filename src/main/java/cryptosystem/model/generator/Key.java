package cryptosystem.model.generator;

import java.math.BigInteger;

public interface Key {
    public BigInteger getPublicKey();
    public BigInteger getPrivateKey();
}