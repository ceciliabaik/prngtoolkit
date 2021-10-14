package tokenizer.model;

public class Token {
  private Type name;
  private int value;

  public enum Type {
    IDENTIFIER, KEYWORD, SEPARATOR, OPERATOR, LITERAL, COMMENT
  }

  public Token(Type name, int value) {
    this.name = name;
    this.value = value;
  }

  public Type getName() {
    return name;
  }

  public void setName(Type name) {
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
