package tokenizer.scanner;

public class NextState implements FiniteStateAutomaton {
  private MaximalMunch longestMatch;

  private static NextState instance = new NextState();

  private NextState() {}

  public static NextState instance() {
    return instance;
  }

  @Override
  public void transition(Scanner scanner) {
    while (i < sourceCode.length()) {
      char currentPositionOfChar = 1;
      if (Character.isWhitespace(currentPositionOfChar)) {
        longestMatch.getLongestMatch();
        delimitIntoSubstring(sourceCode);
        scanner.setState(AcceptState.instance());
        ignoreWhiteSpaceChar(sourceCode);
      } else {
        scanner.setState(this);
        transition(this, sourceCode);
      }
    }
  }

  private String ignoreWhiteSpaceChar(String sourceCode) {
    return sourceCode.trim();
  }

  private String[] delimitIntoSubstring(String sourceCode) {
    return sourceCode.split(" ");
  }

  public void addToEnumMapRegex() {
    RegexPattern<TokenTypes, String> regexPatterns = new EnumMap<>(TokenTypes.class);
    regexPatterns.put(TokenTypes.WORD, regexPatterns.literalCharClass());
    System.out.println("Regex patterns" + regexPatterns);
  }
}
