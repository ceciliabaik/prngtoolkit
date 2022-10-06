package cryptosystem.scheme;

import java.util.Base64;

/**
 * @author Cecilia Baik
 */
public class PaddingScheme {
    private String encodedMessage;
    private String decodedMessage;

    public PaddingScheme() {}

    public String convertStringToBytes(String inputMessage) {
        Base64.Encoder encoder = Base64.getEncoder();
        byte[] bytes = inputMessage.getBytes();
        encodedMessage = encoder.encodeToString(bytes);
        return encodedMessage;
    }

    public String convertBytesToString(String encodedMessage) {
        Base64.Decoder decoder = Base64.getDecoder();
        decodedMessage = new String(decoder.decode(encodedMessage));
        return decodedMessage;
    }

    public String getEncodedMessage() {
        return encodedMessage;
    }

    public String getDecodedMessage() {
        return decodedMessage;
    }
}

