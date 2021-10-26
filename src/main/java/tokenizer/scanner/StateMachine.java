package tokenizer.scanner;

public class StateMachine {
  String sourceCode;
  protected State state;

  public StateMachine(String sourceCode) {
    this.sourceCode = sourceCode;
    state = Start.getInstance();
  }

  public StateMachine() {}

  public String getSourceCode() {
    return sourceCode;
  }

  public void setSourceCode(String sourceCode) {
    this.sourceCode = sourceCode;
  }

  public State getState() {
    return state;
  }

  public void setState(State state) {
    this.state = state;
  }

  public void transition() {
    state.updateState();
  }
}
