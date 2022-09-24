package cryptosystem;

import java.lang.Math;

public class Encryptor {
    PaddingScheme paddingScheme;
    private BigInteger message;
    private BigInteger ciphertext;

    public Encryptor() {
        message = paddingScheme.getEncodedMessage();
    }

    public BigInteger getCiphertext() {
        return ciphertext;
    }

    public void encrypt() {
        ciphertext = message.pow(key.getPublicExponent()) % key.getModulus();
    }
}