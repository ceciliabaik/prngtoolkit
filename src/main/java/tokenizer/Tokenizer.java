package tokenizer;

import tokenizer.interpreter.Interpreter;
import tokenizer.model.Token;
import tokenizer.scanner.Scanner;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Tokenizer is a program that performs lexical analysis, which 
 * means a character-by-character evaluation of the input source 
 * code and identification of the tokens.
 *  // private ArrayList<EnumMapRegex.TokenType> tokenTypeList;
 * 
 * @author Cecilia Baik
 */
public class Tokenizer implements PublicInterface {
  private Scanner scanner;
  private Interpreter interpreter;
  private final ArrayList<String> tokens;
  private boolean isActiveToken;

  public Tokenizer(, ArrayList<String> tokens) {
    this.tokens = new ArrayList<>(Arrays.asList("Meningen", "består", "av", "ord", "."));
  }

  public boolean isActiveToken() {
    return isActiveToken;
  }

  public void setActiveToken(boolean activeToken) {
    isActiveToken = activeToken;
  }

  public void performTokenization() {
    getInitActiveToken();
    while (!sourceCode.getInputStream().isEmpty()) {
      if (lexemeChar.hasWhiteSpace()) {
        ignoreWhiteSpace();
        continue;
      } else if (literalExpression.interpret()) {
        return getToken(Token.TokenType.LITERAL, token.getValue());
      } else if (digitExpression.interpret()) {
        return getToken(Token.TokenType.LITERAL, token.getValue()));
    }
    return getToken(Token.TokenType.END, token.getValue());
  }
   
  private String ignoreWhiteSpaces() {
    return sourceCode.getInputStream().trim();
  }

  private void removeComments() {

  }

  private String getInitActiveToken() {
    if (!isActiveToken())
      setActiveToken(true);
      return Character.toString(sourceCode.getInputStream().charAt(0));
  }

  public String moveActiveTokenForward() {
    for (int i = 0; i < sourceCode.getInputStream().length(); i++) {
      if (isActiveToken()) {
        char activeToken = sourceCode.getInputStream().charAt(i);
        char nextToken = sourceCode.getInputStream().charAt(i+1);
        activeToken = nextToken;
        return Character.toString(nextToken);
      }
    }   
  }

  public String moveActiveTokenBackwards() {
    for (int i = sourceCode.getInputStream().length() -1; i >= 0; i--) {
      if (isActiveToken()) {
        char activeToken = sourceCode.getInputStream().charAt(i);
        char previousToken = sourceCode.getInputStream().charAt(i-1);
        activeToken = previousToken;
        return Character.toString(previousToken);
      }
    }
  }

  public String getEndToken() {
    if (!hasMoreTokens()) 
      return Character.toString(sourceCode.getInputStream().
      charAt(sourceCode.getInputStream().length() -1));
  }
  
  public boolean hasMoreTokens() {
    return tokens.isEmpty(); 
  }
}
