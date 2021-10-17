package tokenizer.evaluator;

import tokenizer.model.Token;
import tokenizer.model.Lexeme;
import tokenizer.scanner.ScannerContext;

import java.util.ArrayList;
import java.util.Arrays;

public class Tokenizer {
  private Lexeme lexeme;
  private ScannerContext scanner;
  private final ArrayList<String> tokens;
  private boolean isActiveToken;

  public Tokenizer(Lexeme lexeme) {
    this.lexeme = lexeme;
    tokens = new ArrayList<>(Arrays.asList());
    scanner = new ScannerContext();
  }

  public boolean isActiveToken() {
    return isActiveToken;
  }

  public void setActiveToken(boolean activeToken) {
    isActiveToken = activeToken;
  }

  public void Tokenization(String sourceCode) {
    while (!sourceCode.isEmpty()) {
      for (int i = 0; i < sourceCode.length(); i++) {
        scanner.transition(sourceCode);
        if (lexeme.isLetter()) {
          createToken(Token.Type.LITERAL, "Letter");
        } else if (lexeme.isInteger()) {
          createToken(Token.Type.LITERAL, "Letter");
        } else if (lexeme.isOperator()) {
          createToken(Token.Type.LITERAL, "Letter");
        } else {
          throw Exception("Detected illegal Token");
        }
      }
      // Add all tokens to tokenslist.
    }
  }

  public void traverseTokens() {
    int activeToken = 0;
    for (int i = 0; i < tokens.size(); i++) {
      while (!tokens.isEmpty() && !isActiveToken()) {
        getInitialActiveToken();
      } 
      if () {
        moveActiveTokenForward();
      } else if () {
        moveActiveTokenForward();
      } else {
        getEndToken();
      }
    }
  }

  private String getInitialActiveToken() {
    return tokens.get(0);
  }

  public String moveActiveTokenForward() {
    for (int i = 1; i < tokens.size(); i++) {
      if (isActiveToken()) {
        String activeToken = tokens.get(0;)
        String nextToken = tokens.get(i +=1);
        currentToken = nextToken;
        setActiveToken(nextToken);
        return nextToken;
      }
    }   
  }

  public String moveActiveTokenBackwards() {
    for (int i = tokens.size() -1; i >= 0; i--) {
      if (isActiveToken().equals(currentToken)) {
        String activeToken = tokens.get(i);
        String previousToken = tokens.get(i +=1);
        activeToken = previousToken;
        return previousToken.setActiveToken(true);
      }
    }
  }

  public void hasMoreTokens(String activeToken) {
    if (isEndOfTokens() && activeToken > getEndToken()) 
      createToken(Token.Type.END, "");
  }

  private String getEndToken() {
    return tokens.get(tokens.size() -1);
  }

  private boolean isEndOfTokens() {
    return tokens.isEmpty(); 
  }

  private Token createToken(Token.Type name, String value) {
    return new Token(name, value);
  }

  public String ignoreWhiteSpace() {
    return sourceCode.replaceAll("\\s+","");
  }

  public String ignoreComment() {
    return sourceCode.replaceAll("\\s+","");
  }

  public String detectIllegalToken() {
  }

  private boolean isInvalidToken() {
  }

  public String delimitToken() {
    return sourceCode.trim(",");
  }
}
