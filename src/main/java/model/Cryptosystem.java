package model;

import java.math.BigInteger;

public class Cryptosystem {

    public void generateKeyPair() {
        KeyGenerator keyGenerator = new KeyGenerator(2048);
        keyGenerator.generateKeyPair();
    }

    public BigInteger encrypt(BigInteger plaintext, PublicKey publicKey) {
        return plaintext.modPow(publicKey.getPublicExponent(), publicKey.getModulus());
    }

    public BigInteger decrypt(BigInteger ciphertext, PrivateKey privateKey) {
        return ciphertext.modPow(privateKey.getPrivateExponent(), privateKey.getModulus());
    }
}
