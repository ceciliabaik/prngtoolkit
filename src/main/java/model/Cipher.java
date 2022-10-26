package model;

import java.math.BigInteger;

public class Cipher {
    private BigInteger plaintext;
    private BigInteger ciphertext;

    public Cipher(BigInteger plaintext, BigInteger ciphertext) {
        this.plaintext = plaintext;
        this.ciphertext = ciphertext;
    }

    public void encrypt(BigInteger message, PublicKey publicKey) {
        BigInteger publicExponent = publicKey.getExponent();
        BigInteger modulus = publicKey.getModulus();
        ciphertext = message.modPow(publicExponent, modulus);
    }

    public void decrypt(BigInteger encryptedMessage, PrivateKey privateKey) {
        BigInteger privateExponent = privateKey.getExponent();
        BigInteger modulus = privateKey.getModulus();
        plaintext = encryptedMessage.modPow(privateExponent, modulus);
    }

    public BigInteger getPlaintext() {
        return plaintext;
    }

    public BigInteger getCiphertext() {
        return ciphertext;
    }
}
