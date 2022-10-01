package cryptosystem.controller;

import cryptosystem.model.Cipher;
import cryptosystem.model.PaddingScheme;
import cryptosystem.model.factory.KeyFactory;
import cryptosystem.model.factory.KeyType;
import cryptosystem.model.factory.PrivateKey;
import cryptosystem.model.factory.PublicKey;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * @author Cecilia Baik
 */
public class CryptoDemoApp {
    public static void main(String[] args) throws Exception {
        Cipher cipher = new Cipher();
        PublicKey publicKey = new PublicKey();
        PrivateKey privateKey = new PrivateKey();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a message to be encrypted");
        String message = scanner.nextLine();
        System.out.println("Message to be encrypted:" + message);
        scanner.close();

        BigInteger encodedMessage = PaddingScheme.convertStringToBytes(message);

        System.out.println(KeyFactory.buildKey(KeyType.PUBLIC));
        System.out.println(KeyFactory.buildKey(KeyType.PRIVATE));

        assert encodedMessage != null;
        cipher.encrypt(encodedMessage);
        System.out.println("Encrypted message:" + cipher.getCiphertext());

        cipher.decrypt(cipher.getCiphertext());
        System.out.println("Decrypted message:" + cipher.getPlaintext().toString());
    }
}
