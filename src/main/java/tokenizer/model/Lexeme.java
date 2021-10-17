package tokenizer.model;

public class Lexeme {
  private String value;

  public Lexeme(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  public boolean isInteger(String character) {
    return character.equals("[0-9]");
  }

  public boolean isFloat(String character) {
    return character.equals("^[0-9]+\\.[0-9]+");
  }

  public boolean isSeparator(String character) {
    return character.equals("^\\.");
  }

  public boolean isOperator(String character) {
    return character.equals("^[+-*/]");
  }

  public boolean isLetter(String value) {
    return value.equals("[a-zA-Z]");
  }

  private boolean isComment() {
    return .equals(" ");
  }

  private boolean isWhiteSpace(Character character) {
    return character.equals("\\s+","");
  }
}
