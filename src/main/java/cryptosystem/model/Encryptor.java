package cryptosystem;

import java.lang.Math;

/**
 * @author Cecilia Baik
 */
public class Encryptor {
    private PaddingScheme padding;
    private PublicKey publicKey;
    private byte[] message;
    private BigInteger modulus;
    private BigInteger ciphertext;

    public Encryptor() {
        message = padding.getEncodedMessage();
    }

    private BigInteger reduceMessageToSingleNumber() {
        message =
    }

    public void encrypt() {
        ciphertext = message.modPow(publicKey, modulus);
    }

    public BigInteger getCiphertext() {
        return ciphertext;
    }
}