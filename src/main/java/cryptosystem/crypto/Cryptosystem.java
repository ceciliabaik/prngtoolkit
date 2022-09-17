package cryptosystem.crypto;

/**
 * Represents a RSA encryption system.
 *
 * @version     1.0.0 17 September 2022
 * @author      Cecilia Baik
 */
public class Cryptosystem {
    private String plainText;
    private int cipherText;
    private KeyPair publicKey;
    private KeyPair privateKey;

    public Cryptosystem(String plainText, int cipherText) {
        this.plainText = plainText;
        this.cipherText = cipherText;
    }

    public int encrypt() {
        return this.performEncryption();
    }

    public int decrypt() {
        return this.performDecryption();
    }

    private int performEncryptionOfPlainText(PublicKey publicKey, String plainText) {
        int publicKey = publicKey.getPublicExponent();
        int modulus = publicKey.getModulus()
        int encryptedMessage =  Math.pow(this.plainText, publicKey) % modulus;
        return encryptedMessage;
    }

    private int performDecryptionOfCipherText(PrivateKey privateKey , int cipherText) {
        int privateExponent =  privateKey.getPrivateExponent()
        int modulus = privateKey.getModulus()
        int decryptedMessage = Math.pow(cipherText, privateExponent) % modulus;
        return decryptedMessage;
    }
}





















