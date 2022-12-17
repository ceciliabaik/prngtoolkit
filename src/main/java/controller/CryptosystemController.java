package controller;

import model.Cryptosystem;
import view.View;

public class CryptoController {

    public void run(Cryptosystem cryptosystem, View view) {
        view.displayWelcomeMessage();

        view.promptForBitLength();

        view.displayKeyGenerateMessage();
        view.displayPublicKey();
        view.displayPrivateKey();

        view.promptForEncryption();
        view.displayCiphertext();
        view.promptForDecryption();
        view.displayPlaintext();
    }

    public void updateView() {
    }
}
