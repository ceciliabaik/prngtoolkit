package cryptosystem.crypto;

import cryptosystem.model.key.PrivateKey;
import cryptosystem.model.key.PublicKey;

import java.math.BigInteger;

/**
 * @author Cecilia Baik
 */
public class RSACryptosystem implements Cryptosystem {
    private BigInteger plaintext;
    private BigInteger ciphertext;
    private PublicKey publicKey;
    private PrivateKey privateKey;

    public RSACryptosystem(PublicKey publicKey, PrivateKey privateKey) {
        this.publicKey = publicKey;
        this.privateKey = privateKey;
    }

    public RSACryptosystem() {

    }

    public BigInteger encrypt(BigInteger message) {
        BigInteger publicExponent = publicKey.getExponent();
        BigInteger modulus = publicKey.getModulus();
        ciphertext = message.modPow(publicExponent, modulus);
        return ciphertext;
    }

    public BigInteger decrypt(BigInteger ciphertext) {
        BigInteger privateExponent = privateKey.getExponent();
        BigInteger modulus = publicKey.getModulus();
        plaintext = ciphertext.modPow(privateExponent, modulus);
        return plaintext;
    }

    public BigInteger getPlaintext() {
        return plaintext;
    }

    public BigInteger getCiphertext() {
        return ciphertext;
    }
}
