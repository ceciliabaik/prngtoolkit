package tokenizer.scanner;

import tokenizer.model.Lexeme;
import tokenizer.model.Token;

public class AcceptState implements FiniteStateAutomaton {
  private static final AcceptState instance = new AcceptState();
  private Lexem lexeme;
  private Token token;

  private AcceptState() {
    lexeme = new Lexeme();
  }

  public static AcceptState instance() {
    return instance;
  }

  @Override
  public void transition(Scanner context) {
    while () {
      getLongestMatch(currentChar);
      if (String.isLiteral(currentChar)) {
        createLexeme(Token.Type.LITERAL, token.getValue());
      } else if (String.isInteger(lexeme)) {
        createLexeme(Token.Type.INTEGER, token.getValue());
      } else if (String.isFloat(lexeme)) {
        createToken(Token.Type.FLOAT, token.getValue());
      } else if (String.isOperator(lexeme)) {
        createToken(Token.Type.OPERATOR, token.getValue());
      } else if (String.isSeparator(lexeme)) {
        createToken(Token.Type.SEPARATOR, token.getValue());
      } else if (String.isEnd(lexeme)) {
        createToken(Token.Type.END, token.getValue());
      } else if (String.isInvalid(lexeme)){
        throw new Exception("No lexical element matches " + token.getValue());
      }
    }
  }

  private Token createLexeme(Token.Type name, String value) {
    return new Token(name, value);
  }


}
