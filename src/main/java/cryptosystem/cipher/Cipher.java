package cryptosystem.cipher;

import cryptosystem.model.key.PrivateKey;
import cryptosystem.model.key.PublicKey;

import java.math.BigInteger;

public class Cipher {
    private BigInteger plaintext;
    private BigInteger ciphertext;

    public Cipher() {}

    public BigInteger encrypt(BigInteger message, PublicKey publicKey) {
        BigInteger publicExponent = publicKey.getExponent();
        BigInteger modulus = publicKey.getModulus();
        ciphertext = message.modPow(publicExponent, modulus);
        return ciphertext;
    }

    public BigInteger decrypt(BigInteger encryptedMessage, PrivateKey privateKey) {
        BigInteger privateExponent = privateKey.getExponent();
        BigInteger modulus = privateKey.getModulus();
        plaintext = encryptedMessage.modPow(privateExponent, modulus);
        return plaintext;
    }

    public BigInteger getPlaintext() {
        return plaintext;
    }

    public BigInteger getCiphertext() {
        return ciphertext;
    }
}
