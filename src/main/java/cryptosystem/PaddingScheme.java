package cryptosystem;

import java.util.Base64;

public class PaddingScheme {
    private final String input;

    public PaddingScheme(String input) {
        this.input = input;
    }

    protected void encodeStringToBytes() {
        Base64.Encoder encoder = Base64.getEncoder();
        encoder.encodeToString(input.getBytes());
    }
    
    protected String decodeByteToString(String encodedMessage) {
        Base64.Decoder decoder = Base64.getDecoder();
        return new String(decoder.decode(encodedMessage));
    }
}
