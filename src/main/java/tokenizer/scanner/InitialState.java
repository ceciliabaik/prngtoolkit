package tokenizer.scanner;

public class InitialState implements FiniteStateAutomaton {
  private String inputStream;
  private static final InitialState instance = new InitialState();

  public InitialState() {}

  public static InitialState instance() {
    return instance;
  }

  @Override
  public void transition(ScannerContext context) {
    while (!inputStream.isEmpty()) {
      char firstChar = inputStream.charAt(0);
      if (Character.isWhitespace(firstChar)) {
        removeWhiteSpaceChar();
        continue;
      } else if (firstChar == lastChar()) {
        context.setState(AcceptState.instance());
      } else {
        context.setState(NextState.instance());
      }
    }
  }

  private char lastChar() {
    return inputStream.charAt(inputStream.length() -1);
  }

  private String removeWhiteSpaceChar() {
    return inputStream.trim();
  }
}

