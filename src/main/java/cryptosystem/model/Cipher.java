package cryptosystem.model;

import cryptosystem.model.factory.PrivateKey;
import cryptosystem.model.factory.PublicKey;

import java.math.BigInteger;

public class Cipher {
    private PublicKey publicKey;
    private PrivateKey privateKey;
    private BigInteger plaintext;
    private BigInteger ciphertext;

    public Cipher(BigInteger plaintext, BigInteger ciphertext, PublicKey publicKey) {
        privateKey = new PrivateKey();
        this.publicKey = publicKey;
        this.plaintext = plaintext;
        this.ciphertext = ciphertext;
    }

    public Cipher() {}

    public void encrypt(BigInteger message) {
        BigInteger publicExponent = publicKey.getPublicExponent();
        BigInteger modulus = publicKey.getModulus();
        ciphertext = message.modPow(publicExponent, modulus);
    }

    public void decrypt(BigInteger encryptedMessage) {
        BigInteger privateExponent = privateKey.getPrivateExponent();
        BigInteger modulus = publicKey.getModulus();
        plaintext = encryptedMessage.modPow(privateExponent, modulus);
    }

    public BigInteger getPlaintext() {
        return plaintext;
    }

    public BigInteger getCiphertext() {
        return ciphertext;
    }
}
