package cryptosystem.controller;

import cryptosystem.model.key.Key;
import cryptosystem.view.ConsoleUI;

public class SystemController {
    private Key model;
    private ConsoleUI view;

    public SystemController(Key model, ConsoleUI view) {
        this.model = model;
        this.view = view;
    }

    public SystemController() {}

    public void start() {
    }

    public void updateView() {
    }
}
