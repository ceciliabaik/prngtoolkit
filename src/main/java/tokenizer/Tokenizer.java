package tokenizer;

import java.util.ArrayList;

/**
 * Tokenizer is a program that performs lexical analysis, which 
 * means a character-by-character evaluation of the input source 
 * code and identification of the tokens.
 */
public abstract class Tokenizer implements PublicInterface {
    private ArrayList<Token> tokenTypeList;
    private final String textString;

    private Tokenizer(String textString) {
      this.textString = textString;
    }

    /**
     * Perform tokenization.
     */
    public void convertTextStringIntoTokens() {}

    @Override
    public void getActiveToken() {
      String[] tokens = {"Meningen", "består", "av", "ord"};
      for (String token : tokens) {
        System.out.println(token);
    }
    }

    @Override
    public void getEndToken() {
        for (int i = 0; i < textString.length(); i++) {
            System.out.println(textString.charAt(i));
        }
    }

    @Override
    public void getSpecialTokenOfEnd() {
        for (int i = 0; i < textString.length(); i++) {
            System.out.println(textString.charAt(i));
        }
    }

    @Override
    public void getLongestMatch() {
        for (int i = 0; i < textString.length(); i++) {
            System.out.println(textString.charAt(i));
        }
    }

    @Override
    public void nextToken() {
        for (int i = 0; i < textString.length(); i++) {
          System.out.println(textString.charAt(i));
        }
    }

    @Override
    public void previousToken() {
        for (int i = 0; i <  textString.length(); i++) {
          System.out.println(textString.charAt(i));
        }
    }
    
    @Override
    public void hasMoreTokens() {
        for (int i = 0; i < textString.length(); i++) {
          System.out.println(textString.charAt(i));
        }
    }
}