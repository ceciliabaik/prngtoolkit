package cryptosystem.model.scheme;

import java.util.Base64;

/**
 * @author Cecilia Baik
 */
public class PaddingScheme {
    private ConsoleUI consoleUI;
    private Encoder mimeEncoder;
    private Decoder mimeDecoder;
    private String message;
    private byte[] encodedMessage;
    private String decodedMessage;

    public PaddingScheme() {
        message = ConsoleUI.getInputMessage();
        mimeEncoder = Base64.getMimeEncoder();
        mimeDecoder = Base64.getMimeDecoder();
    }

    private byte[] encodeStringToBytes(String message) {
        byte[] bytes = Files.readAllBytes(Paths.get());
        encodedMessage = mimeEncoder.encodeToString(bytes);
    }

    public byte[] getEncodedMessage() {
        return enocdedMessage;
    }

    private String decodeBytesToString(byte[] encodedMessage) {
        decodedMessage = mimeDecoder.decode(encodedMessage);
        return new String(decodedMessage);
    }

    public String getDecodedMessage() {
        return decodedMessage;
    }
}