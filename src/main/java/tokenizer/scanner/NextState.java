package tokenizer.scanner;

public class NextState implements FiniteStateMachine {
  private RegexPattern regexPattern;
  private ScannerContext scanner;
  
  private static NextState instance = new NextState();

  private NextState() {
  }

  public static NextState instance() {
    return instance;
  }

  @Override
  public void performTransition() {
    int i = 1;
    while (i < inputStream.length()) {
      String nextChar = this.getNextChar();
      if (nextChar.matches(regexPattern.literal())) {
        scanner.setState(this);
      } else if (nextChar.matches(regexPattern.digit())) {
        scanner.setState(this);
      } else if (nextChar.matches(regexPattern.digit())) {
        scanner.setState(this);
      } else if (nextChar.matches(regexPattern.digit())) {
        scanner.setState(AcceptState.instance());
      }
    }
  }

  public String getNextChar() {
    for (int i = 1; i < inputStream.length(); i++) 
      return Character.toString(inputStream.charAt(i + 1));
  }
}