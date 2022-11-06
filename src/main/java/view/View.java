package view;

public interface View {
    void displayWelcomeMessage();

    void promptForBitLength();

    void displayKeyGenerateMessage();

    void displayPublicKey();

    void promptForEncryption();

    void promptForDecryption();

    int getUserInput();

    void displayPrivateKey();

    void displayCiphertext();

    void displayPlaintext();
}
