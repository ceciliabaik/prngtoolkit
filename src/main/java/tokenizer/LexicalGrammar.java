package tokenizer;

public class LexicalGrammar {
  private TokenType tokenType;
  private String description;

  public LexicalGrammar(TokenType tokenType,String description) {
    this.tokenType = tokenType;
    this.description = description;
  }

  public LexicalGrammar() {

  }

  public String literalRegex() {
    description = "([a-zåäöA-ZÅÄÖ]+)";
    return description;
  }

  public String integerCharacter() {
    description = "([0-9]+)";
    return description;
  }

  public String dotLiteral() {
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

  public String multiplicationRegex() {
    description = "";
    return description;
  }

  public String decimalIntegerLiteral() {
    description = "";
    return description;
  }

  public String hexadecimalRegex() {
    description = "";
    return description;
  }

  public String endRegex() {
    description = "$";
    return description;
  }

  public String commentsRegex() {
    description = "";
    return description;
  }

  public String whiteSpaceRegex() {
    description = "(\s+)";
    return description;
  }
}
