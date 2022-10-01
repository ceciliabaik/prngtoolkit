package cryptosystem;

import java.math.BigInteger;

public class Decryptor {
    Encryptor encryptor;
    private BigInteger plaintext;

    public Decryptor() {
    }

    public BigInteger decrypt() {
        plaintext = message.modPow(privateExponent, modulus);
        return plaintext;
    }

    public BigInteger getPlaintext() {
        return plaintext;
    }
}
