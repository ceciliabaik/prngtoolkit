package cryptosystem.scheme;

import org.junit.jupiter.api.Test;

class PaddingSchemeTest {

    private final PaddingScheme paddingScheme  = new PaddingScheme();

    @Test
    void testEncodeMessage() {
        String inputMessage = "Hej på dig";
        paddingScheme.encodeStringToBytes(inputMessage);
        String encodedMessage = paddingScheme.getEncodedMessage();
        System.out.println("Encoded message is: " + encodedMessage);
    }

    @Test
    void testDecodeMessage() {
        String encodedMessage = "SmFnIGdpbGxhciBnbGFzcw==";
        paddingScheme.decodeBytesToString(encodedMessage);
        String decodedMessage = paddingScheme.getDecodedMessage();
        System.out.println("Decoded message is: " + decodedMessage);
    }
}