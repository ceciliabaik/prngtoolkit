package tokenizer;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import tokenizer.evaluator.Tokenizer;

public class WordAndDotGrammarTest {
    private Tokenizer tokenizer;

    @Before
    public void createTokenizer() throws Exception {
        tokenizer = new Tokenizer();
    }

    @Test
    public void tokenizer_TC1() {
        final String name = "TC1";
        final String grammar = "WordAndDotGrammar";
        final String string = "a";

        assertEquals("", tokenizer, tokenizer.getActiveToken());
        assertEguals("", tokenizer, tokenizer.getTokenType();
    }

    @Test
    public void tokenizer_TC2() {
        final String name = "TC2";
        final String grammar = "WordAndDotGrammar";
        final String string = "a aa";

        assertEquals("", tokenizer, tokenizer.getActiveToken());
        assertEquals("", tokenizer, tokenizer.nextToken());
        assertEguals("", tokenizer, tokenizer.getTokenType();
    }

    @Test
    public void tokenizer_TC3() {
        final String name = "TC3";
        final String grammar = "WordAndDotGrammar";
        final String string = "a.b";

        assertEquals("", tokenizer, tokenizer.getActiveToken());
        assertEquals("", tokenizer, tokenizer.nextToken());
        assertEguals("", tokenizer, tokenizer.getTokenType();
    }

    @Test
    public void tokenizer_TC4() {
        final String name = "TC4";
        final String grammar = "WordAndDotGrammar";
        final String string = "a.b";

        assertEquals("", tokenizer, tokenizer.getActiveToken());
        assertEquals("", tokenizer, tokenizer.nextToken());
        assertEquals("", tokenizer, tokenizer.nextToken());
        assertEguals("", tokenizer, tokenizer.getTokenType();

    }

    @Test
    public void tokenizer_TC5() {
        final String name = "TC5";
        final String grammar = "WordAndDotGrammar";
        final String string = "aa. b";

        assertEguals("", tokenizer, tokenizer.getTokenType();
    }

    @Test
    public void tokenizer_TC6() {
        final String name = "TC6";
        final String grammar = "WordAndDotGrammar";
        final String string = "a.b";

        assertEquals("", tokenizer, tokenizer.getActiveToken());
        assertEquals("", tokenizer, tokenizer.nextToken());
        assertEquals("", tokenizer, tokenizer.nextToken());
        assertEquals("", tokenizer, tokenizer.previousToken());
        assertEguals("", tokenizer, tokenizer.getTokenType();
    }

    @Test
    public void tokenizer_TC7() {
        final String name = "TC7";
        final String grammar = "WordAndDotGrammar";
        final String string = "";

        assertEquals("", tokenizer, tokenizer.getActiveToken());
        assertEquals("", tokenizer, tokenizer.getEndToken());
        assertEguals("", tokenizer, tokenizer.getTokenType();
    }

    @Test
    public void tokenizer_TC8() {
        final String name = "TC8";
        final String grammar = "WordAndDotGrammar";
        final String string = " ";

        assertEquals("", tokenizer, tokenizer.getActiveToken());
        assertEguals("", tokenizer, tokenizer.getTokenType();
    }

    @Test
    public void tokenizer_TC9() {
        final String name = "TC9";
        final String grammar = "WordAndDotGrammar";
        final String string = "a";

        assertEguals("", tokenizer, tokenizer.getTokenType();
    }

    @Test
    public void tokenizer_TC10() {
        final String name = "TC10";
        final String grammar = "WordAndDotGrammar";
        final String string = "a";

        assertEquals("", tokenizer, tokenizer.getActiveToken());
        assertEquals("", tokenizer, tokenizer.previousToken());
        assertEguals("", tokenizer, tokenizer.getTokenType();
    }

    @Test
    public void tokenizer_TC11() {
        final String name = "TC11";
        final String grammar = "WordAndDotGrammar";
        final String string = "!";

        assertEquals("", tokenizer, tokenizer.getActiveToken());
        assertEguals("", tokenizer, tokenizer.getTokenType();
    }
}
