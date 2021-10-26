package tokenizer.scanner;

public abstract class SuperState implements State {
  protected StateMachine stateMachine;

  public SuperState(StateMachine stateMachine) {
    this.stateMachine = stateMachine;
  }

  public SuperState() {}

  public void updateState() {}
}
