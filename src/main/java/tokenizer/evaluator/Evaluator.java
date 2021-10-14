package tokenizer.evaluator;

import tokenizer.model.Lexeme;

import java.util.ArrayList;

public class Evaluator {
  private String lexeme;
  private String value;

  public Evaluator(String lexeme, String value) {
    this.lexeme = lexeme;
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public void performEvaluation() {
    for (int i = 0; i < lexeme.length(); i++) {
      return getToken();
    }
     
  }

  public void identifyToken();

  public void detectIllegalCharacters() {
  }

  public String removeWhiteSpace(String inputStream) {
    return inputStream.trim();
  }

  public void removeComment() {
  }

  private void delimitLexemes() {
    return lexemes.split(" ");
  }

  public void convertIntoToken() {

  }
}
