package tokenizer.lexicalGrammar;

public class EnumMapRegex extends LexicalGrammar {
  private final TokenType tokenType;
  private String description;

  public enum TokenType {
    WORD, NUMBER, FLOAT, INTEGER, ADDITION
  }

  public EnumMapRegex(TokenType tokenType, String description) {
    super(description);
      this.tokenType = tokenType;
  }

  public String literalCharacter() {
    description = "[a-zåäöA-ZÅÄÖ]*";
    return description;
  }

  public String digitCharacter() {
    description = "\\d";
    return description;
  }

  public String whiteSpaceCharacter() {
    description = "\\S+";
    return description;
  }

  public String commentCharacter() {
    description = "(*/)";
    return description;
  }

  @Override
    public String toString() {
      return "EnumMapRegex{" +
             "description='" + description + '\'' +
             '}';
  }
}
