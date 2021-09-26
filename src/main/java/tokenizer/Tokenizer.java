package tokenizer;

import java.util.ArrayList;

/**
 * Tokenizer is a program that performs lexical analysis, which 
 * means a character-by-character evaluation of the input source 
 * code and identification of the tokens.
 */
public class Tokenizer {
    private ArrayList<TokenType> tokenTypeList;
    String[] tokens = {"Meningen", "består", "av", "ord", "."};
    private String string;
    private boolean isActiveToken;

    public Tokenizer(ArrayList<TokenType> tokenTypeList, String string) {
      this.tokenTypeList = tokenTypeList;
      this.string = string;
    }

    public Tokenizer() {

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

    public void evaluator() {
        for (int i = 0; i < string.length(); i++) {
        splitIntoTokensWithDelimiter();
      }
    }

    public void splitIntoTokensWithDelimiter() {
      // tokenValue = string.split(" ");
    }

    public int getActiveToken() {
        int activeToken = 0;
        for (int i = 0; i < tokens.length; i++) {
            if (!isActiveToken()) {
                setActiveToken(true);
            activeToken = Integer.parseInt(tokens[0]);
            }
        }
      return activeToken;
    }

    public int nextToken() {
      int nextToken = 0;
      for (int i = 0; i < tokens.length; i++) {
        if (isActiveToken()) {
          nextToken++;
        } 
      }
      return nextToken;
    }

    public int previousToken() {
      int previousToken = 0;
      for (int i = 0; i < tokens.length; i++) {
        if (isActiveToken()) {
          getActiveToken();
          previousToken = Integer.parseInt(tokens[0]);
        }
      }
      return previousToken;
    }

    // @Override
    // public int getEndToken() {
    //   String endToken = "";
    //   for (int i = 0; i < tokens.length; i++) {
    //     if (hasMoreTokens()) {
    //     } 
    //   }
    //   return endToken;
    // }
    
    // @Override
    // public boolean hasMoreTokens() {
    //   String lastToken = tokens[tokens.length - 1];
    //   for (int i = 0; i < tokens.length; i++) {
    //       if (lastToken) {
    //           return true;
    //       }
    //   }
    //   return false;
    // }
}

