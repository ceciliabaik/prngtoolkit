package tokenizer.model;

public class Token {
  private Type name;
  private String value;

  public enum Type {
    IDENTIFIER, KEYWORD, SEPARATOR, OPERATOR, LITERAL, COMMENT, INTEGER, END
  }

  public Token(Type name, String value) {
    this.name = name;
    this.value = value;
  }

  public Type getName() {
    return name;
  }

  public void setName(Type name) {
    this.name = name;
  }

  public String getValue() {
    return value;
  }

  public void setValue(String value) {
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
