package tokenizer.scanner;

public class Accept extends SuperState {
  private static final Accept instance = new Accept();

  public Accept(StateMachine stateMachine) {
    super(stateMachine);
  }

  private Accept() {}

  public static Accept getInstance() {
    return instance;
  }

  @Override
  public void updateState() {
  }
}
