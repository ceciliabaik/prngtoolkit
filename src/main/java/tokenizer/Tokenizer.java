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
    ArrayList<String> tokens = new ArrayList<>(Arrays.asList("Meningen", "består", "av", "ord", "."));
    private String string;
    private boolean isActiveToken;
    private String activeToken;

    public Tokenizer(ArrayList<TokenType> tokenTypeList, String string) {
      this.tokenTypeList = tokenTypeList;
      this.string = string;
    }

    public String getString() {
        return string;
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
      String[] string = tokenizer.getString();
      for (int i = 0; i < string.length; i++) 
        splitIntoTokensWithDelimiter();
    }

    private String[] splitIntoTokensWithDelimiter() {
      return string.split(" ");
    }

    public void getInitialActiveToken() {
      if (!isActiveToken()) {
        setActiveToken(true);
        System.out.println(tokens.get(0));
      }
    }

    public void removeWhiteSpaceBeforeNextToken() {
      ArrayList<String> tokens = tokenizer.getTokens();
      for (int i = 0; i < tokens.size(); i++) 
        System.out.println(tokens.get(i));
    } 

    public void moveActiveTokenForward() {
      ArrayList<String> tokens = tokenizer.getTokens();
      String nextToken = activeToken;
      for (int i = 0; i < tokens.size(); i++) {
        if (isActiveToken() && hasMoreTokens()) 
          activeToken = tokens.get(i);
          System.out.println(nextToken); 
      }
    }

    public Tokenizer moveActiveTokenBackwards() {
      ArrayList<String> tokens = tokenizer.getTokens();
      for (int i = 0; i < tokens.size(); i++) {
        if (isActiveToken() && hasMoreTokens()) 
          String previousToken = activeToken;
          activeToken = tokens.get(i);
          System.out.println(previousToken);
      }
    }

    public Tokenizer getEndToken() {
      ArrayList<String> tokens = tokenizer.getTokens();
      for (int i = 0; i < tokens.size(); i++) {
        if (isActiveToken() && !hasMoreTokens()) 
          System.out.println(tokens.get(i-1));
      }
    }

    public void getLongestMatch() {
      
    }

    public boolean hasMoreTokens() {
      ArrayList<String> tokens = tokenizer.getTokens();
      for (int i = 0; i < tokens.size(); i++) {
        if (tokens.isEmpty()) return true;
      }
      return false;
    }
  }
