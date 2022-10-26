package scheme;

import java.util.Base64;

public class PaddingScheme {
    private final Base64.Encoder encoder;
    private final Base64.Decoder decoder;
    private String encodedMessage;
    private String decodedMessage;

    public PaddingScheme() {
        encoder = Base64.getEncoder();
        decoder = Base64.getDecoder();
    }

    public String encodeStringToBytes(String message) {
        if (message == null) {
            throw new IllegalArgumentException("The message can not be empty");
        } else {
            byte[] bytes = message.getBytes();
            encodedMessage = encoder.encodeToString(bytes);
            return encodedMessage;
        }
    }

    public String decodeBytesToString(String encodedMessage) {
        if (encodedMessage == null) {
            throw new IllegalArgumentException("The encoded message can not be empty");
        } else {
            decodedMessage = new String(decoder.decode(encodedMessage));
            return decodedMessage;
        }
    }

    public String getEncodedMessage() {
        return encodedMessage;
    }

    public String getDecodedMessage() {
        return decodedMessage;
    }
}

