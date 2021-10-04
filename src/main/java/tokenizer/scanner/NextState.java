package tokenizer.scanner;

public class NextState implements FiniteStateMachine {
  private static NextState instance = new NextState();

  private NextState() {
  }

  public static NextState instance() {
    return instance;
  }

  @Override
  public void performTransition(ScannerContext context, String inputStream) {
    context.setState(AcceptState.instance());
  }
}
