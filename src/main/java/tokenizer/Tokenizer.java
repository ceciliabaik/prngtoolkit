package tokenizer;

import tokenizer.interpreter.RegularExpression;
import tokenizer.interpreter.SourceCode;
import tokenizer.model.Lexeme;
import tokenizer.model.Token;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Tokenizer is a program that performs lexical analysis, which 
 * means a character-by-character evaluation of the input source 
 * code and identification of the tokens.
 * 
 * @author Cecilia Baik
 */
public class Tokenizer implements PublicInterface {
  // private ArrayList<EnumMapRegex.TokenType> tokenTypeList;
  private SourceCode sourceCode;
  private boolean isActiveToken;
  private Scanner scanner;
  private Token token;
  private Lexeme lexemeChar;
  ArrayList<String> tokens = new ArrayList<>(Arrays.asList("Meningen", "består", "av", "ord", "."));

  public Tokenizer(SourceCode sourceCode, Lexeme lexemeChar, Token token) {
    this.sourceCode = sourceCode;
    this.lexemeChar = lexemeChar;
  }

  public boolean isActiveToken() {
    return isActiveToken;
  }

  public void setActiveToken(boolean activeToken) {
    isActiveToken = activeToken;
  }

  // Categorize into tokens.
  public boolean performTokenization(LiteralExpression literalExpression) {
    getInitActiveToken();
    while (!sourceCode.getInputStream().isEmpty()) {
      if (lexemeChar.hasWhiteSpace()) {
        ignoreWhiteSpace();
        continue;
      } else if (literalExpression.interpret()) {
        return token(Token.TokenType.LITERAL, token.getValue());
      } else if (digitExpression.interpret()) {
        Token token = token(Token.TokenType.LITERAL, token.getValue());
      }
    }
    return token(Token.TokenType.END, token.getValue());
  }

  private String ignoreWhiteSpace() {
    return sourceCode.getInputStream().trim();
  }

  private String getInitActiveToken() {
    if (!isActiveToken()) {
      setActiveToken(true);
      char firstLexemeChar = sourceCode.getInputStream().charAt(0);
      return Character.toString(firstLexemeChar);
    } else if (sourceCode.getInputStream().isEmpty()) {
      throw new NullPointerException("Input stream is empty.");
    }
  }

  public void moveActiveTokenForward() {
    for (int i = 0; i < tokens.size(); i++)
      System.out.println(tokens.get(i)); 
  }

  public void moveActiveTokenBackwards() {
    for (int i = tokens.size() -1; i >= 0; i--)
      System.out.println(tokens.get(i));
  }

  public boolean getEndToken() {
    if (searchPattern.getInputStream().indexOf(0) > searchPattern.getInputStream().length() -1) {
      return token(tokenType.END, token.getValue());
    }
    return false;
  }

  public boolean hasMoreTokens(ArrayList<String> tokens) {
    if (tokens.isEmpty()) {
      return true;
    } else {
      return false;
    }
  }
}
