package tokenizer.model;

public class Token {
  private TokenType name;
  private int value;

  public Token(TokenType name, int value) {
    this.name = name;
    this.value = value;
  }

  public enum TokenType {
    IDENTIFIER, KEYWORD, SEPARATOR, OPERATOR, LITERAL, COMMENT, END
  }

  public TokenType getName() {
    return name;
  }

  public void setName(TokenType name) {
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
