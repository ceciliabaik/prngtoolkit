package controller;

import model.Cryptosystem;
import view.View;

public class CryptoController {
    private Cryptosystem cryptosystem;
    private View view;

    public CryptoController(Cryptosystem cryptosystem, View view) {
        this.cryptosystem = cryptosystem;
        this.view = view;
    }

    public void run() {
        view.displayWelcomeMessage();
        
        while (cryptosystem.isRunning()) {
            view.promptForBitLength();
            view.displayKeyGenerateMessage();
            view.displayPublicKey();
            view.promptForDecryption();
        }
    }
    
    public void updateView() {
    }
}
