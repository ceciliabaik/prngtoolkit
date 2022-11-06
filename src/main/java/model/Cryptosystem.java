package model;

import java.math.BigInteger;

public class Cryptosystem {
    private BigInteger ciphertext;
    private BigInteger plaintext;

    public BigInteger encrypt(BigInteger message, PublicKey publicKey) {
        ciphertext = message.modPow(publicKey.getPublicExponent(), publicKey.getModulus());
        return ciphertext;
    }

    public BigInteger decrypt(BigInteger encryptedMessage, PrivateKey privateKey) {
        plaintext = encryptedMessage.modPow(privateKey.getPrivateExponent(), privateKey.getModulus());
        return plaintext;
    }

    public BigInteger getCiphertext() {
        return ciphertext;
    }

    public BigInteger getPlaintext() {
        return plaintext;
    }
}
