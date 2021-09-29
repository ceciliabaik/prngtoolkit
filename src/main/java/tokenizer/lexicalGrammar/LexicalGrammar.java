package tokenizer.lexicalGrammar;

import tokenizer.tokenizer.TokenType;

public class LexicalGrammar {
  private TokenType tokenType;
  private String description;

  public LexicalGrammar(TokenType tokenType,String description) {
    this.tokenType = tokenType;
    this.description = description;
  }
}

