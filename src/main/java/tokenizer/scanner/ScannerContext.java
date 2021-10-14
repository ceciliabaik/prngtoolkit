package tokenizer.scanner;

public class ScannerContext {
  private FiniteStateAutomaton state;

  public ScannerContext() {
    state = InitialState.instance();
  }

  public FiniteStateAutomaton getState() {
    return state;
  }

  public void setState(FiniteStateAutomaton state) {
    this.state = state;
  }

  public void transition() {
    state.transition(this);
  }
}
