package tokenizer.scanner;

public class InitialState extends State {
  private static final InitialState instance = new InitialState();

  public InitialState(Scanner scanner) {
    super(scanner);
  }

  private InitialState() {}

  public static InitialState getInstance() {
    return instance;
  }

  @Override
  public void updateState(Scanner scanner, char currentChar) {
    String sourceCode = scanner.getSourceCode();
    for (int i = 0; i < sourceCode.length(); i++) {
      currentChar = sourceCode.charAt(i);
      scanner.setState(TransitionState.getInstance());
    }
  }
 }
