package view;

public class CryptoView implements View {
    public void displayWelcomeMessage() {
        System.out.println("-------------------------------");
        System.out.println("Welcome to the RSA Cryptosystem");
        System.out.println("-------------------------------");
    }

    public void promptForBitLength() {
        System.out.println("Enter a bit length of 1024, 2048 or 4096: ");
    }

    public void displayPrivateKey() {

    }

    public void displayCiphertext() {

    }

    public void displayPlaintext() {
    }

    public void displayKeyGenerateMessage() {
        System.out.println("Start generate key pair by using the specified bit length ");
    }

    public void displayPublicKey() {
        System.out.println("The public key");
    }

    public void promptForEncryption() {
        System.out.println("Encrypt");
    }

    public void promptForDecryption() {
        System.out.println("Decrypt");
    }
}
