package tokenizer.scanner;

import tokenizer.lexicalGrammar.EnumMapRegex;
import tokenizer.lexicalGrammar.TokenType;

public class AcceptState implements FiniteStateMachine {
  private static AcceptState instance = new AcceptState();

  private AcceptState() {}

  public static AcceptState instance() {
    return instance;
  }

  @Override
  public void performTransition(ScannerContext context, String inputStream) {
    context.setState(InitialState.instance());
  }

  public void acceptString() {
  }

  public void createLexeme() {
    return new Lexeme();
  }

  public void createEnumMapRegex() {
    EnumMapRegex<TokenType, String> regexPatterns = new EnumMap<>(TokenType.class);
    regexPatterns.put(TokenType.WORD, regexPatterns.literalCharClass());
    System.out.println("Regex patterns" + regexPatterns);
  }
}
