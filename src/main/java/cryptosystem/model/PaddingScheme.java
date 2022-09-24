package cryptosystem.model.scheme;

import java.util.Base64;

public class PaddingScheme {
    private Cryptosystem crypto;
    private Encoder encoder;
    private Decoder decoder;
    private String message;
    private byte[] encodedMessage;
    private String decodedMessage;

    public PaddingScheme(byte[] encodedMessage, String decodedMessage) {
        this.encodedMessage = encodedMessage;
        this.decodedMessage = decodedMessage;
        message = crypto.getInputMessage();
        encoder = Base64.getMimeEncoder();
        decoder = Base64.getMimeDecoder();
    }

    public byte[] getEncodedMessage() {
        return enocdedMessage;
    }

    public String getDecodedMessage() {
        return decodedMessage;
    }

    private byte[] encodeToString(String message) {
        byte[] bytesText = Files.readAllBytes(Paths.get());
        decodedMessage = mimeEncoder.encodeToString();
    }

    private String decodeToString(byte[] encodedMessage) {
        decodedBytesMessage = decoder.decode(encodedString);
        return new String(decodedBytesMessage);
    }
}