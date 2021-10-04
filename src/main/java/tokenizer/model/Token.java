package tokenizer.model;

public class Token {
  private Integer tokenValue;

  public enum TokenName {
    IDENTIFIER, KEYWORD, SEPARATOR, OPERATOR, LITERAL, COMMENT, NUMBER, DIGIT
  }

  public Token(Integer tokenValue) {
    this.tokenValue = tokenValue;
  }

  public Integer getTokenValue() {
    return tokenValue;
  }

  public void setTokenValue(Integer tokenValue) {
    this.tokenValue = tokenValue;
  }
}
