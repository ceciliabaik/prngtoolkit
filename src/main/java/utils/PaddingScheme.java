package model;

import java.util.Base64;

public class PaddingScheme {
    private String encodedMessage;
    private String decodedMessage;
    private final Base64.Encoder encoder;
    private final Base64.Decoder decoder;


    public PaddingScheme() {
        encoder = Base64.getEncoder();
        decoder = Base64.getDecoder();
    }

    public boolean encodeStringToBytes(String message) {
        if (message == null) {
            throw new IllegalArgumentException("The message can not be empty");
        } else {
            byte[] bytes = message.getBytes();
            encodedMessage = encoder.encodeToString(bytes);

        }
        return false;
    }

    public boolean decodeBytesToString(String encodedMessage) {
        if (encodedMessage == null) {
            throw new IllegalArgumentException("The encoded message can not be empty");
        } else {
            decodedMessage = new String(decoder.decode(encodedMessage));
        }
        return false;
    }

    public String getEncodedMessage() {
        return encodedMessage;
    }

    public String getDecodedMessage() {
        return decodedMessage;
    }
}

