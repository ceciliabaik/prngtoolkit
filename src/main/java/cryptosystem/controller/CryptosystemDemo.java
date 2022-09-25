package cryptosystem.controller;

import model.generator.KeyGenerator;
import view.ConsoleUI;

import view.ConsoleUI;

public class CryptosystemDemo {
    public static void main(String[] args) throws Exception {
        Cryptosystem crypto = new Cryptosystem();
        crypto.init();
        crypto.getKeyGenerator();
        crypto.encrypt();
        crypto.decrypt();
    }
}