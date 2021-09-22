package tokenizer;

import java.util.ArrayList;

/**
 * Tokenizer is a program that performs lexical analysis, which 
 * means a character-by-character evaluation of the input source 
 * code and identification of the tokens.
 */
public abstract class Tokenizer implements PublicInterface {
    private ArrayList<Token> tokenList;
    private final String inputSourceCode;

    /**
     * This constructor creates a new Tokenizer.
     */
    private Tokenizer(String inputSourceCode) {
      this.inputSourceCode = inputSourceCode;
    }

    /**
     * This method gets the active token which is the first token of a string.
     */
    @Override
    public void getActiveToken() {
        for (int i = 0; i < inputSourceCode.length; i++) {
        }
    }

    /**
     * This method gets the end token of a string.
     */
    @Override
    public void getEndToken() {
        for (int i = 0; i < inputSourceCode.length; i++) {
        }
    }

    /**
     * This method returns a special token of END.
     */
    @Override
    public void getSpecialToken() {
        for (int i = 0; i < inputSourceCode.length; i++) {
        }
    }

    /**
     * This method uses the Maximal Munch rule.
     */
    @Override
    public void getLongestMatch() {
        for (int i = 0; i < inputSourceCode.length; i++) {
        }
    }

    /**
     * This method moves active token forward to next token.
     */
    @Override
    public void nextToken() {
        for (int i = 0; i < inputSourceCode.length; i++) {
        }
    }

    /**
     * This method moves active token backwards to previous token.
     */
    @Override
    public void previousToken() {
        for (int i = 0; i < inputSourceCode.length; i++) {
        }
    }

    /**
     * This method checks if there are more tokens available.
     */
    @Override
    public void hasMoreTokens() {
        for (int i = 0; i < inputSourceCode.length; i++) {
        }
    }

    /**
     * This method converts a series of characters into a series of tokens.
     */
    private void performTokenization() {
    }
}