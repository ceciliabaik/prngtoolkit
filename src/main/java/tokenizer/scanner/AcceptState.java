package tokenizer.scanner;

import tokenizer.model.Lexeme;

public class AcceptState implements FiniteStateAutomaton {
  private String inputStream;
  private NextState nextState;
  private static AcceptState instance = new AcceptState();

  private AcceptState() {}

  public static AcceptState instance() {
    return instance;
  }

  @Override
  public void transition(ScannerContext context) {
    while (inputStream.length() == inputStream.length() -1) {
      char acceptChar;
      if (acceptChar.matches(regexPattern.literal())) {
        acceptString();
        createLexeme();
      } else {

      }
    }
  }

  public void acceptString() {
  }

  private Lexeme createLexeme() {
    Lexeme lexeme = new Lexeme();
    return lexeme;
  }

  public void createEnumMapRegex() {
    RegexPattern<TokenTypes, String> regexPatterns = new EnumMap<>(TokenTypes.class);
    regexPatterns.put(TokenTypes.WORD, regexPatterns.literalCharClass());
    System.out.println("Regex patterns" + regexPatterns);
  }
}
