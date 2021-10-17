package tokenizer.scanner;

public class NextState implements FiniteStateAutomaton {
  private MaximalMunch longestMatch;

  private static NextState instance = new NextState();

  private NextState() {}

  public static NextState instance() {
    return instance;
  }

  @Override
  public void transition(ScannerContext context, String sourceCode) {
    int i = 1;
    while (i < inputStream.length()) {
      for (int j = 0; j < inputStream.length(); j++) {
        char nextChar = inputStream.charAt(j +1);
      } if (Character.isWhitespace(nextChar)) {
          splitIntoSubstring();
          longestMatch.getLongestMatch();
          context.setState(AcceptState.instance());
          ignoreWhiteSpaceChar();
      } else {
          context.setState(this);
          transition(context);
      }
    }
  }

  private String ignoreWhiteSpaceChar() {
    return inputStream.trim();
  }

  private String[] splitIntoSubstring() {
    return inputStream.split(" ");
  }
}
