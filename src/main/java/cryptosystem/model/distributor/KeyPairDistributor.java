package cryptosystem.model.distributor;

import java.math.BigInteger;

public class Cryptosystem {
    private ASCIIConverter converter;
    private KeyPairGenerator keyPair;
    private PublicKey publicKey;
    private PrivateKey privateKey;

    public KeyPairDistributor() {
        publicKey = new PublicKey();
        privateKey = new PrivateKey();
    }

    public BigInteger encrypt() {
        return this.getCiphertext();
    }

    public BigInteger decrypt() {
        return this.getPlaintext();
    }

    private BigInteger encodeMessage(BigInteger message) {
        const ciphertext = message.pow(publicExponent) % modulus;
        return ciphertext;
    }

    private BigInteger getPlaintext(BigInteger encryptedMessage) {
        const plaintext = encryptedMessage.pow(privateExponent) % modulus;
        return plaintext;
    }
}





















