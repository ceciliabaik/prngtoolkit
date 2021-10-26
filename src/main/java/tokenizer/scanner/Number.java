package tokenizer.scanner;

public class Number extends SuperState {
  private static final Number instance = new Number();

  public Number(StateMachine stateMachine) {
    super(stateMachine);
  }

  private Number() {}

  public static Number getInstance() {
    return instance;
  }

  @Override
  public void updateState() {
  }
}
