package tokenizer.scanner;

public class AcceptState implements FiniteStateMachine {
  private NextState nextState;
  private RegexPattern regexPattern;
  private Lexeme lexeme;
  private static AcceptState instance = new AcceptState();

  private AcceptState() {}

  public static AcceptState instance() {
    return instance;
  }

  @Override
  public void performTransition() {
    int i = 1;
    while (i < inputStream.length()) {
      String acceptChar = nextState.getNextChar();
      if (acceptChar.matches(regexPattern.literal())) {
        this.acceptString();
      }
    }
  }

  public void acceptString() {
  }

  private void createLexeme() {
    return new Lexeme();
  }

  public void createEnumMapRegex() {
    RegexPattern<TokenTypes, String> regexPatterns = new EnumMap<>(TokenTypes.class);
    regexPatterns.put(TokenTypes.WORD, regexPatterns.literalCharClass());
    System.out.println("Regex patterns" + regexPatterns);
  }
}
