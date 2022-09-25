package cryptosystem.model;

import java.lang.Math;

/**
 * @author Cecilia Baik
 */
public class Decryptor {
    PaddingScheme paddingScheme;

    public Decryptor() {
        privateKey = new PrivateKey();
        encryptedMessage = encryptor.getPlaintext();
    }

    public BigInteger decrypt() {
        plaintext = encryptedMessage.modPow(privateKey, modulus);
    }

    public String getPlaintext() {
        return plaintext;
    }
}c