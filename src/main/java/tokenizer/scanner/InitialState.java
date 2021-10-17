package tokenizer.scanner;

public class InitialState implements FiniteStateAutomaton {
  private static final InitialState instance = new InitialState();

  public InitialState() {}

  public static InitialState instance() {
    return instance;
  }

  @Override
  public void transition(ScannerContext context, String sourceCode) {
    sourceCode = context.getSourceCode();
    while (!sourceCode.isEmpty()) {
      char firstChar = sourceCode.charAt(0);
      if (Character.isWhitespace(firstChar)) {
        ignoreWhiteSpaceChar();
        continue;
      } else if (firstChar == lastChar()) {
        context.setState(AcceptState.instance());
      } else {
        context.setState(NextState.instance());
      }
    }
  }

  private char lastChar() {
    return sourceCode.charAt(sourceCode.length() -1);
  }

  private String ignoreWhiteSpaceChar() {
    return sourceCode.trim();
  }
}

