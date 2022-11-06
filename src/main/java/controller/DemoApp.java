package controller;

import model.Cryptosystem;
import view.CryptoView;
import view.View;

public class DemoApp {
    public static void main(String[] args) {

        Cryptosystem cryptosystem = new Cryptosystem();
        View view = new CryptoView();
        CryptoController controller = new CryptoController();

        controller.run(cryptosystem, view);
        controller.updateView();
    }
}
