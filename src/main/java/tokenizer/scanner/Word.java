package tokenizer.scanner;

public class Word extends SuperState {
  private static final Word instance = new Word();

  public Word(StateMachine stateMachine) {
    super(stateMachine);
  }

  private Word() {}

  public static Word getInstance() {
    return instance;
  }

  @Override
  public void updateState() {
  }
}
