package tokenizer;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import tokenizer.evaluator.Tokenizer;

public class ArithmeticGrammarTest {
    private Tokenizer tokenizer;

    @Before
    public void createTokenizer() throws Exception {
        tokenizer = new Tokenizer();
    }

    @Test
    public void tokenizer_TC12() {
        final String name = "TC12";
        final String grammar = "ArithmeticGrammar";
        final String string = "3";

        assertEquals("", tokenizer, tokenizer.getActiveToken());
        assertEguals("", tokenizer, tokenizer.getTokenType();
    }

    @Test
    public void tokenizer_TC12() {
        final String name = "TC12";
        final String grammar = "ArithmeticGrammar";
        final String string = "3";

        assertEquals("", tokenizer, tokenizer.getActiveToken());
        assertEguals("", tokenizer, tokenizer.getTokenType();
    }

    @Test
    public void tokenizer_TC13() {
        final String name = "TC13";
        final String grammar = "ArithmeticGrammar";
        final String string = "3.14";

        assertEquals("", tokenizer, tokenizer.getActiveToken());
        assertEguals("", tokenizer, tokenizer.getTokenType();
    }

    @Test
    public void tokenizer_TC14() {
        final String name = "TC14";
        final String grammar = "ArithmeticGrammar";
        final String string = "3 + 54 * 4";

        assertEquals("", tokenizer, tokenizer.getActiveToken());
        assertEquals("", tokenizer, tokenizer.nextToken());
        assertEquals("", tokenizer, tokenizer.nextToken());
        assertEquals("", tokenizer, tokenizer.nextToken());
        assertEguals("", tokenizer, tokenizer.getTokenType();
    }

    @Test
    public void tokenizer_TC15() {
        final String name = "TC15";
        final String grammar = "ArithmeticGrammar";
        final String string = "3+5 # 4";

        assertEquals("", tokenizer, tokenizer.getActiveToken());
        assertEquals("", tokenizer, tokenizer.nextToken());
        assertEquals("", tokenizer, tokenizer.nextToken());
        assertEquals("", tokenizer, tokenizer.nextToken());
        assertEguals("", tokenizer, tokenizer.getTokenType();
    }

    @Test
    public void tokenizer_TC16() {
        final String name = "TC16";
        final String grammar = "ArithmeticGrammar";
        final String string = "3.0+54.1     + 4.2";

        assertEquals("", tokenizer, tokenizer.getActiveToken());
        assertEquals("", tokenizer, tokenizer.nextToken());
        assertEquals("", tokenizer, tokenizer.previousToken());
        assertEquals("", tokenizer, tokenizer.nextToken());
        assertEquals("", tokenizer, tokenizer.nextToken());
        assertEquals("", tokenizer, tokenizer.nextToken());
        assertEguals("", tokenizer, tokenizer.getTokenType();
    }
}
