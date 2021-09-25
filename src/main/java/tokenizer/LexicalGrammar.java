package tokenizer;

public class LexicalGrammar {
  private TokenType tokenType;
  private String description;

  public LexicalGrammar(TokenType tokenType,String description) {
    this.tokenType = tokenType;
    this.description = description;
  }

  // Defines syntax of tokens.
  public String stringLiteral() {
    description = "";
    return description;
  }

  public String dotLiteral() {
    description = " ";
    return description;
  }

  public String integerLiteral() {
    description = "";
    return description;
  }

  public String floatLiteral() {
    description = "";
    return description;
  }

  public String additionLiteral() {
    description = "";
    return description;
  }

  public String multiplicationLiteral() {
    description = "";
    return description;
  }

  public String decimalIntegerLiteral() {
    description = "";
    return description;
  }

  public String hexadecimalIntegerLiteral() {
    description = "";
    return description;
  }

  public String endLiteral() {
    description = " ";
    return description;
  }
}
