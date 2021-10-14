package tokenizer.scanner;

public class NextState implements FiniteStateAutomaton {
  private MaximalMunch longestMatch;
  private String inputStream;

  private static NextState instance = new NextState();

  private NextState() {}

  public static NextState instance() {
    return instance;
  }

  @Override
  public void transition(ScannerContext context) {
    int i = 1;
    while (i < inputStream.length()) {
      int nextChar = i+=1;
      if (nextChar == " ") {
       splitIntoSubstring();
       longestMatch.getLongestMatch();
       context.setState(AcceptState.instance());
      } else {
        removeWhiteSpaceChar();
        context.setState(this);
        transition(context);
      }
    }
  }

  private char lastChar() {
    return inputStream.charAt(inputStream.length() -1);
  }

  private String removeWhiteSpaceChar() {
    return inputStream.trim();
  }

  private String[] splitIntoSubstring() {
    return inputStream.split(" ");
  }
}
