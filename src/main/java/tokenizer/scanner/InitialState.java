package tokenizer.scanner;

public class InitialState implements FiniteStateMachine {
  private ScannerContext scanner;
  private RegexPattern regexPattern;

  private static final InitialState instance = new InitialState();

  public InitialState() {}

  public static InitialState instance() {
    return instance;
  }

  @Override
  public void performTransition() {
    Character firstChar = this.startOnFirstChar();
    Character lastChar = inputStream.charAt(inputStream.length() -1);
    for (int i = 0; i < inputStream.length(); i++) {
      if (firstChar.equals(lastChar)) {
        scanner.matchWithPattern();
        scanner.setState(AcceptState.instance());
      } else {
        scanner.setState(NextState.instance());
      }
    }
  }  
  
  private Character startOnFirstChar() {
    if (scanner.getInputStream().isEmpty()) {
      throw new NullPointerException("Input stream is empty.");
    } else {
      return scanner.getInputStream().charAt(0);
    }
  }
}
