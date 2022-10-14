package cryptosystem;

import cryptosystem.cipher.Cipher;
import cryptosystem.controller.SystemController;
import cryptosystem.model.key.KeyGenerator;
import cryptosystem.model.key.PrivateKey;
import cryptosystem.model.key.PublicKey;
import cryptosystem.scheme.PaddingScheme;
import cryptosystem.view.ConsoleUI;

import java.io.IOException;
import java.math.BigInteger;

/**
 * Responsible for starting the application.
 *
 * @author Cecilia Baik
 */
public class RSACryptosystemDemo {
    protected final ConsoleUI userInterface;

    public RSACryptosystemDemo() {
        userInterface = new ConsoleUI();
    }

    private void init() {
        do {
            userInterface.promptForInputToEncrypt();

        } while (true);
    }

    public static void main(String[] args) throws Exception {

        RSACryptosystemDemo cryptosystem = new RSACryptosystemDemo();
        cryptosystem.init();

        ConsoleUI userInterface = new ConsoleUI();

        SystemController controller = new SystemController();
        controller.start();

        PaddingScheme paddingScheme = new PaddingScheme();
        String inputMessage = userInterface.getInputMessage();
        paddingScheme.convertStringToBytes(inputMessage);
        String message = paddingScheme.getEncodedMessage();

        // Generates the key pair of public key and private key.
        userInterface.promptForBitLength();
        KeyGenerator generator = new KeyGenerator();
        generator.generateKeyPair();
        PublicKey publicKey = generator.getPublicKey();
        PrivateKey privateKey = generator.getPrivateKey();

        // Encrypts and decrypts the input message.
        Cipher cipher = new Cipher();
        cipher.encrypt(message, publicKey);
        BigInteger encryptedMessage = cipher.getCiphertext();
        cipher.decrypt(encryptedMessage, privateKey);

        System.out.println("The encrypted message: " + cipher.getCiphertext());
        System.out.println("The decrypted message: " + cipher.getPlaintext());
    }
}
