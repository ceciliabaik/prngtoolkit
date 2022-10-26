package view;

import controller.CryptosystemController;

public class ConsoleUI {
    private CryptosystemController controller;
    private StringBuffer messages;

    public ConsoleUI(CryptosystemController controller) {
        this.controller = controller;
        messages = new StringBuffer();
    }

    public ConsoleUI() {

    }

    public String promptForInputToEncrypt(String inputMessage) {
        System.out.println("Enter a message to be encrypted: ");
        return inputMessage;
    }

    public String getInputMessage() {

    }

    public void promptForBitLength(int bitLength) {
        System.out.println("Enter a bitLength: ");
    }

    private int getBitLength() {
    }

    public void user(String inputMessage) {
        addMessage("Following message will be encrypted: " + inputMessage);
    }

    public void bitLength(int bitLength) {
        addMessage("The bit length you have chosen is " + bitLength);
    }

    private void addMessage(String inputMessage, int bitLength) {
        if (messages.length() > 0) {
            messages.append(System.lineSeparator());
        }
        messages.append(inputMessage, bitLength);
    }

    protected String getMessages() {
        return messages.toString();
    }

    protected void clearMessages() {
        messages = new StringBuffer();
    }

    private void clearConsole() {
        for (int i = 0; i < 30; i++) {
            System.out.println();
        }
    }

    public void promptForBitLength() {
    }
}
