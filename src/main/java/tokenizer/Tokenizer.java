package tokenizer;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Tokenizer is a program that performs lexical analysis, which 
 * means a character-by-character evaluation of the input source 
 * code and identification of the tokens.
 */
public class Tokenizer {
    private ArrayList<TokenType> tokenTypeList;
    ArrayList<String> tokens = new ArrayList<String>(Arrays.asList("Meningen", "består", "av", "ord", "."));
    private String string;
    private boolean isActiveToken;

    public Tokenizer(ArrayList<TokenType> tokenTypeList, String string) {
      this.tokenTypeList = tokenTypeList;
      this.string = string;
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

    public void getInitialActiveToken() {
        if (!isActiveToken()) {
            setActiveToken(true);
            String activeToken = tokens.get(0);
            System.out.println(activeToken);
        }
    }

    public void moveActiveTokenForward() {
        for (int i = 0; i < tokens.size(); i++) {
            String nextToken = tokens.get(i);
            System.out.println(nextToken);
        }
    }

    public void moveActiveTokenBackwards() { 
        for (int i = tokens.size()-1; i >= 0; i--) {
          String previousToken = tokens.get(i);
          System.out.println(previousToken);
        }
    }

    public void getSpecialTokenOfEnd() {
          for (int i = 0; i < tokens.size(); i++) {
            String endToken = tokens.get(i);
            System.out.println(endToken);
        }
    }

    public void removeWhiteSpaceBeforeNextToken() {
        for (int i = 0; i < tokens.size(); i++) {
          String endToken = tokens.get(i);
          System.out.println(endToken);
        }
    }

    public boolean hasMoreTokens() {
      String lastToken = tokens[tokens.length - 1];
      for (int i = 0; i < tokens.length; i++) {
          if (lastToken) {
              return true;
          }
      }
      return false;
    }
}

