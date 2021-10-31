package tokenizer.scanner;

public class InitialState implements State {
  private static final InitialState instance = new InitialState();

  private InitialState() {}

  public static InitialState getInstance() {
    return instance;
  }

  @Override
  public void updateState(Scanner scanner) {
    String sourceCode = scanner.getSourceCode();
    while (sourceCode.length() > 0) {
      scanner.setActiveState(TransitionState.getInstance());
    }
  }
 }
