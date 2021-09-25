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
    private String[] tokens = {"Meningen", "består", "av", "ord"};
    private boolean isActiveToken;

    private Tokenizer(String textString) {
      this.textString = textString;
    }

    public boolean isActiveToken() {
        return isActiveToken;
    }

    public void setActiveToken(boolean activeToken) {
        isActiveToken = activeToken;
    }

    public void performTokenization() {
      // TODO: ConvertTextStringIntoTokens.
    }

    @Override
    public int getActiveToken() {
      int activeToken = 0;
      for (int i = 0; i < tokens.length; i++) {
        if (isActiveToken() == false) {
          setActiveToken(true);
          activeToken = Integer.parseInt(tokens[0]);
        } else {
          throw new Error();
        }
      }
      return activeToken;
    }

    @Override
    public int nextToken() {
      int nextToken = 0;
      for (int i = 0; i < tokens.length; i++) {
        if (isActiveToken() == true) {
          getActiveToken();
          nextToken = Integer.parseInt(tokens[0]);
        } 
      }
      return nextToken;
    }

    @Override
    public int previousToken() {
      int previousToken = 0;
      for (int i = 0; i < tokens.length; i++) {
        if (isActiveToken() == true) {
          getActiveToken();
          previousToken = Integer.parseInt(tokens[0]);
        }
      }
      return previousToken;
    }

    @Override
    public int getEndToken() {
      int endToken = 0;
      for (int i = 0; i < tokens.length; i++) {
        if (hasMoreTokens() == true)
          endToken = Integer.parseInt(tokens[0]);
      }
      return endToken;
    }

    @Override
    public void getLongestMatch() {
        for (int i = 0; i < textString.length(); i++) {
            System.out.println(textString.charAt(i));
        }
    }
    
    @Override
    public boolean hasMoreTokens() {
      boolean isMoreTokens;
      for (int i = 0; i < tokens.length; i++) {
          foundMoreTokens = Integer.parseInt(tokens[0]);
      }
      return foundMoreTokens;
  }
}

