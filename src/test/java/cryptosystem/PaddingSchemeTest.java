package cryptosystem.model;

import cryptosystem.model.PaddingScheme;
import org.junit.jupiter.api.Test;

import java.util.Base64;

class PaddingSchemeTest {
    private final String input = "Hello world I love you very much do you";

    private final PaddingScheme padding = new PaddingScheme(input);

    @Test
    void testPAddingSchemeConstruction() {
        Base64.Encoder encoder = null;
        padding.encodeStringToBytes();
    }
}