package cryptosystem.view;

public class ConsoleUI {

    public ConsoleUI() {
        StringBuffer messages = new StringBuffer();
    }

    public void userTypesMessage(String inputMessage) {
        addMessage(inputMessage);
    }

    private void addMessage() {

    }

    public String promptForMessageToEncrypt() {
        System.out.println("Enter a message to be encrypted");
    }

    public String promptForBitLength() {
        System.out.println("Enter bitLength of your choice");
    }

    protected String getMessages() {
        return messages.toString();
    }

    protected void clearMessages() {
        messages = new StringBuffer();
    }
}
