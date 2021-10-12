package tokenizer.model;

public class Token {
  private TokenName name;
  private int value;

  public enum TokenName {
    IDENTIFIER, KEYWORD, SEPARATOR, OPERATOR, LITERAL, COMMENT
  }

  public Token(TokenName name, int value) {
    this.name = name;
    this.value = value;
  }

  public TokenName getName() {
    return name;
  }

  public void setName(TokenName name) {
    this.name = name;
  }

  public int getValue() {
    return value;
  }

  public void setValue(int value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return "Token{" +
            "name=" + name +
            ", value=" + value +
            '}';
  }
}
