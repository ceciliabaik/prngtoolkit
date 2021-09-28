package tokenizer;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Tokenizer is a program that performs lexical analysis, which 
 * means a character-by-character evaluation of the input source 
 * code and identification of the tokens.
 * 
 * @author Cecilia Baik
 */
public class Tokenizer {
    private ArrayList<TokenType> tokenTypeList;
    private String inputStream;
    private boolean isActiveToken;
    ArrayList<String> tokens = new ArrayList<>(Arrays.asList("Meningen", "består", "av", "ord", "."));

    public Tokenizer(ArrayList<TokenType> 
        tokenTypeList, String inputStream) {
      this.tokenTypeList = tokenTypeList;
      this.inputStream = inputStream;
    }

    public String getInputStream() {
        return inputStream;
    }

    public boolean isActiveToken() {
      return isActiveToken;
    }

    public void setActiveToken(boolean activeToken) {
      isActiveToken = activeToken;
    }

    public void performTokenization() {
      generateTokens();
    }

    public void performEvaluation() {
      for (int i = 0; i < inputStream.length(); i++) 
        delimitInputStream();
    }

    private String[] delimitInputStream() {
      return inputStream.split(" ");
    }

    public void removeWhiteSpace() {
    }

    public void removeComment() {
    }

    public void generateTokens() {
      defineLongestMatch();
    }

    private void defineLongestMatch() {  
    }

    public void getInitialActiveToken() {
      if (!isActiveToken()) 
        setActiveToken(true);
        System.out.println(tokens.get(0));
    }

    public void moveActiveTokenForward() {
      for (int i = 0; i < tokens.size(); i++)
        System.out.println(tokens.get(i)); 
    }

    public void moveActiveTokenBackwards() {
      for (int i = tokens.size() -1; i >= 0; i--)
      System.out.println(tokens.get(i));
    }

    public void getEndToken() {
      for (int i = tokens.size(); i >= 0; i--)
      System.out.println(tokens.get(tokens.size() -1));
    }

    public boolean hasMoreTokens(ArrayList<String> tokens) {
      return tokens.isEmpty();
    }
  }
