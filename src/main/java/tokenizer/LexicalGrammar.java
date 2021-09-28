package tokenizer;

public class LexicalGrammar {
  private TokenType tokenType;
  private String description;

  public LexicalGrammar(TokenType tokenType,String description) {
    this.tokenType = tokenType;
    this.description = description;
  }

  public String getDescription() {
    return description;
  }

  public String literalRegex() {
    description = "([a-zåäöA-ZÅÄÖ]*)\\s*(.*)(!*)\\?*(:*)(;*)(,*)";
    return description;
  }

  public String arithmeticRegex() {
    description = "";
    return description;
  }

  public String javaRegex() {
    description = "";
    return description;
  }

  public String javaScriptRegex() {
    description = "";
    return description;
  }

  public String whiteSpaceRegex() {
    description = "";
    return description;
  }
}

