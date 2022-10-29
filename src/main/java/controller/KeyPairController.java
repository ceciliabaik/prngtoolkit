package controller;

import model.key.KeyPairGenerator;
import view.View;

public class Generator {

    public boolean init(KeyPairGenerator generator, View view) {
        view.displayWelcomeMessage();

        view.displayPublicKey(generator.getPublicKey(), generator.getModulus());
        view.displayPrivateKey(generator.getPrivateKey());
    }
}
