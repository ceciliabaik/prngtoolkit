package tokenizer.scanner;

public class InitialState implements FiniteStateAutomaton {
  private String sourceCode
  private static final InitialState instance = new InitialState();

  public InitialState() {}

  public static InitialState instance() {
    return instance;
  }

  @Override
  public void transition(Scanner scanner) {
    while (!sourceCode.isEmpty()) {
      for (int i = 0; i < sourceCode.length(); i++) {
        char currentChar = sourceCode.charAt(i);
        if (Character.isWhitespace(currentChar)) {
          ignoreWhiteSpace();
          continue;
        } else if (Character.isComment(currentChar)) {
          ignoreComment();
          continue;
        } else if (Character.isRegexMatch(currentChar)) {
          scanner.setState(NextState.instance());
        } else if (Character.isDefault(currentChar)) {
          scanner.setState(AcceptState.instance());
        } else {
          throw new Exception("The input of source code is invalid.");
        }
      }
    }
  }

  private String ignoreWhiteSpace() {
    return sourceCode.replaceAll("\\s+", "");
  }

  private boolean isComment(char currentChar) {
    if (currentChar == ("/*")) {
      return true;
    }
  }

  private String ignoreComment() {
    return sourceCode.replaceAll( "//.*|(\"(?:\\\\[^\"]|\\\\\"|.)*?\")|(?s)/\\*.*?\\*/", "$1 " );
  }

  private boolean isRegexMatch() {

  }
}

