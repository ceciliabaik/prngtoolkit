package cryptosystem.model;

import java.util.Base64;

public class PaddingScheme {

    public PaddingScheme() {
    }

    protected void convertStringToBytes(String message) {
        Base64.Encoder encoder = Base64.getEncoder();
        encoder.encodeToString(message.getBytes());
    }
    
    protected String bytesToString(String encodedMessage) {
        Base64.Decoder decoder = Base64.getDecoder();
        return new String(decoder.decode(encodedMessage));
    }
}
